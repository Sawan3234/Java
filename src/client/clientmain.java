package client;
import factorial.facto;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class clientmain {
 
	public void calculate() {
		try {
			Registry myregistry= LocateRegistry.getRegistry("127.0.0.1",1644);
			facto fact=(facto)myregistry.lookup("factor");
			int f= fact.fact("5");
			System.out.println("message sent and response received");
			System.out.println(f);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		clientmain cli= new clientmain();
		cli.calculate();

	}

}
