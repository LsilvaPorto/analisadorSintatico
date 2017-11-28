
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class AnalyzerTest {

	
	@BeforeEach
	 public void createStackObjectTrue(char[] c) {
		 Stack stack = new Stack (c.length+1);
		 assertEquals(true, (Validation.loop(c, stack)));
	 }
	
	@BeforeEach
	 public void createStackObjectFalse(char[] c) {
		 Stack stack = new Stack (c.length+1);
		 assertEquals(false, (Validation.loop(c, stack)));
	 }
	
		
	@Test
	public void testOneFalse() {
		char[] c = {'(','}',')'};
		createStackObjectFalse(c);
		}
		
	@Test
	public void testFalseExpression() {
		char[] c = {'(',')',')'};
		createStackObjectFalse(c);
		}
		
		
		
	@Test
	public void testOneMoreFalse() {
		char[] c = {'(','}'};
		createStackObjectFalse(c);
	}
			
	@Test
	public void testOneExpression() {
		char[] c = {'(',')',')'};
		createStackObjectFalse(c);
	}
			
	@Test
	public void testOtherExpression() {
		char[] c = {'(',']'};
		createStackObjectFalse(c);
	}
	
	
	
		
}
