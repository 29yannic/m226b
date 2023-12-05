import java.util.ArrayList;

public class MessagePost extends Post{

	private String message;

	public MessagePost(String author, String text) {
		super(author);
		message = text;
	}

	public String getText() {
		return message;
	}

	public void display() {
		super.display();
		System.out.println("Message " + message);
	}
}