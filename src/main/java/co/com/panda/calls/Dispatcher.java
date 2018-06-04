package co.com.panda.calls;

/**
 * 
 * @author panda
 *
 *clase Dispatcher y metodo dispatchCall en el cual se tiene la logica donde se distribuye 
 *las llamas entantes, cada perfil tiene u maximo de 10 llamadas
 *
 */


public class Dispatcher {

	public void dispatchCall(int calls) throws InterruptedException {
		
		int callsToOperador = 0;
		int callsToSupervisor = 0;
		int callsToDirector = 0;
		int temp = 0;
		
		if (calls < 10) {
			callsToOperador = calls;
		}  
			
		if (calls >= 10) {
			temp = calls - 10;
			callsToOperador = 10;
		}  
		
		if (temp < 10) {
			callsToSupervisor = temp;
			temp = 0;
		}
		
		if (temp >= 10) {
			callsToSupervisor = 10;
			temp = temp - callsToSupervisor;
		}
		
		if (temp < 10) {
			callsToDirector = temp;
			temp = 0;
		}
		
		if (temp >= 10) {
			callsToDirector = 10;
			temp = temp - callsToDirector;
		}
		
		if (temp < 10) {
			callsToOperador = temp;
			temp = 0;
		}
		
		Thread employee = new Operator(callsToOperador);
		employee.start();
		Thread supervisor = new Supervisor(callsToSupervisor);
		supervisor.start();
		Thread director = new Director(callsToDirector);
		director.start();
		
		if (employee.isAlive() || supervisor.isAlive() || director.isAlive()) {
			if (temp > 10) {
				dispatchCall(temp);
			}
		}
	}
}
