import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import javax.swing.WindowConstants;
import java.awt.*;

class PointClass{
	public static void main(String arg[]){
		JFrame frame=new JFrame("Point Class");
		JButton closeButton=new JButton("Close");
		Point point=new Point(200,400);
		Container contentPane=frame.getContentPane();

		double x=point.getX();
		double y= point.getY();

		closeButton.setLocation(point);
		contentPane.add(closeButton);

		frame.pack();
		frame.setLocation(200,400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}