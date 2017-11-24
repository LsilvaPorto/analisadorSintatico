
public class Validation {
	
	public static boolean loop(char[] array, Stack stack) {
		
	int i = 0, countDelete = 0, countInsert = 0;	
		
		
		while(i < array.length) {
			
			if (array[i] == '(' || array[i] == '[' || array[i] == '{')
				countInsert++;
			
			if (array[i] == ')' || array[i] == ']' || array[i] == '}')
				countDelete++;
			
			if (array[i] == '(') 
				stack.insert('(');
				
			if (array[i] == '[') 
				stack.insert('[');
			
			if (array[i] == '{') 
				stack.insert('{');
				
			if (array[i] == ')' && Stack.isEmpty()) 
				Stack.setTop(Stack.getTop()+1);
			
			if (array[i] == ']' && Stack.isEmpty())
				Stack.setTop(Stack.getTop()+1);
			
			if (array[i] == '}' && Stack.isEmpty())
				Stack.setTop(Stack.getTop()+1);
			
			if (array[i] == ')' && array[i] == Stack.expression[Stack.getTop()])
				stack.remove();
			
			if (array[i] == ']' && array[i] == Stack.expression[Stack.getTop()])
				stack.remove();
			
			if (array[i] == '}' && array[i] == Stack.expression[Stack.getTop()])
				stack.remove();
			
			
			//if (array[i] == ']')
				
			
			i++;
					
		}
		
		if(Stack.isEmpty() && countDelete == countInsert)
			return true;
		else
			return false;
		
	}		
}
