package factorial;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class factclass  extends UnicastRemoteObject implements facto{
	public factclass() throws RemoteException{}
	
	
	public int fact(String num) throws RemoteException{
		int n= Integer.parseInt(num);
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		return fact;
	}

}
