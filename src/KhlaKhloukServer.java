import java.net.Socket;

/*
 * @author: Chhai Chivon on Jan 19, 2020
 * Senior Application Developer
 */

public class KhlaKhloukServer implements AppCallback {
	
	private Socket connection;
	
	public KhlaKhloukServer() {
		//Initialize Server
		BindThread bindThread = new BindThread(this, 1234);
		bindThread.start();
			
	}
	
	public static void main(String[] args) {
		new KhlaKhloukServer();
	}
	
	@Override
	public void onClientConnected(Socket connection) {
		this.connection = connection;
	}

	@Override
	public void onLuckyDrawCompleted(String[] lockyDraws) {
		// TODO Auto-generated method stub
		
	}

}
