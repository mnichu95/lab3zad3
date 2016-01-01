package lab3zad3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Queue {
	static List<Message> list = new LinkedList<>();
    static final int HOW = 4;

	public void sending() {

		for (int i = 0; i < HOW; i++) {
			list.add(new Message(1,"K", Priority
					.valueOf("LOW")));
		}
		
	}

	public String readLine() {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		return text;
	}



}
