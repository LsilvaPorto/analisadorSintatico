
public class Validation {
	
	public static boolean loop(char[] array, Stack stack) {
		
		int i = 0;	
			
		while(i < array.length) {
			
			if ((array[i] == '(' || array[i] == '[' || array[i] == '{')) 
				stack.insert(array[i]);
			
			//Verifica se o valor lido é o fechamento para a respectiva abertura 
			if (( array[i] == ')' || array[i] == ']' || array[i] == '}')) {
				
				if(Stack.isEmpty())
					return false;
				
				if(array[i] == ')' && Stack.charStack[Stack.getTop()] == '(')
					stack.remove();	
				else if(array[i] == ']' && Stack.charStack[Stack.getTop()] == '[')
					stack.remove();
				else if(array[i] == '}' && Stack.charStack[Stack.getTop()] == '{')
					stack.remove();
			}
	
			i++;
		}
		
		return (Stack.isEmpty());
	}
}

