
import java.util.Scanner;

public class View {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String expression;
		Scanner scanner = new Scanner(System.in);
		int limit;
		char[] array;
		
		System.out.println("Informe a express�o a ser testada: ");
		expression = scanner.nextLine();

		array = new char[expression.length() - 1];
		array = expression.toCharArray();
		limit = array.length;
		Stack stack = new Stack(limit);

		if(Validation.loop(array, stack)) {
			System.out.println("Express�o Aceita");
		}else {
			System.out.println("Express�o Inv�lida");
		}
		
		System.out.println(stack.isEmpty());
	}
}
