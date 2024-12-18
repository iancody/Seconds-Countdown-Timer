
import java.util.*;

public class Main 
{

	public static void main(String[] args) throws InterruptedException 
	{	
		Long timer;
		Long hours;
		Long minutes;
		Long seconds;
		
		
		// Welcome Menu
		System.out.println("Timer (in Seconds)");
		
		
		Scanner scanner = new Scanner(System.in);
		
		// Enter Hours
		System.out.print("(1)Enter HOURS: ");
		hours = scanner.nextLong();
		
		// Enter Minutes
		System.out.print("(2)Enter MINUTES: ");
		minutes = scanner.nextLong();
		
		// Enter Seconds
		System.out.print("(3)Enter SECONDS: ");
		seconds = scanner.nextLong();
		
		// Convert to seconds for the timer
		timer = ((hours * 60) + minutes) * 60 + seconds;
		
		for(Long i = timer; i >= 1; i--)
		{
			System.out.println(i);
			
			Thread.sleep(1000);
			
		}
		
		System.out.println("0 \nDONE");
		
		scanner.close();
	}
	

}
 