package co.com.panda.calls;

/**
 * 
 * @author panda
 * 
 * clase Supervisor en la cual se contestan las llamadas entrantes
 *
 */

public class Supervisor extends Thread {
	
	private int calls;
	
	public Supervisor(int calls) {
		this.calls = calls;
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0; i < calls; i++){
				System.out.println("Call answer by supervisor");
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			System.out.println("***error: " + e.getMessage());
		}
	}
}
