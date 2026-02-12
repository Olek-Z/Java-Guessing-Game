import java.awt.Color;

public class HitDetection
{
	private int winner;
	
	public HitDetection(int size )
	{
		
		winner = (int)((Math.random() * (size*size)) + 1);
		
		// Generate random winning button (1 to size*size)
		
		System.out.println(winner);
		//answer displayed for testing purposes.
		
	}
	
	public boolean checkWinner(Integer buttonClicked)
	{
		
		if(buttonClicked == winner)
		{
			return true;
		}
		
		return false;
		
	}

}