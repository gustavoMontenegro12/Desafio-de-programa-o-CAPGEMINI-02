package Questao03;

//Exercicio proposto pelo Desafio de programação CAPGEMINI 02 - Questão 03


public class questao03 {
    public static void main(String[] args) {
        String s = "tenha um bom dia";

        //Este Método retira os espaços da string s
        String semEspaço = s.replaceAll(" ", "");
        
        int tamanhoString = semEspaço.length();
        int sequencia = 0, linha, coluna;
        linha = (int) Math.floor(Math.sqrt(tamanhoString));
        coluna = (int) Math.ceil(Math.sqrt(tamanhoString));

        if (linha * coluna < tamanhoString) {
            linha = coluna;
        }

        char letras[][] = new char[linha][coluna];

        //Conversão da string para o formato grid
        for (int i = 0; i < linha; i++) {
            
            for (int j = 0; j < coluna; j++) {
                if (sequencia < tamanhoString) {
                    letras[i][j] = semEspaço.charAt(sequencia);
                }
                sequencia++;
            }
        }

        //Impressão do grid
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (letras[i][j] == 0) {
                    break;
                }
                System.out.print(letras[i][j]);
            }
            System.out.println("");
        }
    }

}
