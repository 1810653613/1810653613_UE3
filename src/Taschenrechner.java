import javax.swing.*;

public class Taschenrechner
{
    public static void Addieren()
    {
    double b=Double.parseDouble(JOptionPane.showInputDialog("bitte geben sie eine beliebige Zahl ein welche Addiert werden soll"));
    double c=Double.parseDouble(JOptionPane.showInputDialog("bitte geben sie eine weitere beliebige Zahl ein"));
        System.out.println(b+c);
    }
    public static void Subtrahieren()
    {
    double d=Double.parseDouble(JOptionPane.showInputDialog("bitte geben sie eine beliebige Zahl ein welche Subtrahiert werden soll"));
    double e=Double.parseDouble(JOptionPane.showInputDialog("bitte geben sie eine weitere beliebige Zahl ein"));
    System.out.println(d-e);
    }
    public static void Mulitplizieren()
    {
    double f=Double.parseDouble(JOptionPane.showInputDialog("bitte geben sie eine beliebige Zahl ein welche Multipliziert werden soll"));
    double g=Double.parseDouble(JOptionPane.showInputDialog("bitte geben sie eine weitere beliebige Zahl ein"));
    System.out.println(f*g);
    }
    public static void Dividieren()
    {
    double h=Double.parseDouble(JOptionPane.showInputDialog("bitte geben sie eine beliebige Zahl ein welche Dividiert werden soll"));
    double i=Double.parseDouble(JOptionPane.showInputDialog("bitte geben sie eine weitere beliebige Zahl ein"));
    System.out.println(h/i);
    }
}
