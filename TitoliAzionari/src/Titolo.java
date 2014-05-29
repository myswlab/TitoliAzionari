import java.io.Serializable;

class Titolo implements Serializable
{
 
 
 private final static String DESCRIZIONE = "%s: prezzo= %1.3f";

 private String nome;
 private double prezzo;
	
 public Titolo (String n, double p)
	{
	 nome = n;
	 prezzo = p;
	}
	
 public String toString ()
	{
	 return String.format(DESCRIZIONE, nome ,prezzo); 
	}
	
 public double getPrezzo()
	{
	 return prezzo;
	}
	
	
 public void variazGiornaliera()
	{
	 // da completare per effettuare simulazione
	}

}

