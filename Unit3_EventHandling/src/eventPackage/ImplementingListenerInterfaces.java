package eventPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImplementingListenerInterfaces  extends JFrame implements ActionListener{
	JButton btn1, btn2;
	JPanel panel;
	public ImplementingListenerInterfaces()
	{
		setTitle("Event Handling");
		setSize(300,300);
		panel= new JPanel();
		btn1= new JButton("GREEN");
		btn1.setActionCommand("green");
		btn1.addActionListener(this);
		
		
		btn2= new JButton("RED");
		btn2.setActionCommand("red");
		btn2.addActionListener(this);
		
		add(btn1,"North");
		add(btn2,"South");
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new ImplementingListenerInterfaces();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="green")
			panel.setBackground(Color.green);
		else 
			panel.setBackground(Color.red);
	}

}
