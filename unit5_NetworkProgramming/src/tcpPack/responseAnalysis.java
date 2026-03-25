package tcpPack;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class responseAnalysis {
	
	public responseAnalysis()  throws IOException {
		ServerSocket ss= new ServerSocket(3234);
		Socket soc= ss.accept();
		DataInputStream input= new DataInputStream(soc.getInputStream());
		DataOutputStream output= new DataOutputStream(soc.getOutputStream());
		//sending response to client
		
		//reading request from client
		String request= input.readUTF();
		
		
		//sending response to client
		String response= CountTokens(request);
		output.writeUTF(response);
		ss.close();
		
	}
	public static String CountTokens(String request) {
		int vowels=0, consonants=0, commas=0, fullStops=0, semis=0, ws=0;
		char[] req= request.toLowerCase().toCharArray();
		for(int i=0; i<req.length;i++) {
			if(req[i]=='a' || req[i]=='e' || req[i]=='i' || req[i]=='o' || req[i]=='u') {
				vowels++;
			}
			else if((req[i]>='a' && req[i]<='z') || (req[i]>='A' && req[i]<='Z')) {
				consonants++;
			}
			else if(req[i]==',') {
				commas++;
			}
			else if(req[i]=='.') {
				fullStops++;
			}
			else if(req[i]==';') {
				semis++;
			}
			else if(req[i]==' ') {
				ws++;
			}
		}
		return "Vowels="+vowels+" Consonants="+consonants+" Commas="+commas+" Full Stops="+fullStops+" Semicolons="+semis+" White Spaces="+ws;
		
	}

	public static void main(String[] args) throws IOException {
      		
       new responseAnalysis();
	}

}
