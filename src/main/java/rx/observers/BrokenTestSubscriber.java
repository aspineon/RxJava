package rx.observers;

import rx.Observer;

public class BrokenTestSubscriber<T> extends TestSubscriber<T> {

    public BrokenTestSubscriber(Observer<T> delegate) {
        super(delegate);
    }

    @Override
    public void onNext(T t) {
        super.onNext(t);
        throw new IllegalArgumentException("I don't believe in observables");
    }
}
