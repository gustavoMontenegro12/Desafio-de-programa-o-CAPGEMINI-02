package Questao02;

import java.util.ArrayList;

public class questao02 {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();

        n.add(0, 1);
        n.add(1, 5);
        n.add(2, 3);
        n.add(3, 4);
        n.add(4, 2);

        int resto;
        int x = 0;


        //laço que verifica os elemntos e encontra os numeros pares com a diferença de 2 numeros através do resto de divisão por 2
        for (int i = 0; i <= 4; i++) {
            n.get(i);
            System.out.println("Index I: " + i + " Valor de i: " + n.get(i));
            for(int j = 0; j <= 4; j++){
                resto = n.get(i) & n.get(j);
                System.out.println("Index J: " + j + " Valor de j: " + n.get(j));
                System.out.println("Resto da divisão: " + resto + "\n");
                if(resto == 2){
                    x++;
                }
            }

        }
        System.out.println("Resultado: Há " + x + " pares nesta lista.");
    }
}
