import javax.swing.*;
import java.awt.*;

class FlowLayout{
	public static void main(String arg[]){
		JFrame frame =new JFrame("Flow Layout").setLayout(new FlowLayout());
		Button button=new Button();
		 Container contentPane=frame.getContentPane();
		//contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		

		for (int i=1;i<=3;i++){
			contentPane.add(new Button("button"+i));
		}

		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}