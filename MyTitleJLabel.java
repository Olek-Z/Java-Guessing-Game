import javax.swing.*;
import java.awt.*;
public class MyTitleJLabel extends JPanel
{
	private JLabel gameTitle;
	
	private static final String TITLE = "HIT DETECTION!!   Number of Tries: ";
	
	public MyTitleJLabel()
	{
		
		gameTitle = new JLabel(TITLE+"0");
		
		setBackground(Color.cyan);
		
		this.add(gameTitle);
		
	}
	
	public void setTitle(int tries)
	{
		
		gameTitle.setText(TITLE + tries);
		
	}
}