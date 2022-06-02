package grafica;

import java.awt.*;
import java.util.Random;
import javax.swing.*;
import logica.Eventos_JogoDaMemoria;

public class JogoDaMemoria extends JFrame {
    int pontos = 100;
    public Random RandomNumber = new Random();
    public int Aleatorio[] = new int [16];
    public int Posicao_do_vetor_Aleatorio[] = new int [16];
    public JToolBar Barra_Ferramenta = new JToolBar();
    public JButton Button_Novo_Jogo = new JButton("Novo Jogo");
    public JButton Button_Re_Iniciar_Jogo = new JButton("Reiniciar partida");
    public JPanel Panel = new JPanel();
    public GridLayout Layout_do_Jogo = new GridLayout(4,4);
    public Font Fonte = new Font("Lucida Console", Font.BOLD, 36);
    public JButton Escolha[] = new JButton[16];
    public JPanel Barra_de_Status = new JPanel();
    public JLabel Pontuacao_do_Jogador = new JLabel("Pontos: 100");
    public JogoDaMemoria() {
        super("Jogo da Memória");
        Barra_Ferramenta.add(Button_Novo_Jogo);
        Barra_Ferramenta.add(Button_Re_Iniciar_Jogo);
        add(Barra_Ferramenta, BorderLayout.NORTH);
        for (int i=0; i<16; ++i){

            Escolha[i] = new JButton();
            Panel.add(Escolha[i]);
            Escolha[i].setFont(Fonte);
            Escolha[i].setVisible(true);
        }
        Panel.setLayout(Layout_do_Jogo);
        add(Panel, BorderLayout.CENTER);
        Barra_de_Status.add(Pontuacao_do_Jogador);
        add(Barra_de_Status, BorderLayout.SOUTH);
        Eventos_JogoDaMemoria Handler = new Eventos_JogoDaMemoria(this);
        for (int i=0; i<16; ++i){
            Escolha[i].addActionListener(Handler);
        }
        Button_Novo_Jogo.addActionListener(Handler);
        Button_Re_Iniciar_Jogo.addActionListener(Handler);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    public void Estatisticas_Jogo(int Partidas_jogadas, int Numero_de_Vitorias, int Maior_Pontuacao_do_Jogador){
        JOptionPane.showMessageDialog(JogoDaMemoria.this, "Partidas jogadas: " + Partidas_jogadas +
        "\nVitórias: " + Numero_de_Vitorias +
        "\nMaior Pontuação do Jogador: " + Maior_Pontuacao_do_Jogador);
    }
}
