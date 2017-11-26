
public class Validation {
	
	public static boolean loop(char[] array, Stack stack) {
		
	int i = 0, countDelete = 0, countInsert = 0;	
		
		
		while(i < array.length) {
			
			
			//Se o elemento for (, [, { adiciona um na vari�vel countInsert
			if (array[i] == '(' || array[i] == '[' || array[i] == '{')
				countInsert++;
			
			//Se o elemento for ), ], } adiciona um na vari�vel countDelete
			if (array[i] == ')' || array[i] == ']' || array[i] == '}')
				countDelete++;
			
			
			if ((array[i] == '(' || array[i] == '[' || array[i] == '{')) 
				stack.insert(array[i]);
			
			if ((array[i] == ')' || array[i] == ']' || array[i] == '}') && Stack.isEmpty()) 
				Stack.setTop(Stack.getTop()+1);
			
			if (( array[i] == ')' || array[i] == ']' || array[i] == '}') && array[i] == Stack.charStack[Stack.getTop()])
				stack.remove();

			i++;
					
		}
		
		return (Stack.isEmpty() && countDelete == countInsert);
	}		
}
