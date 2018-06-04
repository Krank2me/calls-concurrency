package co.com.panda.calls;

/**
 * 
 * @author panda
 * 
 * clase Operator en la cual se contestan las llamadas entrantes
 *
 */

public class Operator extends Thread {
	
	private int calls;
	
	public Operator(int calls) {
		this.calls = calls;
	}

	@Override
	public void run() {
		try {
			for(int i = 0; i < calls; i++){
				System.out.println("Call answer by operator");
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			System.out.println("***error: " + e.getMessage());		
		}
	}

}
