import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import javax.swing.WindowConstants;
import java.awt.*;

class InsetsClass{
	public static void main(String arg[]){
		JFrame frame=new JFrame("Point Class");
		JButton closeButton=new JButton("Close");
		Container contentPane=frame.getContentPane();
		contentPane.add(closeButton);
		
		Insets ins=new Insets(300,10,10,10);
		Insets ins2=frame.getInsets();
		int top=ins.top;
		int left=ins.left;
		int bottom=ins.bottom;
		int right=ins.right;

		frame.pack();
		frame.setLocation(200,400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}