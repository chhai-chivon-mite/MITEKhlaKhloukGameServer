import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * @author: Chhai Chivon on Jan 19, 2020
 * Senior Application Developer
 */

public class ClientHandleThread extends Thread {

	private Socket connection;
	private AppCallback appCallback;
	
	public ClientHandleThread(Socket connection, AppCallback appCallback) {
		super();
		this.connection = connection;
		this.appCallback = appCallback;
	}

	@Override
	public void run() {
		try {
			
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(connection.getOutputStream());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
