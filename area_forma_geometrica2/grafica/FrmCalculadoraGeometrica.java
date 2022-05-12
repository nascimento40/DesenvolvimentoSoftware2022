package grafica;

import java.awt.*;

import javax.swing.*;

public class FrmCalculadoraGeometrica extends JFrame{
    private JTextField txtCircunferenciaRaio;
    private JTextField txtCircunferenciaArea;
    private JTextField txtRetanguloBase;
    private JTextField txtRetanguloAltura;
    private JTextField txtRetanguloArea;
    private JTextField txtTrianguloBase;
    private JTextField txtTrianguloAltura;
    private JTextField txtTrianguloArea;
    private JButton btnCircunferenciaCalcularArea;
    private JButton btnRetanguloCalcularArea;
    private JButton btnTrianguloCalcularArea;


    public FrmCalculadoraGeometrica() {
        setSize(new Dimension(720, 200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10));
        JPanel pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Círculo"));
        add(pnl);
        pnl.setLayout(new GridLayout(1, 5, 10, 50));
        pnl.add(new JLabel("Raio:"));
        txtCircunferenciaRaio = new JTextField();
        pnl.add(txtCircunferenciaRaio);
        btnCircunferenciaCalcularArea = new JButton("Calcular:");
        pnl.add(btnCircunferenciaCalcularArea);
        pnl.add(new JLabel("Área:"));
        txtCircunferenciaArea = new JTextField();
        pnl.add(txtCircunferenciaArea);

        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Retângulo"));
        add(pnl);

        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Triângulo"));
        add(pnl);
    }
}
