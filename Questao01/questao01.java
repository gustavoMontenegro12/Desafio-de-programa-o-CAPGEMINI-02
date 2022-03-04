package Questao01;

import java.util.ArrayList;

//Exercicio proposto pelo Desafio de programação CAPGEMINI 02 - Questão 01 

public class questao01 {
    public static void main(String[] args) {
       
        ArrayList<Integer> arr = new ArrayList<>();  

        //adicionando os elementos dentro do array
        arr.add(0, 9);
        arr.add(1, 2);
        arr.add(2, 1);
        arr.add(3, 4);
        arr.add(4, 6);
        
        System.out.println(arr);

        //variavel responsavel por somar todos os valores dentro do array
        int soma = 0;

        //laço que pega todos valores e atribuem a variavel soma
        for (int i = 0; i <= 4; i++) {  
            soma += arr.get(i);
            System.out.println("Soma dos valores do array: " + soma);
        }
        
        //variavel será atribuida com o valor de soma divido pelo numero do tamanho do array
        int div = soma / arr.size();
        
        //o resultado é impresso aqui
        System.out.println("\nResultado da divisão: " + div);
        
    }
}
