package at.lecture.proxy;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class PasswordCheckRequest implements PasswordCheck {

    public boolean hasBeenPawned(String password) {
        String sha1Hash = sha1(password);
        String startHash = sha1Hash.substring(0, 5);
        String endHash = sha1Hash.substring(5);

        Map<String, String> pwHashes = apiRequest(startHash);

        String count = pwHashes.get(endHash);

        if (null == count) {
            return false;
        }

        System.out.printf("Password has been pawned. It was present in %s breach(es)%n", count);
        return true;
    }

    private Map<String, String> apiRequest(String startHash) {
        System.out.println("Requesting API...");

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://api.pwnedpasswords.com/range/%s".formatted(startHash)))
                    .GET()
                    .build();

            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String body = response.body();

            Map<String, String> pwHashes = new HashMap<>();
            for (String hashAndCount: body.split(System.lineSeparator())) {
                String[] infos = hashAndCount.split(":");
                pwHashes.put(infos[0].toLowerCase(), infos[1]);
            }

            return pwHashes;
        } catch (URISyntaxException | InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String sha1(String s) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");

            byte[] messageDigest = md.digest(s.getBytes());

            BigInteger no = new BigInteger(1, messageDigest);

            String hash = no.toString(16);

            while (hash.length() < 32) {
                hash = "0" + hash;
            }

            return hash;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
