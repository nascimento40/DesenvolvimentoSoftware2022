package logica;

import java.awt.event.*;
import javax.swing.*;
import grafica.JogoDaMemoria;

public class Eventos_JogoDaMemoria implements ActionListener{
    int Cont_Acertos,Primeiro_Click,Segundo_Click;
    int Numero_Click, posi, cont, pontos_Anterior, Maior_Pontuacao_do_Jogador;
    int Partidas_jogadas = 0, Numero_de_Vitorias = 0;
    int pontos;
    boolean Novo_Jogo = true;
    boolean Re_Iniciar = false;
    boolean Fim_de_Jogo = false;
    private final JogoDaMemoria jogoDaMemoria;
    public Eventos_JogoDaMemoria(JogoDaMemoria jogoDaMemoria) {
        this.jogoDaMemoria = jogoDaMemoria;
    }
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == this.jogoDaMemoria.Button_Novo_Jogo){
            Novo_Jogo = true;
            Re_Iniciar = false;
        }
        if (event.getSource() == this.jogoDaMemoria.Button_Re_Iniciar_Jogo){
            Novo_Jogo = true;
            Re_Iniciar = true;
        }
        if (Novo_Jogo) {
            Cont_Acertos = 0;
            Partidas_jogadas++;
            pontos_Anterior = pontos;
            pontos = 100;
            Numero_Click = 0;
            posi = 0; cont = 16;
            Primeiro_Click = 0;
            Segundo_Click = 0;
            for (int i=0; i<16; ++i){
                this.jogoDaMemoria.Escolha[i].setText("");
                this.jogoDaMemoria.Escolha[i].setEnabled(true);
            }
            if (!Re_Iniciar) {
                for (int i=0; i<16; ++i) {
                    this.jogoDaMemoria.Posicao_do_vetor_Aleatorio[i] = i;
                }
                for (int i=0; i<8; ++i) {
                    for (int j=0; j<2; ++j) {
                        posi = this.jogoDaMemoria.RandomNumber.nextInt(cont);
                        this.jogoDaMemoria.Aleatorio[this.jogoDaMemoria.Posicao_do_vetor_Aleatorio[posi]] = i;
                        if (posi < cont) {
                            for (int q=(posi+1); q<(cont); ++q) {
                                this.jogoDaMemoria.Posicao_do_vetor_Aleatorio[q-1] = this.jogoDaMemoria.Posicao_do_vetor_Aleatorio[q];
                            }
                        } cont--;
                    }
                }
            }
            Novo_Jogo = false;
        }
        for (int i=0; i<16; ++i){
            if (event.getSource() == this.jogoDaMemoria.Escolha[i]){
                this.jogoDaMemoria.Escolha[i].setText(String.valueOf(this.jogoDaMemoria.Aleatorio[i]));
                this.jogoDaMemoria.Escolha[i].setEnabled(false);
                this.jogoDaMemoria.Escolha[i].setVisible(true);
                Numero_Click++;
                if (Numero_Click == 1) Primeiro_Click = i;
                if (Numero_Click == 2){
                    Segundo_Click = i;
                    if (this.jogoDaMemoria.Aleatorio[Primeiro_Click] != this.jogoDaMemoria.Aleatorio[Segundo_Click]){
                        pontos-=3;
                        JOptionPane.showMessageDialog(this.jogoDaMemoria, "Errado");
                        this.jogoDaMemoria.Escolha[Primeiro_Click].setText("");
                        this.jogoDaMemoria.Escolha[Segundo_Click].setText("");
                        this.jogoDaMemoria.Escolha[Primeiro_Click].setEnabled(true);
                        this.jogoDaMemoria.Escolha[Segundo_Click].setEnabled(true);
                    }  else {
                        Cont_Acertos++;
                        pontos+=5;
                    }
                    Numero_Click = 0;
                }
            }
        }
        if (Cont_Acertos == 8){
            Numero_de_Vitorias++;
            Cont_Acertos = 0;
            if (pontos > pontos_Anterior) Maior_Pontuacao_do_Jogador = pontos;
            Fim_de_Jogo = true;
        }
        if (pontos < 0) pontos = 0;
        this.jogoDaMemoria.Pontuacao_do_Jogador.setText("Pontos: " + pontos);
        if (Fim_de_Jogo) {
            this.jogoDaMemoria.Estatisticas_Jogo(Partidas_jogadas, Numero_de_Vitorias, Maior_Pontuacao_do_Jogador);
            Fim_de_Jogo = false;
        }
    }
}