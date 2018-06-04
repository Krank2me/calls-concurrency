package co.com.panda.calls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author panda
 * 
 * clase principal en la cual se instancea la clase Dispatcher y se simula el numero de llamadas entrantes
 *
 */

public class App {
	
    public static void main( String[] args ) throws InterruptedException, NumberFormatException, IOException {
        
        Dispatcher dispatcher = new Dispatcher();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numerCalls;
        System.out.println("Por favor ingrese numero de llama(s): ");
        
        try {
        		numerCalls = Integer.parseInt(br.readLine());
			dispatcher.dispatchCall(numerCalls);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}
