import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HelloThere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JButton b = new JButton(new ImageIcon("../button.jpg"));
		b.setBounds(50,100,95,30);
		JTextField tf = new JTextField();
		tf.setBounds(50,50,150,20);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Hello There!");
			}
		});
		
		f.add(tf);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);

	}
}
