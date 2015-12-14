package lab3zad3;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // dziêki temu testy wykonuja sie po kolei

public class Test1 {

	ReceiveFifo receivefifo = new ReceiveFifo();
	ReceiveLifo receivelifo = new ReceiveLifo();
	Queue queue = new Queue();

	@Before
	public void method() {
		queue.list.clear();
	}

	@Test
	public void aIsEmptyOnStart() {
		assertEquals(0, this.receivefifo.queue.list.size());
	}

	@Test(expected = InputMismatchException.class)
	public void bIsInputMismatchException() {
		queue.sending();

	}

	@Test(expected = IllegalArgumentException.class)
	public void cIsIllegalArgumentException() {
		queue.sending();

	}

	@Test(timeout = 100)
	public void dMaxTimeToSending() {
		queue.sending();

	}

	@Test
	public void eSizeOfListAfterSending() {
		queue.sending();
		assertEquals(queue.HOW, this.queue.list.size());
	}

	@Test
	public void fEqualsTransmissionListtoFifoAndLifo() {
		queue.sending();
		assertEquals(this.receivefifo.queue.list.size(),
				this.receivelifo.queue.list.size());
	}

	@Test(timeout = 200)
	public void gMaxTimeToSendingAndRecevingFifo() {
		queue.sending();
		receivefifo.receiving();

	}

	@Test(timeout = 200)
	public void hMaxTimeToSendingAndRecevingLifo() {
		queue.sending();
		receivelifo.receiving();

	}

	@Test
	public void iIsEmptyAfterReceivingFifo() {
		queue.sending();
		receivefifo.receiving();
		assertEquals(0, this.receivefifo.queue.list.size());
	}

	@Test
	public void jIsEmptyAfterReceivingLifo() {
		queue.sending();
		receivefifo.receiving();
		assertEquals(0, this.receivelifo.queue.list.size());
	}

}
