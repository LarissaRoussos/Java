package Repeticao;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int n1, soma=0, media=0, cont=0;
		
		do {
			System.out.println("\nDigite um número:");
			n1=ler.nextInt();
			
			if(n1%3==0 && n1!=0) {
				soma=soma + n1;
				cont++;
			}
		    }while(n1!=0);
				System.out.println("\nA média dos multiplos de 3 é:"+soma/cont);
			}
	}

