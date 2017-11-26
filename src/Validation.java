
public class Validation {
	
	public static boolean loop(char[] array, Stack stack) {
		
	int i = 0, countDelete = 0, countInsert = 0;	
		
		
		while(i < array.length) {
			
			
			//Se o elemento for (, [, { adiciona um na variável countInsert
			if (array[i] == '(' || array[i] == '[' || array[i] == '{')
				countInsert++;
			
			//Se o elemento for ), ], } adiciona um na variável countDelete
			if (array[i] == ')' || array[i] == ']' || array[i] == '}')
				countDelete++;
			
			StackUtils.ifEqualsInsert(array, i, stack);
				
			if (array[i] == ')' && Stack.isEmpty()) 
				Stack.setTop(Stack.getTop()+1);
			
			if (array[i] == ']' && Stack.isEmpty())
				Stack.setTop(Stack.getTop()+1);
			
			if (array[i] == '}' && Stack.isEmpty())
				Stack.setTop(Stack.getTop()+1);
			
			//Remove da Pilha se o elemento for igual à ), ], }
			StackUtils.ifEqualsRemove(array, i, stack);

			i++;
					
		}
		
		return (Stack.isEmpty() && countDelete == countInsert);
	}		
}
