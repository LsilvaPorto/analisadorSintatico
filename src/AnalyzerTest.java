
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class AnalyzerTest {

		@Test
		public void testOneOkExpression() {
			char[] c = {'(',')'};
			createStackObjectTrue(c);

		}
		
		@Test
		public void testOneExpression() {
			char[] c = {'(',')','{'};
			//Stack stack = new Stack (c.length+1);
			//assertEquals(false, (Validation.loop(c, stack)));
			createStackObjectFalse(c);
		}
		
		@Test
		public void testOtherExpression() {
			char[] c = {'(','a',')'};
			//Stack stack = new Stack (c.length+1);
			//assertEquals(true, (Validation.loop(c, stack)));
			createStackObjectTrue(c);
		}
		
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
		
		/*
		
		@Test
		public void testOneOkExpression() {
			char[] c = {'(',')'};
			createStackObject(c);
		}
			
		@Test
		public void testOneExpression() {
			char[] c = {'(',')','{'};
			createStackObject(c);
		}
			
		@Test
		public void testOtherExpression() {
			char[] c = {'(','a',')'};
			createStackObject(c);
		}*/
		
		
}
