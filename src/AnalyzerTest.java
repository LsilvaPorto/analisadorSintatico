import org.junit.Assert;
import org.junit.Test;

public class AnalyzerTest {

		@Test
		public void testOneOkExpression() {
			char[] c = {'(',')'};
			Stack stack = new Stack (c.length+1);
			Assert.assertEquals(Validation.loop(c, stack), true);

	}

}
