import java.util.ArrayList;

public class NewsFeed {
	public ArrayList<Post> posts;
	
	public NewsFeed() {
		posts = new ArrayList<>();
	}

	public void addPost(Post post){posts.add(post);}
	public void show() {
		for(Post post : posts){
			System.out.println("---------------------");
			post.display();
			System.out.println();
		}
	}


}
