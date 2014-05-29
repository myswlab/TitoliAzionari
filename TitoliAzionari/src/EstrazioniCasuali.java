import java.util.*;

public class EstrazioniCasuali 
{	
	private static Random rand = new Random();	
	
	public static int estraiIntero(int min, int max)
	{
	 int range = max + 1 - min;
	 int casual = rand.nextInt(range);
	 return casual + min;
	}
	
    public static double estraiDouble(double min, double max)
	{
	 double range = max - min;
	 double casual = rand.nextDouble();
	 
	 double posEstratto = range*casual;
	 
	 return posEstratto + min;
	}
 
}
