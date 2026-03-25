package tcpPack;
import java.net.Socket.*;
import java.net.*;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
//know as socket programming, Socket, serverSocket classes are used.
public class ClientParagraph {

	public ClientParagraph() throws UnknownHostException, IOException {
		Socket soc = new Socket("localhost", 3234);
		DataInputStream input = new DataInputStream(soc.getInputStream()); // reads response sent by server
		DataOutputStream output= new DataOutputStream(soc.getOutputStream()); // sends request from client 
		//sending request through socket
		System.out.println("Enter a paragraph: ");
		String request= getParahraph();
		output.writeUTF(request); // it writes the message in outputstream and sent to server
		//reading response from server
		String response = input.readUTF(); //it reads response provided by socket
		System.out.println("Response from server: "+response);
	
		
	}
	public static String getParahraph() {
		try(Scanner input= new Scanner(System.in)){
			return input.nextLine();
		}
	}
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		new ClientParagraph();

	}

}
