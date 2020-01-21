import java.net.ServerSocket;
import java.net.Socket;

/*
 * @author: Chhai Chivon on Jan 19, 2020
 * Senior Application Developer
 */

public class BindThread extends Thread {
	
	private AppCallback appCallback;
	private int serverPort;
	
	public BindThread(AppCallback appCallback, int serverPort) {
		this.appCallback = appCallback;
		this.serverPort = serverPort;
	}
	
	@Override
	public void run() {
		try {
			// Bind Port
			ServerSocket  serverSocket  = new ServerSocket(serverPort);
			System.out.println("Wait client request...");
			Socket connection = serverSocket.accept();
			System.out.println("Acception client request");
			appCallback.onClientConnected(connection);
		} catch (Exception e) {
			e.getSuppressed();
		}
	}
}
