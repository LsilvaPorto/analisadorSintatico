
public class Validation {
	
	public static boolean loop(char[] array, Stack stack) {
		
	int i = 0;	
		
		
		while(i < array.length) {
			
			if (array[i] == '(') 
				stack.insert('(');
				
			if (array[i] == '[') 
				stack.insert('[');
			
			if (array[i] == '{') 
				stack.insert('{');
				
			if (array[i] == ')' && array[i] == Stack.expression[Stack.getTop()])
				stack.remove();
			
			if (array[i] == ']' && array[i] == Stack.expression[Stack.getTop()])
				stack.remove();
			
			if (array[i] == '}' && array[i] == Stack.expression[Stack.getTop()])
				stack.remove();
			
			i++;
					
		}
			
		
		if(Stack.isEmpty())
			return true;
		else
			return false;
		
	}		
}
