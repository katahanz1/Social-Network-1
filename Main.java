public class Main
{
    public static void main(String[] args)
    {
        MessagePost messagePost = new MessagePost("Jhon", "mensaje");
        PhotoPost photoPost = new PhotoPost("Jane", "Sunset.png", "Insipred sunset!");
        
        NewsFeed newsFeed = new NewsFeed();
        newsFeed.addPost(messagePost);
        newsFeed.addPost(photoPost);

        newsFeed.show();


    }
}