import java.util.ArrayList;

public class EventPost extends Post{
    private int pages;
    private String caption;

    public EventPost(String author, int pages, String caption) {
        super(author);
        this.pages = pages;
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public void display() {
        super.display();
        System.out.println("Caption " + caption);

    }
}
