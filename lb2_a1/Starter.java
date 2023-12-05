
public class Starter {

	public static void main(String[] args) {
		NewsFeed news = new NewsFeed();
		
		MessagePost post1 = new MessagePost("john", "Had a great day up in Zermatt! (message)");
		post1.like();
		post1.like();
		post1.addComment("Cool!");

		EventPost post2 = new EventPost("ben", 2, "Turnevent at Zürich (event)");
		post2.like();
		post2.like();
		post2.like();
		post2.addComment("AWESOME!");
		post2.addComment("IM COMMING!");

		PhotoPost post3 = new PhotoPost("dave", "welcome.png", "HELLO AND WELCOME TO THE TURNEVENT AT ZURICH (photo)");
		post3.like();
		post3.addComment("THANK YOU FOR SHARING!");

		news.addPost(post1);
		news.addPost(post2);
		news.addPost(post3);
		news.show();
	}

}
