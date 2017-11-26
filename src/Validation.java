
public class Validation {
	
	public static boolean loop(char[] array, Stack stack) {
		
	int i = 0;	
		
		while(i < array.length) {
			
			if ((array[i] == '(' || array[i] == '[' || array[i] == '{')) 
				stack.insert(array[i]);
			
			if ((array[i] == ')' || array[i] == ']' || array[i] == '}') && Stack.isEmpty()) 
				Stack.setTop(Stack.getTop()+1);
			
			if (( array[i] == ')' || array[i] == ']' || array[i] == '}') && array[i] == Stack.charStack[Stack.getTop()])
				stack.remove();

			i++;
		}
		
		return (Stack.isEmpty());
	}		
}
