package grafica;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextField;

import logica.Circulo;
import logica.Retangulo;
import logica.Triangulo;

public class ActionCalculadora extends AbstractAction {
    public enum OpcaoForma {
        CIRCULO,
        RETANGULO,
        TRIANGULO,
    }

    private JTextField txtRaio;
    private JTextField txtBase;
    private JTextField txtAltura;
    private JTextField txtArea;
    private OpcaoForma opcaoforma;
    public ActionCalculadora(JTextField txtRaio, OpcaoForma opcaoforma, JTextField txtArea) {
        this.txtRaio = txtRaio;
        this.opcaoforma = opcaoforma;
        this.txtArea = txtArea;
    }
    public ActionCalculadora(JTextField txtBase, JTextField txtAltura, OpcaoForma opcaoforma) {
        this.txtBase = txtBase;
        this.txtAltura = txtAltura;
        this.opcaoforma = opcaoforma;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (this.opcaoforma) {
            case CIRCULO:
            double raio = Double.parseDouble(txtRaio.getText());
            Circulo circulo = new Circulo(raio);
            double area = circulo.calcularArea();
            txtArea.setText(String.format("%f", area));
            break;
            case TRIANGULO:
            double base = Double.parseDouble(txtBase.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            Triangulo triangulo = new Triangulo(base, altura);
            area = triangulo.calcularArea();
            txtArea.setText(String.format("%f", area));
            break;
            case RETANGULO:
            base = Double.parseDouble(txtBase.getText());
            altura = Double.parseDouble(txtAltura.getText());
            Retangulo retangulo = new Retangulo(base, altura);
            area = retangulo.calcularArea();
            txtArea.setText(String.format("%f", area));
            break;
        }
    }
}
