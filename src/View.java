
import java.util.Scanner;

public class View {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String expression;
		Scanner scanner = new Scanner(System.in);
		int limit;
		char[] array;
		
		System.out.println("Informe a expressão a ser testada: ");
		expression = scanner.nextLine();

		array = new char[expression.length() - 1];
		array = expression.toCharArray();
		limit = array.length;
		Stack stack = new Stack(limit);

		if(Validation.loop(array, stack)) {
			System.out.println("Expressão Aceita");
		}else {
			System.out.println("Expressão Inválida");
		}
		
		System.out.println(stack.isEmpty());
	}
}
