package nioserver;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class Server implements Runnable {
	
	private ExecutorService threadPool = Executors.newFixedThreadPool(2);
	
	
	public Server() {
		
	}
	
	@Override
	public void run() {
		
	}
	
	
}