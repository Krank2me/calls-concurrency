package co.com.panda.calls;

/**
 * 
 * @author panda
 * 
 * clase Director en la cual se contestan las llamadas entrantes
 *
 */

public class Director extends Thread {

	private int calls;
	
	public Director(int calls) {
		this.calls = calls;	
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0; i < calls; i++){
				System.out.println("Call answer by director");
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			System.out.println("***error: " + e.getMessage());
		}
	}
	

}
