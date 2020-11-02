import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorChooser extends JFrame implements ActionListener{
	JFrame f;
	JButton b;
	JTextArea ta;
	ColorChooser(){
		f = new JFrame("Color Chooser Example");
	    b = new JButton("Color Pad");
	    b.setBounds(200,250,200,30);
	    ta = new JTextArea();
	    ta.setBounds(10,10,300,200);
	    b.addActionListener(this);
	    f.add(b);f.add(ta);
	    f.setLayout(null);
	    f.setSize(400,400);
	    f.setVisible(true);
	}
public void actionPerformed(ActionEvent e) {
		Color c =JColorChooser.showDialog(this,"Choose",Color.CYAN);
		ta.setBackground(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorChooser();
	}

}
