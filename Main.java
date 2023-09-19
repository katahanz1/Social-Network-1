public class Main
{
    public static void main(String[] args)
    {
        MessagePost messagePost = new MessagePost("Jhon", "mensaje");
        PhotoPost photoPost = new PhotoPost("Jane", "Sunset.png", "Insipred sunset!");
        messagePost.display();
        photoPost.display();


    }
}