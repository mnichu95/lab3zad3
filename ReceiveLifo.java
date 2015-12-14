package lab3zad3;

public class ReceiveLifo extends MyAbstract {

	Queue queue = new Queue();

	@Override
	public void receiving() {
		for (int i = queue.list.size() - 1; i >= 0; i--) {
			queue.list.get(i);
		}
		queue.list.clear();
	}

}
