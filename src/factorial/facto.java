package factorial;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface facto  extends Remote{
	
int fact(String num) throws RemoteException;
}
