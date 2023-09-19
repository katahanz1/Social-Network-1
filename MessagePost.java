public class MessagePost extends Post{
    private String message;

    public MessagePost(String author, String text)
    {
        super(author);
        System.out.println("message constructor");
        this.message = text;
    }

    public void display()
    {
        System.out.println("Message = " + message);

    }
}