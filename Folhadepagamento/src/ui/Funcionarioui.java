package ui;

import java.util.Scanner;

import core.Funcionario;

public class Funcionarioui {
public static void main(String[] args) {
	
	Funcionario f;
	f = new Funcionario();
	
	int zero=0;
	String nome; 
	int matricula;
	int cargo=1;
	
	Scanner valor = new Scanner(System.in);
	
	System.out.println("Digite seu nome:");
	nome = valor.next();
	f.setNome(nome);
	
	System.out.println("Digite sua matr�cula: ");
	matricula = valor.nextInt();
	f.setRegistro(matricula);
	
	do {
		
		System.out.println("Selecione qual seu cargo: \n"
							+ "1 - Comissionado \n"  
							+ "2 - Empreiteiro \\n" 
							+ "3 - Horista \n"  
							+ "4 - Funcion�rio \n" 
							+ "0 - Para finalizar");
		cargo = valor.nextInt();
		switch(cargo) {
		case: 1
		}
		
		
	}while (zero != 0);
	
	
}
}
