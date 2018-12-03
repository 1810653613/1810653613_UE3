import javax.swing.*;
import java.util.jar.JarEntry;

public class Main
{
    public static void main(String[] args)
    {
       partialString("hallo");
    }
    public static void partialString(String a)
    {
        int length= a.length();
        if(length<3)
        {
            System.err.println("Der eingegebene String muss mindestens eine Länge von 3 besitzen.");
        }
        else
        {
            System.out.println(a.substring(a.length()/2));
        }
    }


}
