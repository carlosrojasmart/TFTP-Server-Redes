import java.io.IOException;
import java.net.SocketException;

public class main {
    public static void main(String[] args) throws IOException
    {
        if (args.length > 0)
        {
            System.err.printf("usage: java %s\n", TFTPServer.class.getCanonicalName());
            System.exit(1);
        }
        /*Starting the server*/
        try
        {
            TFTPServer server= new TFTPServer();
            server.start();
        }
        catch (SocketException e)
        {e.printStackTrace();}
    }
}
