package Unit3;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ConceptOfEventHandling extends JFrame{
	JButton btn1, btn2;
	JPanel panel;
	public ConceptOfEventHandling() {
		setTitle("Event Handling");
		setSize(300,300);
		panel= new JPanel();
		btn1= new JButton("GREEN");
		btn1.addActionListener(e->panel.setBackground(Color.green));
		btn2= new JButton("BLUE");
		btn2.addActionListener(e->panel.setBackground(Color.blue));
		
		add(btn1,"North");
		add(btn2,"South");
		add(panel);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ConceptOfEventHandling();
		// TODO Auto-generated method stub

	}

}
