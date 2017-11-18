package analisadorSintatico;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		
		String expression;
		Scanner scanner = new Scanner(System.in);
		int edge;
		char[] array;
		
		System.out.println("Informe a expressão a ser testada: ");
		expression = scanner.nextLine();

		array = new char[expression.length()];
		array = expression.toCharArray();
		edge = array.length;
		
		Stack stack = new Stack(edge);
		Validation validation = new Validation();
		
		validation.loop(array);
		
		
		

	}

}
