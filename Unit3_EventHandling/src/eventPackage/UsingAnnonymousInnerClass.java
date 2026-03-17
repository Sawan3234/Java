package eventPackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;

public class UsingAnnonymousInnerClass  extends JFrame{
	JButton btn1, btn2;
	JPanel panel;
	public UsingAnnonymousInnerClass() {
		setTitle("Event Handling");
		setSize(300,300);
		panel= new JPanel();
		btn1= new JButton("GREEN");
		btn1.addActionListener(new ActionListener() {
		  @Override
		  public void actionPerformed(ActionEvent e) {
			 panel.setBackground(Color.green);
		}
	});
		btn2= new JButton("RED");
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.red);
			}
			
		});
		
		add(btn1,"North");
		add(btn2,"South");
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new UsingAnnonymousInnerClass();
	}

}
