
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AnalyzerTest {

		@Test
		public void testOneOkExpression() {
		char[] c = {'(',')'};
		Stack stack = new Stack (c.length+1);
		assertEquals(true, (Validation.loop(c, stack)));

	}
		
		@Test
		public void testOneExpression() {
		char[] c = {'(',')','{'};
		Stack stack = new Stack (c.length+1);
		assertEquals(false, (Validation.loop(c, stack)));
		}
		
		@Test
		public void testOtherExpression() {
		char[] c = {'(','a',')'};
		Stack stack = new Stack (c.length+1);
		assertEquals(true, (Validation.loop(c, stack)));
		}
		
}
