
public class Stack {
	
    private static int top = -1;
    private String[] stringArray;
    public static char[] charStack;
    
    public Stack (int limit){
    	stringArray = new String[limit];
    	charStack = new char[stringArray.length];
    }
    
    
    void insert(char c) {
    	
    	if (c == '(') {
    		top++;
    		charStack[top] = ')';
    	}
    	
		if (c == '[') {
			top++;
			charStack[top] = ']';
		}
		
		if (c == '{') {
			top++;
			charStack[top] = '}';
		}
    }
  
    void remove() {
    	top--;
    }
    
    
    public static boolean isEmpty() {
    	return top == -1;
    }
    
    public static int getTop() {
    	return top;
    }
    
    public static void setTop(int t) {
    	top = t;
    }
}
