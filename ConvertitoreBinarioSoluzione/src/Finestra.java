import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Finestra extends JFrame
{
    private JPanel panel, p01, pWest, pCenter, pEast;
    private JLabel lbTitolo, lbDecimale, lbBinario;
    private JButton btn0, btn1, btnConverti, btnCancella;
    private JTextArea txtDecimale, txtBinario;
    private Convertitore convertitore;

    Finestra() {
        convertitore = new Convertitore();

        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        p01 = new JPanel();
        p01.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        lbTitolo = new JLabel("Convertitore Binario-Decimale");
        lbDecimale = new JLabel("Decimale");
        lbDecimale.setHorizontalAlignment(SwingConstants.CENTER);
        lbBinario = new JLabel("Binario");
        lbBinario.setHorizontalAlignment(SwingConstants.CENTER);
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btnConverti = new JButton("Converti");
        btnCancella = new JButton("Cancella");
        txtDecimale = new JTextArea(1, 10);
        txtBinario = new JTextArea(1, 10);

        // Creazione dei pulsanti
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btnConverti = new JButton("Converti");
        btnCancella = new JButton("Cancella");

        btn0.setPreferredSize(new Dimension(80, 30));
        btn1.setPreferredSize(new Dimension(80, 30));
        btnConverti.setPreferredSize(new Dimension(100, 35));
        btnCancella.setPreferredSize(new Dimension(100, 35));

        p01 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        p01.add(btn0);
        p01.add(btn1);

        pCenter = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        pCenter.add(btnConverti);
        pCenter.add(btnCancella);

        pWest = new JPanel();
        pWest.setLayout(new BoxLayout(pWest, BoxLayout.Y_AXIS));
        pWest.add(lbBinario);
        pWest.add(txtBinario);
        pWest.add(p01);

        pEast = new JPanel();
        pEast.setLayout(new BoxLayout(pEast, BoxLayout.Y_AXIS));
        pEast.add(lbDecimale);
        pEast.add(txtDecimale);

        // Aggiunta al pannello principale
        panel.add(pWest, BorderLayout.WEST);
        panel.add(pCenter, BorderLayout.CENTER);
        panel.add(pEast, BorderLayout.EAST);

        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);
        this.setVisible(true);

        btnConverti.addActionListener(event -> {
            String binario = txtBinario.getText().trim();
            int decimale = convertitore.convertiBinarioDecimale(binario);

            if (decimale == -1) {
                System.out.println("Errore. Inserisci solo cifre binarie (0 e 1).");
            } else {
                txtDecimale.setText(String.valueOf(decimale));
            }
        });

        btnCancella.addActionListener(event -> {
            txtBinario.setText("");
            txtDecimale.setText("");
        });

        btn0.addActionListener(event -> txtBinario.append("0"));

        btn1.addActionListener(event -> txtBinario.append("1"));

    }
}