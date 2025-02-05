import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Finestra extends JFrame
{
    private JPanel panel, pTitle, pRifornimento, pCisterna, pStampa;
    private JLabel lbDistributore, lbRifornimento, lbCisterna, lbStampa;
    private JButton btnRifornimento, btnCisterna, btnStampa;
    private JTextArea txtRifornimento;
    private ButtonGroup btnGrp1;
    private JRadioButton[] radStampa;
    private String[] opzioni_radStampa = {"Distributore", "Auto"};

    Finestra() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        pTitle = new JPanel();
        pTitle.setLayout(new GridLayout(1, 1, 10, 10));
        lbDistributore = new JLabel("Distributore da Sandro");
        pTitle.add(lbDistributore);
        panel.add(pTitle);

        pRifornimento = new JPanel();
        pRifornimento.setLayout(new GridLayout(2, 2, 10, 10));
        lbRifornimento = new JLabel("Effettua rifornimento");
        pRifornimento.add(lbRifornimento);
        txtRifornimento = new JTextArea(3, 30);
        pRifornimento.add(txtRifornimento);
        btnRifornimento = new JButton("INVIA");
        pRifornimento.add(btnRifornimento);
        panel.add(pRifornimento);

        pCisterna = new JPanel();
        pCisterna.setLayout(new GridLayout(2, 1, 10, 10));
        lbCisterna = new JLabel("Riempi cisterna");
        pCisterna.add(lbCisterna);
        btnCisterna = new JButton("RIEMPI");
        pCisterna.add(btnCisterna);
        panel.add(pCisterna);

        pStampa = new JPanel();
        pStampa.setLayout(new BorderLayout());
        lbStampa = new JLabel("Stampa dati");
        pStampa.add(lbStampa, BorderLayout.NORTH);
        btnGrp1 = new ButtonGroup();
        radStampa = new JRadioButton[2];
        radStampa[0] = new JRadioButton(opzioni_radStampa[0]);
        radStampa[1] = new JRadioButton(opzioni_radStampa[1]);
        btnGrp1.add(radStampa[0]);
        btnGrp1.add(radStampa[1]);
        pStampa.add(radStampa[0], BorderLayout.WEST);
        pStampa.add(radStampa[1], BorderLayout.EAST);
        btnStampa = new JButton("STAMPA");
        pStampa.add(btnStampa, BorderLayout.SOUTH);
        panel.add(pStampa);

        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}