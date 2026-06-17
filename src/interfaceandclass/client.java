package interfaceandclass;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class client {

	public void dotest() {
		try {
			Registry myRegistry= LocateRegistry.getRegistry("127.0.0.1",1099);
			
			Message imp= (Message)myRegistry.lookup("myMessage");
			String s= imp.sayHello("charles");
			double d= imp.saySquareroot("25");
			System.out.println("message sent and received");
			System.out.println(s+"\n"+d);
		}catch(Exception e) {
			  e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		client client= new client();
		client.dotest();
	}

}
