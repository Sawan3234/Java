package interfaceandclass;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class MessageImp extends UnicastRemoteObject implements Message {
	private static final long serialVersionUID = 1L;
	public MessageImp() throws RemoteException{}
	
	public String sayHello(String name) throws RemoteException{
		return("Hello "+ name);
		
	}
	public double saySquareroot(String num) throws RemoteException{
		int i= Integer.parseInt(num);
		return Math.sqrt(i);
	}

}
