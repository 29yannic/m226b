import java.util.ArrayList;

public class Post {
    private String username;
    private long timeStamp;
    private int likes;
    private ArrayList<String> comments;

    public Post(String username) {
        this.username = username;
        this.timeStamp = System.currentTimeMillis();
        this.comments = new ArrayList<String>();
        this.likes = 0;
    }

    public void like() {
        likes++;
    }

    public void unlike() {
        if (likes > 0){
            likes--;
        }
    }
    public long getTimeStamp() {
        return timeStamp;
    }

    public void addComment(String text) {
        comments.add(text);
    }
    public String timeString() {

        long current = System.currentTimeMillis();
        long pastMillis = current - timeStamp;
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        long hours = minutes/60;
        if (minutes > 0) {
            return minutes + " minutes ago";
        } else if(hours > 0){
            return hours + " hours ago";
        } else {
            return "a few seconds ago";
        }

    }
    public void display() {

        System.out.println("Username " + username);
        System.out.println("Posted " + timeString());

        if (likes > 0) {
            System.out.println(likes + " people like this.");
        } else {
            System.out.println();
        }
        System.out.println("Comments: ");
        for(String comment : comments){
            System.out.println(comment);
        }

    }
}
