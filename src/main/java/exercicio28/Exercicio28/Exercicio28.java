package exercicio28.Exercicio28;

import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Exercicio28 {

    public static void main(String[] args) {
        //montando vetores e atribuindo valores
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição [" + i + "][" + j + "]:"));
            }
        }
        //soma dos elementos da primeira coluna
        int somac0 = 0;
        for (int i = 0; i < 3; i++) {
            somac0 += matriz[i][0];
        }
        JOptionPane.showMessageDialog(null, "A soma dos valores de c0 é: " + somac0);

        //soma da segunda coluna
        int somac1 = 0;
        for (int i = 0; i < 3; i++) {
            somac1 += matriz[i][1];
        }
        JOptionPane.showMessageDialog(null, "A soma dos valores de c1 é: " + somac1);

        //soma da terceira coluna
        int somac2 = 0;
        for (int i = 0; i < 3; i++) {
            somac2 = somac2 + matriz[i][2];
        }
        JOptionPane.showMessageDialog(null, "A soma dos valores de c2 é: " + somac2);

        //soma da primeira linha
        int somal0 = 0;
        for (int j = 0; j < 3; j++) {
            somal0 = somal0 + matriz[0][j];
        }
        JOptionPane.showMessageDialog(null, "A soma dos valores de l0 é: " + somal0);

        //soma total de toda a matriz
        int somat = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somat = somat + matriz[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "A soma de todos os valores é: " + somat);

        //mostra a media total ta matriz
        double media = 0;
        media = somat / 9;

        //mostra o numero maior que a media
        String maioresm = "Maior que a média:\n";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > media) {
                    maioresm = maioresm + matriz[i][j] + "\n";

                }
            }
        }
        JOptionPane.showMessageDialog(null, maioresm);

        //mostra o maior numero da matriz
        int maior = matriz[0][0];
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Maior valor: " + maior + "\nPosição: [" + linha + "][" + coluna + "]");

        //mostra o menor elemento da matriz
        int menor = matriz[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Menor valor: " + menor + "\nPosição: [" + linha + "][" + coluna + "]");

        //mostra a soma da linha diagonal
        int somad = 0;
        for (int i = 0; i < 3; i++) {
            somad += matriz[i][i];

        }
        JOptionPane.showMessageDialog(null, "A soma da diagonla é: " + somad);

        int somad2 = 0;
        for (int i = 0; i < 3; i++) {
            somad2 += matriz[i][i - 2];
        }
        
        /* */
    }
}
