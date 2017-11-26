
import javax.swing.JOptionPane;

public class View {

	public static void main(String[] args) {
		
		String expression;
		int limit;
		char[] array;
		
		expression = JOptionPane.showInputDialog("Informe a expressão Matemática a ser testada: ");
		
		try {
			array = new char[expression.length() - 1];
			array = expression.toCharArray();			
		}catch(NegativeArraySizeException e) {
			JOptionPane.showMessageDialog(null, "A palavra não pode ser vazia");
			return ;
		}
		
		limit = array.length;
		Stack stack = new Stack(limit);

		if(Validation.loop(array, stack)) {
			JOptionPane.showMessageDialog(null,expression+" é uma expressão válida");
		}else {
			JOptionPane.showMessageDialog(null,expression+" é uma expressão Inválida");
		}
	}
}
