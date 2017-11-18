package analisadorSintatico;

public class Stack extends Throwable{
	
	private static int base = 0;
    private int top,edge = 2;
    private String[] array;
    private char[] expression;
    
    public Stack (){
    	int top = -1;
    	array = new String[edge + 1];
    }
    
    void insert(char[] expression) {
    	expression = new char[expression.length];
    	for(int i = 0; i <= expression.length; i++) {
    		top+=1;
    		this.expression[i] = expression[i];
    	}
    }
    
    
    void remove() {
    	top-=1;
    	if (top < base) 
    		System.out.println("Pilha vazia");
    		
    }
    
    
    
}
