import java.net.URL;
import java.net.URLConnection;

public class URLconnection {
    public static void main (String args[]) throws Exception{
        int c;

        URL hp = new URL("http://www.google.com");
        URLConnection hpCon = hp.openConnection();

        System.out.println("Content type" + hpCon.getContent());
        Long len = (long) hpCon.getContentLength();

        if (len == -1){
            System.out.println("სიგრძის შესახებ ინფორმაცია მიუწვდომელია");
        }else
            System.out.println("სიგრძე" + len);

        }
    }

