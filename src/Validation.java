
public class Validation {
	
	public static boolean loop(char[] array, Stack stack) {
		
		int open = 0;
		int close = 0;
		int i = 0;
		
		while(i < array.length) {
			
			if (array[i] == '(' || array[i] == '[' || array[i] == '{') {
				
				stack.insert(array[i]);
				open++;
			}
			
			if (array[i] == ')' || array[i] == ']' || array[i] == '}') {
				
				if(stack.isEmpty()) {
					return false;
				}
				stack.remove();
				close++;
			}
			
			i++;
		}
		
		return close == open;
	}
}
