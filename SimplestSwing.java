import javax.swing.JFrame;//for gwetting refferences to JFrame
import javax.swing.WindowConstants;//For refferces to Instances of Window constants
import java.awt.Container;//For getting Container reffernce
import javax.swing.JButton;//fo getting Button reffernce 

class SimplestSwing{
	public static void main(String arg[]){
		

		//Create Jpanel
		JFrame frame=new JFrame("My frame");
		//frame.setBounds(100,50,350,200);//Set the posiition by arguments x y width and hieght

		//Add Button to Content Pane Container
		JButton closeButton=new JButton("Close");
		JButton helpButton=new JButton("Help");
		Container contentPane=frame.getContentPane();//get the content pane
		contentPane.add(closeButton);
		contentPane.add(helpButton);

		//Window Contances Operations
		frame.pack();//calculate and provide appropriate size for frame
		frame.setLocation(100,50);////Set the location of frame by x and y coardinates
		frame.setLocationRelativeTo(null);//set the location of components by parent relative//null argument will make that component to center
		frame.setVisible(true);//make Visible to Frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//opeeration when we click on close bottom on right top corner of jpanel

		//Know how many components present in Contnet pane Contaitner
		// Component[] components=contentPane.getComponents();
		// System.out.println(components);
	}
}