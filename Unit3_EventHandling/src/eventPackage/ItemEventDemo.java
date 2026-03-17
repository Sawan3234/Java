package eventPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemEventDemo extends JFrame implements ItemListener {
	
	JRadioButton male,female;
	JCheckBox csit,bca;
	JComboBox<String> college;
	JList<String> games;
	public ItemEventDemo() {
		
		setTitle("Item Event Frame");
		setSize(300,300);
		setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		male = new JRadioButton("Male");
		male.addItemListener(this);
		female = new JRadioButton("Female");
		female.addItemListener(this);

		csit = new JCheckBox("CSIT");
		csit.addItemListener(this);

		bca= new JCheckBox("BCA");
		bca.addItemListener(this);

		String[] s1 = {"Vedas","Nepalaya","Samriddhi"};
		college = new JComboBox<String>(s1);
		college.addItemListener(this);
		String [] g1 = {"Football","Rugby","Cricket"};
		games = new JList<String>(g1);
		games.addListSelectionListener(e->{
			JOptionPane.showMessageDialog(bca, "Selected Games"+games.getSelectedValuesList());
		});
		
		add(male);
		add(female);
		add(csit);
		add(bca);
		add(college);
		add(games);
		
		setVisible(true);


		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ItemEventDemo();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object item = 
		
		

	}

}