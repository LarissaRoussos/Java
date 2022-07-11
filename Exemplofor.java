package Repeticao;

import java.util.Scanner;

public class Exemplofor {

	public static void main(String[] args) {
		Scanner ent= new Scanner(System.in);
		Scanner ler= new Scanner (System.in);
	    int num,contPar=0, contImpar=0;
	    
	    
	    
	    for(int x=1; x<=10; x ++) {
	    	System.out.println("\nDigite o número "+x+":");
	    	num=ler.nextInt();
	    	
	    	if(num%2==0) {
	    		contPar++;
	    	}
	    		if(num%2!=0) {
	    			contImpar++;
	    		}
	    			System.out.println("\nForam digitados números ímpares:"+contImpar);
	    			System.out.println("\nForam digitados números pares:"+contPar);
	    		}
	    	}
}

