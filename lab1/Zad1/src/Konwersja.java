import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Konwersja extends JFrame {
    private JTextField stopnieField;
    private JPanel JPanel1;
    private JButton konwersjaButton;
    private JLabel wynikLabel;
    private JButton zamknijButton;


    public Konwersja() {

        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(5000,5000);
        this.pack();

        konwersjaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double stopnie = Double.parseDouble(stopnieField.getText());
                double wynik = ((stopnie*9)/5)+32;
                wynikLabel.setText(String.valueOf(wynik));
            }
        });
        zamknijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Konwersja Zadanie = new Konwersja();
        Zadanie.setVisible(true);
    }
}
