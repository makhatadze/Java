import com.sun.jdi.Value;

import javax.swing.*;

public class HomeWork01 {

    public static double km2Mile(double klm) {
        return klm / 1.6;
    }

    public static double mile2Km(double miles) {
        return miles * 1.6;
    }

    public static double celsius2Fahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheit2Celsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kg2Lbs(double kg) {
        return kg * 2.20462;
    }

    public static double lbs2Kg(double lbs) {
        return lbs / 2.20462;
    }

    public static void main(String[] args) {
        JTextField Kilometer = new JTextField(5);
        Kilometer.setText("0");
        JTextField Miles = new JTextField(5);
        Miles.setText("0");
        JTextField Celsius = new JTextField(5);
        Celsius.setText("0");
        JTextField Fahrenheit = new JTextField(5);
        Fahrenheit.setText("0");
        JTextField Kilogram = new JTextField(5);
        Kilogram.setText("0");
        JTextField Pound = new JTextField(5);
        Pound.setText("0");


        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("kilometer"));
        myPanel.add(Kilometer);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("miles"));
        myPanel.add(Miles);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("celsius"));
        myPanel.add(Celsius);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("fahrenheit"));
        myPanel.add(Fahrenheit);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("kilogram"));
        myPanel.add(Kilogram);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Pound"));
        myPanel.add(Pound);


        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Input value must be number !!!!!!!!!!!! else program Error!!!", JOptionPane.OK_CANCEL_OPTION);

        // Parse double all input value

        // kilometer
        String klmStr = Kilometer.getText();
        double klmDouble = Double.parseDouble(klmStr);

        // Miles
        String mlsStr = Miles.getText();
        double mlsDouble = Double.parseDouble(mlsStr);

        // Celsius
        String clsStr = Celsius.getText();
        double clsDouble = Double.parseDouble(clsStr);

        // Fahrenheit
        String fahStr = Fahrenheit.getText();
        double fahDouble = Double.parseDouble(fahStr);

        // Kilogram
        String kgStr = Kilogram.getText();
        double kgDouble = Double.parseDouble(kgStr);

        // Pound
        String poundStr = Pound.getText();
        double poundDouble = Double.parseDouble(poundStr);


        if (result == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(
                    null,
                    klmDouble + " Kilometer = " + km2Mile(klmDouble) + " miles \n" +
                            mlsDouble + " Miles = " + mile2Km(mlsDouble) + " Kilometer \n" +
                            clsDouble + " Celsius = " + celsius2Fahrenheit(clsDouble) + " Fahrenheit \n" +
                            fahDouble + " Fahrenheit = " + fahrenheit2Celsius(fahDouble) + " Celsius \n" +
                            kgDouble + " Kilogram = " + kg2Lbs(kgDouble) + " Pound \n" +
                            poundDouble + " Pound =" + lbs2Kg(poundDouble) + " Kilogram"
            );
        }

    }

}
