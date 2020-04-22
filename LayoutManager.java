import java.awt.*;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JPanel;

class LayoutManager{
	public static void main(String arg[]){
		JFrame frame=new JFrame("Flow layout");
		JPanel panel=new JPanel();
		Container contentPane=frame.getContentPane();
		contentPane.setLayout(new FlowLayout());
		//.setLayout(new BorderLayout());

		String lm=contentPane.getLayout().toString();//return all properties of a layout used by Container
		System.out.println(lm);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}