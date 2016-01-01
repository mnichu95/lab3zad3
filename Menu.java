package lab3zad3;

import java.util.InputMismatchException;

public class Menu {
	static Queue queue = new Queue();
	static ReceiveFifo receivefifo = new ReceiveFifo();
	static ReceiveLifo receivelifo = new ReceiveLifo();

	public static void main(String[] args) {
		while (true) {

			System.out.println("Select: sending or receiving fifo or "
					+ "receiving lifo ");

			String sendingOrReceiving = queue.readLine();
			switch (sendingOrReceiving) {
			case ("sending"):
				try {
					System.out.println("Sending");
					queue.sending();
				} catch (IllegalArgumentException e) {
					System.out.println("not recognized priority");
				} catch (InputMismatchException e) {
					System.out.println("not recognized number");
				}
				;
				break;
			case ("receiving fifo"):
				receivefifo.receiving();
				break;
			case ("receiving lifo"):
				receivelifo.receiving();
				break;

			}

		}
	}
}
