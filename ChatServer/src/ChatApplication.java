
public class ChatApplication {
	public static void main( String[] args )
    {
        System.out.println( "Sending POST to GCM" );

        String apiKey = "AIzaSyAotRgvWsuuAmzmZnY6pqVTux4kcNbH4HM";
        Content content = createContent();

        Post.post(apiKey, content);
    }

    public static Content createContent(){

        Content c = new Content();

        c.addRegId("APA91bFqnQzp0z5IpXWdth1lagGQZw1PTbdBAD13c-UQ0T76BBYVsFrY96MA4SFduBW9RzDguLaad-7l4QWluQcP6zSoX1HSUaAzQYSmI93....");
        c.createData("Test User", "Test Message");

        return c;
    }
}
