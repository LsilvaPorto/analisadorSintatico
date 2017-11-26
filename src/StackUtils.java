
public class StackUtils {
	
	public static void isRemoveOption(char[] array, int i, Stack stack) {
		
		if (array[i] == ')' 
				&& array[i] == Stack.charStack[Stack.getTop()])
			stack.remove();
	
		if (array[i] == ']' &&
				array[i] == Stack.charStack[Stack.getTop()])
			stack.remove();
		
		if (array[i] == '}' 
				&& array[i] == Stack.charStack[Stack.getTop()])
			stack.remove();
	}
	
	public static void isInsertOption(char[] array, int i, Stack stack) {
		
		if (array[i] == '(') 
			stack.insert(array[i]);
			
		if (array[i] == '[') 
			stack.insert(array[i]);
		
		if (array[i] == '{') 
			stack.insert(array[i]);
	}
}
