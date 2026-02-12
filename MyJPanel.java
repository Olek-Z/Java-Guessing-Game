import java.awt.*;
import java.util.Random;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.BorderFactory;  
import javax.swing.border.Border; 

import javax.swing.JOptionPane;

public class MyJPanel extends JPanel implements ActionListener
{
	public static final int SIZE = 4;  //Size; changeable
		
	private JButton[][] buttons;
	
	private HitDetection hitObj;
		
	private MyTitleJLabel theTitleLabel;
	
	private Integer selectedNumber;
	
	private boolean isWinner;
	
	private int tries;

	
	public MyJPanel(MyTitleJLabel titleLabel)
	{
		
		setLayout(new GridLayout(SIZE, SIZE, 4, 4));
		
		setBackground(Color.yellow);
		
		buttons = new JButton[SIZE][SIZE];
		
		hitObj = new HitDetection(SIZE);
		
		theTitleLabel = titleLabel;
		
		
		int buttonCounter = 1;
		tries = 0;
		
		Border lineBorder = BorderFactory.createLineBorder(Color.BLUE, 3);
		
		Random rand = new Random();
		
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		
		Color randomColor = new Color(r, g, b);
		
		
		
		for(int i=0; i<SIZE; i++)
		{
			for(int j=0; j<SIZE; j++)
			{
				buttons[i][j] = new JButton(buttonCounter+"");
				buttons[i][j].setBorder(lineBorder);
				
				// Generate lighter random colors for better button visibility
				r = (float) (rand.nextFloat() / 2f + 0.5);
				g = (float) (rand.nextFloat() / 2f + 0.5);
				b = (float) (rand.nextFloat() / 2f + 0.5);
				
				randomColor = new Color(r, g, b);
				
				
				
				buttons[i][j].setBackground(randomColor);
				buttonCounter++;
				add(buttons[i][j]);
				buttons[i][j].addActionListener(this);
				
			}
		}
		
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		
		String clickedButtonString = e.getActionCommand();
		
		
		selectedNumber = Integer.parseInt(clickedButtonString);
		
		 // Check if clicked button matches winning button
		isWinner = hitObj.checkWinner(selectedNumber);
		
		if(isWinner != false)
		{
			for(int i=0; i<SIZE; i++)
			{
				for(int j=0; j<SIZE; j++)
				{
					if(buttons[i][j].getText().equals(clickedButtonString))
					{
						buttons[i][j].setBackground(Color.GREEN);
						JOptionPane.showMessageDialog(null, "You Won", "Message", JOptionPane.INFORMATION_MESSAGE);
						tries++;
						theTitleLabel.setTitle(tries);
						disableCells();
					}
				}
			}
		}
		else
		{
			for(int i=0; i<SIZE; i++)
			{
				for(int j=0; j<SIZE; j++)
				{
					if(buttons[i][j].getText().equals(clickedButtonString))
					{
						buttons[i][j].setBackground(Color.RED);
						tries++;
						theTitleLabel.setTitle(tries);
					}
				}
			}
			
		}
		
		
	}
	// Disable all buttons after player wins to prevent further clicks
	public void disableCells()
	{
		
		for(int i=0; i<SIZE; i++)
		{
			for(int j=0; j<SIZE; j++)
			{
				buttons[i][j].setEnabled(false);
				
				
				
			}
		}
		
		
	}
}