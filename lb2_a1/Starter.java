
public class Starter {

	public static void main(String[] args) {
		NewsFeed news = new NewsFeed();
		
		MessagePost post1 = new MessagePost("lee", "Its a great day today!");
		post1.like();
		post1.like();
		post1.like();
		post1.like();
		post1.like();
		post1.like();
		post1.like();
		post1.like();

		post1.addComment("Cool!");

		EventPost post2 = new EventPost("yee", 2, "Rave in Zurich");
		post2.like();
		post2.like();
		post2.like();
		post2.addComment("AWESOME!");
		post2.addComment("IM COMMING!");

		PhotoPost post3 = new PhotoPost("beny", "welcome.png", "Welcome to the best Rave in Zurich");
		post3.like();
		post3.addComment("THANK YOU FOR SHARING!");

		news.addPost(post1);
		news.addPost(post2);
		news.addPost(post3);
		news.show();
	}

}
