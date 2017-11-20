
package analisadorSintatico;

public class Stack {
	
	private static int base = 0;
    private int top;
    private String[] stringArray;
    private char[] expression;
    
    
    public Stack (int limit){
    	
    	this.top = -1;
    	stringArray = new String[limit];
    	this.expression = new char[stringArray.length];
    }
    
    void insert(char c) {
    	
    	this.top++;
    	this.expression[this.top] = c;
    }
  
    void remove() {
    	
    	this.top--;
    	
    	if (this.isEmpty()) {
    		return;
    	}
    }
    
    public boolean isEmpty() {
    	
    	return this.top < base;
    }
}
