package analisadorSintatico;

public class Stack {
	
	private static int base = 0;
    private int top;
    private String[] array;
    private char[] expression = new char[array.length];
    
    public Stack (int edge){
    	int top = -1;
    	array = new String[edge];
    }
    
    public Stack() {
    	
    }
    
    void insert(char c) {
    	top++;
    	this.expression[top] = c;
    	}
  
    
    
    void remove() {
    	top--;
    	
    	if (top < base) 
    		System.out.println("Pilha vazia");
    		
    }
    
    
    
}
