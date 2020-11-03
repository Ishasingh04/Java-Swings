import javax.swing.*;
import java.awt.event.*;
public class Add_Sub implements ActionListener {
	JTextField tf1,tf2,tf3;
	JButton b1, b2;
	Add_Sub(){
		JFrame f = new JFrame("Calculator");
		tf1 = new JTextField();
		tf1.setBounds(50,50,150,20);
		tf2 = new JTextField();
		tf2.setBounds(50,100,150,20);
		tf3 = new JTextField();
		tf3.setBounds(50,150,150,20);
		b1 = new JButton("+");
		b1.setBounds(50,200,50,50);
		b2 = new JButton("-");
		b2.setBounds(120,200,50,50);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(b1);f.add(b2);f.add(tf1);f.add(tf2);f.add(tf3);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String st1 = tf1.getText();
		String st2 = tf1.getText();
		
		int a = Integer.parseInt(st1);
		int b = Integer.parseInt(st2);
		int c=0;
		
		if(e.getSource()==b1) {
			c=a+b;
		}else if(e.getSource()==b2) {
			c=a-b;
		}
		String result = String.valueOf(c);
		tf3.setText(result);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Add_Sub();
	}

}
