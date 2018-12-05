import javax.swing.*;

public class Aufruf {
    public static void main(String[] args) {

    Vehicle Porsche = new Vehicle(500, 1300, "Porsche");
    Vehicle Mercedes= new Vehicle(400,10000,"Mercedes");

        JOptionPane.showMessageDialog(null,Porsche.printName());
        JOptionPane.showMessageDialog(null,Mercedes.printName());

        Porsche.calculatePower();
        Mercedes.calculatePower();
    }

}



