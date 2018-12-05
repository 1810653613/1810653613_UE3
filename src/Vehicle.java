import javax.swing.*;
import java.util.jar.JarEntry;

public class Vehicle
{
    int power;
    double weight;
    String name;

    public void calculatePower ()
    {
    JOptionPane.showMessageDialog(null, "die Leistung beträgt " + power * 1.36 + "PS");
    }

    public String printName()
    {
    return name;
    }
    public Vehicle(int power, double weight, String name)
    {
        this.power=power;
        this.weight=weight;
        this.name=name;
    }

}
