package interfaceandclass;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote {
	String sayHello(String name ) throws RemoteException;
	double saySquareroot(String num) throws RemoteException;
}
