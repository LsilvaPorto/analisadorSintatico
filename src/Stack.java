
public class Stack {
	
    private static int top = -1;
    private String[] stringArray;
    public static char[] charStack;
    
    public Stack (int limit){
    	stringArray = new String[limit];
    	charStack = new char[stringArray.length];
    }
    
    
    void insert(char c) {
		top++;
		charStack[top] = c;
    }
  
    void remove() {
    	top--;
    }
    
    public static boolean isEmpty() {
    	return top == -1;
    }
    
    public char getCharStackTop() {
    	return charStack[top];
    }
}
