package eventPackage;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import java.awt.*;
public class ClassTaskMouseEvent  extends MouseAdapter{
	JButton movebtn;
	JFrame frame;

	public ClassTaskMouseEvent() {
		frame= new JFrame();
		frame.setTitle("Move Button Frame");
		frame.setSize(800,800);
		movebtn= new JButton(" Aarrey Beta idhar aaa");
		movebtn.setBounds(20,20,200,20);
		frame.setLayout(null);
		frame.add(movebtn);
		frame.addMouseListener(this);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ClassTaskMouseEvent();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		int x= e.getX();
		int y=e.getY();
		movebtn.setBounds(x,y,300,20);
	}
	

}
