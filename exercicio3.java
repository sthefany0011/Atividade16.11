package Atividades;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner ler = new Scanner(System.in);
	        int a, b, c, d;
	        //Entrada de dados
	        System.out.printf("Digite o primeiro número: ");
	        a =ler.nextInt();
	        System.out.printf("\nDigite o segundo número: ");
	        b = ler.nextInt();
	        System.out.printf("\nDigite o terceiro número: ");
	        c = ler.nextInt();
	        System.out.printf("\nDigite o quarto número: ");
	        d = ler.nextInt();
	        //Laço
	        a = a*a;
	        b = b*b;
	        c = c*c;
	        d = d*d;

	        if (c >= 1000) {
	            System.out.printf("\nO valor do terceiro número é %d", c);
	        }
	        else {
	            System.out.printf("\nO quadrado do primeiro número é: %d", a);
	            System.out.printf("\nO quadrado do segundo número é: %d", b);
	            System.out.printf("\nO quadrado do terceiro número é: %d", c);
	            System.out.printf("\nO quadrado do quarto número é: %d", d);
	        }
	    }
	}
	
