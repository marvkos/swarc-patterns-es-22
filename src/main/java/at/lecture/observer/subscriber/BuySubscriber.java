package at.lecture.observer.subscriber;

public class BuySubscriber implements Subscriber {

    @Override
    public void notify(String message) {
        System.out.println("I am rich, I will absolutely buy " + message + "!");
    }
}
