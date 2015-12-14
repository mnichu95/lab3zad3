package lab3zad3;


public class ReceiveFifo extends MyAbstract {

	Queue queue = new Queue();

	@Override
	public void receiving() {
		for (int i = 0; i < queue.list.size(); i++) {
			queue.list.get(i);
		}
		queue.list.clear();

	}

}
