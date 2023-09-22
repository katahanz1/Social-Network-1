public class PhotoPost extends Post
{
    private String filename;
    private String caption;
    
    public PhotoPost(String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
    }

    public void display()
    {
        super.display();
        System.out.println("File name = " + filename + ", caption = " + caption);

    }
}