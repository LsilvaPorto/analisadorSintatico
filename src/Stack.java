
public class Stack {
	
    private static int top = -1;
    public static char[] charStack;
    
    public Stack (int limit){
    	charStack = new char[limit];
    }
    
    
    void insert(char c) {
		top++;
		charStack[top] = c;
    }
  
    void remove() {
    	top--;
    }
    
    public boolean isEmpty() {
    	return top == -1;
    }
    
    public char getCharStackTop() {
    	return charStack[top];
    }
}
