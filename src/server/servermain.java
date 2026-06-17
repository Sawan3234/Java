package server;
import  factorial.factclass;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class servermain {
	private void staartserver() {
		try {
			Registry registry= LocateRegistry.createRegistry(1644);
			registry.rebind("factor",new factclass());
		}catch(Exception e) {
			 e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		servermain serv= new servermain();
		serv.staartserver();
	}

}
