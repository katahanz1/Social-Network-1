public class MessagePost extends Post{
    private String message;

    public MessagePost(String author, String text)
    {
        super(author);
        this.message = text;
    }

    public void display()
    {
        System.out.println("Message = " + message);

    }
}