import java.awt.*;
import javax.swing.*;
public class Finestra extends JFrame {
    private JPanel p;
    private JLabel lblInteressi, lblOpzioni, lblCitta;
    private JCheckBox chk1, chk2;
    private JRadioButton[] rad;
    private ButtonGroup btnGrp1;
    private JComboBox cmbCitta;
    private JButton btnInvia;
    private JTextArea textArea1;
    private String[] opzioni = {"Opzione 1", "Opzione 2", "Opzione 3"};
    private String[] citta = {"Roma", "Milano", "Napoli", "Palermo"};

    Finestra() {
        p = new JPanel();
        p.setLayout(new GridLayout(11, 1, 10, 10));
        lblInteressi = new JLabel("Seleziona i tuoi interessi");
        p.add(lblInteressi);
        chk1 = new JCheckBox("Interesse A");
        p.add(chk1);
        chk2 = new JCheckBox("Interesse B");
        p.add(chk2);
        lblOpzioni = new JLabel("Scegli la tua opzione");
        p.add(lblOpzioni);
        btnGrp1 = new ButtonGroup();
        rad = new JRadioButton[opzioni.length];
        for (int i = 0; i < rad.length; i++) {
            rad[i] = new JRadioButton(opzioni[i]);
            btnGrp1.add(rad[i]);
            p.add(rad[i]);
        }
        lblCitta = new JLabel("Scegli la città");
        p.add(lblCitta);
        cmbCitta = new JComboBox(citta);
        p.add(cmbCitta);
        btnInvia = new JButton("INVIA");
        p.add(btnInvia);
        textArea1 = new JTextArea(3, 30);
        p.add(textArea1);
        this.getContentPane().add(p);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
