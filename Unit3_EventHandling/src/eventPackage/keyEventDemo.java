package eventPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyEventDemo extends JFrame implements KeyListener {
    JLabel vowellbl;
    JTextField voweltxt;


    public keyEventDemo() {
        setTitle("Vowel Frame");
        setSize(300, 300);
        vowellbl = new JLabel("Enter letter");
        voweltxt = new JTextField(20);
        voweltxt.addKeyListener(this);
        add(vowellbl, BorderLayout.NORTH);
        add(voweltxt, BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       
        new keyEventDemo();
    }

    @Override
   
    public void keyTyped(KeyEvent e) {
   
        String res = String.valueOf(e.getKeyChar()).toLowerCase();
        if (res.equals("a") || res.equals("e") || res.equals("i") || res.equals("o") || res.equals("u"))
            JOptionPane.showMessageDialog(getParent(), res + " is a vowel.");
        else
            JOptionPane.showMessageDialog(getParent(), res + " is a consonant.");
    }

    @Override

    public void keyPressed(KeyEvent e) {
        JOptionPane.showMessageDialog(getParent(), "Don't press the " + e.getKeyChar() + " key for long time.");
    }

    @Override
   
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar() + " is released after long press.");
    }
}