import java.util.ArrayList;

public class Post
{
    private String username;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    public Post(String author)
    {
        System.out.println("Post constructor...");
        username = author;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }
}