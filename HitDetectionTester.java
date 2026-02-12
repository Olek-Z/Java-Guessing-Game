import java.awt.*;
import javax.swing.*;

public class HitDetectionTester 
{
	
	public HitDetectionTester()
	{
		
		JFrame theJFrame = new JFrame();
		theJFrame.setTitle("Hint Detection");
		
		theJFrame.setLocation(500, 300);
		theJFrame.setSize(300, 200);
		
		theJFrame.setBackground(Color.yellow);
		
		MyTitleJLabel label = new MyTitleJLabel();
		
		theJFrame.add(label, BorderLayout.NORTH);
		
		MyJPanel panel = new MyJPanel(label);
		
		theJFrame.add(panel, BorderLayout.CENTER); 
		
		MyPlayAgainButton again = new MyPlayAgainButton(theJFrame);
		
		theJFrame.add(again, BorderLayout.SOUTH);
		
		theJFrame.setVisible(true);
		theJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) 
	{
		new HitDetectionTester();
	}
}