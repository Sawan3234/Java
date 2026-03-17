package eventPackage;



import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;



import javax.swing.JFrame;

import javax.swing.JLabel;



public class MouseEventDemo extends JFrame implements MouseListener {

	JLabel infolbl;



	public MouseEventDemo() {

		setTitle("Vowel Frame");

		setSize(300, 300);

		infolbl = new JLabel("<html><h3>Check Coordinate values.</h3></html>");

		addMouseListener(this);// activating mouselistener to JFrame

		add(infolbl, "North");

		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}



	public static void main(String[] args) {

		new MouseEventDemo();

	}



	@Override

	public void mouseClicked(MouseEvent e) {

		infolbl.setText("Mouse Clicked at: (" + e.getX() + "," + e.getY() + ")");

	}



	@Override

	public void mousePressed(MouseEvent e) {

		infolbl.setText("Mouse Pressed at: (" + e.getX() + "," + e.getY() + ")");

	}



	@Override

	public void mouseReleased(MouseEvent e) {

		infolbl.setText("Mouse Released at: (" + e.getX() + "," + e.getY() + ")");

	}



	@Override

	public void mouseEntered(MouseEvent e) {

		infolbl.setText("Mouse Entered at: (" + e.getX() + "," + e.getY() + ")");

	}



	@Override

	public void mouseExited(MouseEvent e) {

		infolbl.setText("Mouse Exited from: (" + e.getX() + "," + e.getY() + ")");

	}

}