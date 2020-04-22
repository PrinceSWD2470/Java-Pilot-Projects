import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import javax.swing.WindowConstants;
import java.awt.*;

class DimensionClass{
	public static void main(String arg[]){
		JFrame frame=new JFrame("Point Class");
		JButton closeButton=new JButton("Close");
		Container contentPane=frame.getContentPane();
		contentPane.add(closeButton);
		
		Dimension d=new Dimension(1000,1200);
		closeButton.setSize(d);


		frame.pack();
		frame.setLocation(200,400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}