package observable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObservableTest {
    private Observable observable;

    @Before
    public void setUp() throws Exception {
        observable = new Observable();
    }

    @Test
    public void addObserver() throws Exception {
        observable.addObserver(new Customer());
        assertEquals(1, observable.getObservers().size());
    }

    @Test
    public void removeObserver() throws Exception {
        Customer customer = new Customer();
        observable.addObserver(customer);
        observable.removeObserver(customer);
        assertEquals(0, observable.getObservers().size());
    }

    @Test
    public void notifyObservers() throws Exception {
        observable.addObserver(new Customer());
        observable.notifyObservers();
    }
}
