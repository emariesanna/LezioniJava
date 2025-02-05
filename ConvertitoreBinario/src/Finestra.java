import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Finestra extends JFrame
{
    private JPanel panel, p01;
    private JLabel lbDecimale, lbBinario;
    private JButton btn0, btn1, btnConverti, btnCancella;
    private JTextArea txtDecimale, txtBinario;
    private JLabel lbEmpty0, lbEmpty1;

    Finestra() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 10, 10));

        p01 = new JPanel();
        p01.setLayout(new GridLayout(1, 2, 10, 10));

        lbEmpty0 = new JLabel("");
        lbEmpty1 = new JLabel("");

        lbDecimale = new JLabel("Decimale");
        lbBinario = new JLabel("Binario");
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btnConverti = new JButton("Converti");
        btnCancella = new JButton("Cancella");
        txtDecimale = new JTextArea(1, 10);
        txtBinario = new JTextArea(1, 10);

        p01.add(btn0);
        p01.add(btn1);

        //prima riga
        panel.add(lbBinario);
        panel.add(txtBinario);
        panel.add(p01);
        //seconda riga
        panel.add(lbEmpty0);
        panel.add(btnConverti);
        panel.add(btnCancella);
        //terza riga
        panel.add(lbDecimale);
        panel.add(txtDecimale);
        panel.add(lbEmpty1);


        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}