import javax.swing.*;
public class subMenu {
JMenu menu,submenu;
JMenuItem i1,i2,i3,i4,i5;
subMenu(){
	JFrame f = new JFrame("Menu and Menuterm Example");
	JMenuBar mb = new JMenuBar();
	menu = new JMenu("Menu");
	submenu = new JMenu("Sub Menu");
	i1 = new JMenuItem("item 1");
	i2 = new JMenuItem("item 2");
	i3 = new JMenuItem("item 3");
	i4 = new JMenuItem("item 4");
	i5 = new JMenuItem("item 5");
	menu.add(i1);menu.add(i2);menu.add(i3);
	submenu.add(i4);submenu.add(i5);
	menu.add(submenu);
	mb.add(menu);
	f.setJMenuBar(mb);
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new subMenu();

	}

}
