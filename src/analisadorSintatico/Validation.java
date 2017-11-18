package analisadorSintatico;

public class Validation {
	boolean validation;
	Stack stack = new Stack();
	
	void loop(char[] array) {
		int i = 0;
		while(i < array.length) {
			if (array[i] == '(' || array[i] == '[' || array[i] == '{') {
				stack.insert(array[i]);
			}
			
			if (array[i] == ')' || array[i] == ']' || array[i] == '}') {
				stack.remove();
			}
			
		}
	}
}
