import javax.swing.*;
import java.awt.event.*;
public class VoteEligibility extends JFrame implements ActionListener{
JRadioButton rb1,rb2;
JButton b;
VoteEligibility(){
	rb1 = new JRadioButton("Age<18");
	rb1.setBounds(100,50,100,30);
	rb2 = new JRadioButton("Age>=18");
	rb2.setBounds(100,100,100,30);
	ButtonGroup bg = new ButtonGroup();
	bg.add(rb1);bg.add(rb2);
	b=new JButton("Can I Vote");
	b.setBounds(100,150,150,30);
	b.addActionListener(this);
	add(rb1);add(rb2);add(b);
	setSize(300,300);
	setLayout(null);
	setVisible(true);
	
}

public void actionPerformed(ActionEvent e) {
	if(rb1.isSelected()) {
		JOptionPane.showMessageDialog(this, "You are Too Young to cast a vote.\nCheer for your favourite Leader.");
	}
	if(rb2.isSelected()) {
		JOptionPane.showMessageDialog(this, "Go Ahead and cast your vote for the upcoming presidential elections.");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VoteEligibility();

	}

}
