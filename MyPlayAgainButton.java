import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
public class MyPlayAgainButton extends JPanel implements ActionListener
{
	private final String BUTTONTITLE = "PLAY AGAIN";
	
	private JButton playAgain;
	
	private JFrame currentFrame;
	
	public MyPlayAgainButton(JFrame theFrame)
	{
		playAgain = new JButton(BUTTONTITLE);
		
		setBackground(Color.cyan);
		
		this.add(playAgain);
		
		playAgain.addActionListener(this);
		
		currentFrame = theFrame;
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		currentFrame.dispose();
	
		HitDetectionTester clickedButtonString = new HitDetectionTester();
	
	}
}