import javax.swing.JEditorPane;
import javax.swing.JFrame;
public class Editorpane {
	JFrame myFrame = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Editorpane()).test();

	}
	private void test() {
		myFrame = new JFrame("JEditorpane Test");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(400,200);
		JEditorPane myPane = new JEditorPane();
		myPane.setContentType("text/html");
		myPane.setText("<h1>Sleeping</h1><p>Sleeping is necessary for a healthy body." + "But sleeping in unnecessary times may spoil our health,wealth and studies." +
		"Doctors advise that the sleeping at improper timings may lead for obesity during the students days. </p>");
		
		myFrame.setContentPane(myPane);
		myFrame.setVisible(true);
	}

}
