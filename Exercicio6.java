package Atividades;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
        Scanner ler = new Scanner(System.in);
        //entradas
        System.out.println("Classificação da categoria de nado por idade");
        System.out.println("Digite a idade(de 5 pra cima):");
        idade = ler.nextInt();
        //condicionais
        if (idade >= 5 && idade <=7) {
            System.out.println("O nadador pertence a categoria Infantil A");
        }
        else if (idade >= 8 && idade <= 11) {
            System.out.println("O nadador pertence a categoria Infantil B");
        }
        else if (idade >= 12 && idade <= 13) {
            System.out.println("O nadador pertence a categoria Juvenil A");
        }
        else if (idade >= 14 && idade <= 17) {
            System.out.println("O nadador pertence a categoria Juvenil B");
        } 
        else {
            System.out.println("O nadador pertence a categoria Adulto"); 
        }
	}

}
