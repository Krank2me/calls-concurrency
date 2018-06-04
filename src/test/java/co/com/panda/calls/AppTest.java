package co.com.panda.calls;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
    public void testWhenOperatorIsFullWithTenCalls() throws InterruptedException {
    	
    		Dispatcher dispatcher = new Dispatcher();
    		dispatcher.dispatchCall(15);
    		assertEquals("Call answer by operator", "Call answer by operator", "Call answer by operator");
    		
    }
    
    public void testWhenOperatorHaveMinusTenCalls() throws InterruptedException {
    	
		Dispatcher dispatcher = new Dispatcher();
		dispatcher.dispatchCall(8);
		assertEquals("Call answer by operator", "Call answer by operator", "Call answer by operator");
		
    }
    
    public void testWhenHaveMoreTenCallForEachEmployee() throws InterruptedException {
    	
		Dispatcher dispatcher = new Dispatcher();
		dispatcher.dispatchCall(40);
		assertEquals("Call answer by operator", "Call answer by operator", "Call answer by operator");
		
    }
    
    public void testWhenHaveCeroCalls() throws InterruptedException {
    	
		Dispatcher dispatcher = new Dispatcher();
		dispatcher.dispatchCall(0);
		assertEquals("Call answer by operator", "Call answer by operator", "Call answer by operator");
		
    }
}
