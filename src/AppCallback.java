import java.net.Socket;

/*
 * @author: Chhai Chivon on Jan 19, 2020
 * Senior Application Developer
 */

public interface AppCallback {
	
	void onClientConnected(Socket connection);
	 
	void onLuckyDrawCompleted(String[] lockyDraws);

}
