package Atividades;

import java.util.*;
public class Exercicio2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Declara��o de variaveis
	    String C;
	    float N, E=0, S, calculo;
	    Scanner ler = new Scanner(System.in);

	    //entradas de dados
	    System.out.printf("Qual o nome do oper�rio? ");
	    C = ler.nextLine();
	    System.out.printf("\nDigite a quantidade de horas trabalhadas:");
	    N = ler.nextFloat();

	    //condicionais
	    if(N<50) {
	        S=10*N;
	        System.out.printf("\nO sal�rio do oper�rio %s ", C);
	        System.out.printf("� de R$ %f", S);
	    }
	    else {
	        E=(N-50)*20;
	        S=10*50;
	        calculo = E+S;
	        System.out.printf("\nO salario do operario %s", C);
	        System.out.printf(" � R$ %f ", calculo);
	        System.out.printf(" O salario excedente � R$ %f ", E);
	    }
	    }

	}
			       
			       
	