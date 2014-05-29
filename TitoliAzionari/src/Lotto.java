import java.io.Serializable;

class Lotto implements Serializable
{
 private Titolo azione;
 private int quantita;
	
 public Lotto (Titolo tit, int num)
	{
	 azione = tit;
	 quantita = num;
	}
	
 public double valore ()
	{
	 // da completare per effettuare simulazione
	}
	
 public String toString ()
	{
	 return quantita + " " + azione.toString();
	}

}

