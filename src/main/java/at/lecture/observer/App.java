package at.lecture.observer;

import at.lecture.observer.subscriber.BuySubscriber;
import at.lecture.observer.subscriber.Subscriber;
import at.lecture.observer.subscriber.WaitSubscriber;

public class App {

    private Publisher publisher;

    public App() {
        this.publisher = new Publisher();
    }

    public void start() {
        publisher.addSubscriber(new BuySubscriber());
        publisher.addSubscriber(new BuySubscriber());
        publisher.addSubscriber(new BuySubscriber());
        Subscriber s1 = new WaitSubscriber();
        publisher.addSubscriber(s1);
        publisher.send("Phone");
        publisher.send("Television");

        publisher.removeSubscriber(s1);
        publisher.send("Phone");
    }
}
