import java.util.ArrayList;

public class Post
{
    private String username;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    public Post(String author)
    {
        username = author;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }

    public void like()
    {
        likes++;
    }

    public void unlike()
    {
        if(this.likes < 0)
        {
            this.likes--;
        }
    }

    public void addComment(String text)
    {
        this.comments.add(text);
    }

    private String timeString()
    {
        long current = System.currentTimeMillis();
        long pastMillis = current - timestamp;
        long seconds = pastMillis / 1000;
        long minutes = seconds / 60;

        if(minutes > 0)
        {
            return minutes + " minutes ago";
        }
        else
        {
            return seconds + " seconds ago";
        }
    }

    public void display()
    {
        System.out.println(username);
        System.out.println(timeString());
        System.out.println(likes);
        if (comments.isEmpty()){
            System.out.println("No comments");
        }else{
            System.out.println("Comments: ");
            for(String comment : comments){
                System.out.println(comment);
            }
            
        }
    }
    
    
}

