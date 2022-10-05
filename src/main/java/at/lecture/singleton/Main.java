package at.lecture.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println(logger1);
        System.out.println(logger2);

        Logger.getInstance();


        logger1.info("Hello");
    }
}
