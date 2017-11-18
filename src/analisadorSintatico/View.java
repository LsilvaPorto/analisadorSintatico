package analisadorSintatico;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		
		String expression;
		Scanner scanner = new Scanner(System.in);
		Stack stack = new Stack();;
		char[] array;
		
		System.out.println("Informe a expressão a ser testada: ");
		expression = scanner.nextLine();
		
		array = new char[expression.length()];
		array = expression.toCharArray();
		
		stack.insert(array); 
		
		
		

	}

}
