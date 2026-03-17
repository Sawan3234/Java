package eventPackage;
import java.awt.event.WindowEvent;

import java.awt.event.WindowListener;

import javax.swing.*;

public class WindowEventDemo extends JFrame implements WindowListener{
	public WindowEventDemo() {
		setTitle("Window Event");
		setSize(300,300);
		addWindowListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
	 new WindowEventDemo();
	 
	}
	@Override
	public void windowOpened(WindowEvent e) {
		JOptionPane.showMessageDialog(this,"welcome");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(this,"window is closing");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		JOptionPane.showMessageDialog(this,"window is being minimized");
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		JOptionPane.showMessageDialog(this,"window is maximized");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		JOptionPane.showMessageDialog(this,"window closed");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("window Activated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("window Deactivated");
		
	}

}
