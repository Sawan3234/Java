package interfaceandclass;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class server {
	private void startserver(){
		try {
			Registry registry= LocateRegistry.createRegistry(1099);
			
			registry.bind("myMessage", new MessageImp());
			
		}catch(Exception e) {
			  e.printStackTrace();
		}
		System.out.println("system is ready");
	}

	public static void main(String[] args) {
		
       server ser= new server();
       ser.startserver();
	}

}
