package tcpPack;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	
	public TCPServer()  throws IOException {
		ServerSocket ss= new ServerSocket(1234);
		Socket soc= ss.accept();
		DataInputStream input= new DataInputStream(soc.getInputStream());
		DataOutputStream output= new DataOutputStream(soc.getOutputStream());
		//sending response to client
		String response= "Hello max, ready for the race";
		output.writeUTF(response);
		//reading request from client
		String request= input.readUTF();
		System.out.println("Request from client: "+request);
		ss.close();
		
	}

	public static void main(String[] args) throws IOException {
      		
       new TCPServer();
	}

}
