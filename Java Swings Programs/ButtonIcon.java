import javax.swing.*;
public class ButtonIcon {
	ButtonIcon(){
		JFrame f = new JFrame("ButtonIcon");
		JButton b = new JButton(new ImageIcon("../button.jpg"));
		b.setBounds(80,150,150,40);
		b.setText("Button");
		f.add(b);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonIcon();
	}

}
