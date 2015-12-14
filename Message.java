package lab3zad3;

public class Message {

	private int id;
	private String text;
	private Priority priority;

	public Message(int id, String text, Priority priority) {
		this.id = id;
		this.text = text;
		this.priority = priority;

	}

	@Override
	public String toString() {
		return String.format("Message:%d, %s, %s \n", id, text, priority);

	}

}
