import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.*;

class RectangleClass{
	public static void main(String arg[]){
		JFrame frame=new JFrame("Rectangle");
		//Container contentPane=frame.getContentPane();

		//create a rectangle
		Rectangle r1=new Rectangle(new Dimension(200,100));//with 0 0 xy cordinates
		//contentPane.add(rectangle);

		//create a rectangle
		Rectangle r2=new Rectangle(100,100,100,200);
		Rectangle r3=new Rectangle(new Point(100,100),new Dimension(100,200));
		


		//frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}