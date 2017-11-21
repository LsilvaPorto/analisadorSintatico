
public class Validation {
	
	public static boolean loop(char[] array, Stack stack) {
		
		int open = 0, parenthesesOpen = 0, bracketsOpen = 0, bracesOpen = 0;
		int close = 0, parenthesesClose = 0, bracketsClose = 0, bracesClose = 0;
		int i = 0;
		
		while(i < array.length) {
			
			if (array[i] == '(' || array[i] == '[' || array[i] == '{') {
				
				stack.insert(array[i]);
				open++;
				
				if(array[i] == '(')
					parenthesesOpen++;
				
				if(array[i] == '[')
					bracketsOpen++;
				
				if(array[i] == '{')
					bracesOpen++;
			}
			
			if (array[i] == ')' || array[i] == ']' || array[i] == '}') {
				
				if(stack.isEmpty()) {
					return false;
				}
				stack.remove();
				close++;
				
				if(array[i] == ')')
					parenthesesClose++;
				
				if(array[i] == ']')
					bracketsClose++;
				
				if(array[i] == '}')
					bracesClose++;
			}
			
			i++;
		}
		
		if(parenthesesClose == parenthesesOpen && bracketsOpen == bracketsClose && bracesOpen == bracesClose) {
			return close == open;			
		}
		return false;
	}
}
