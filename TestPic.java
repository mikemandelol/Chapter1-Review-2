import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class TestPic
{
  public static void main(String[] args) throws Exception
   {
     URL imageLocation = new URL(" https://image.freepik.com/free-vector/hello-greeting_8349.jpg");
     JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));



   }
}