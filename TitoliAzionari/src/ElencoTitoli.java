import java.util.*;
import java.io.Serializable;


class ElencoTitoli implements Serializable
{
 
 private final static String INTRO_TITOLI = "Ecco l'elenco dei titoli:\n"; 
	
 private Vector<Titolo> listino; 
	
 public ElencoTitoli ()
	{
	 listino = new Vector<Titolo>();
	}

 public int numTitoli()
	{
	 return listino.size();
	}
	
 public Titolo getTitolo (int i)
	{
	 return listino.get(i);
	}

 public void addTitolo (Titolo tit)
	{
	 listino.add(tit);
	}
	
 public String toString ()
	{
	 StringBuffer result = new StringBuffer();
	 result.append(INTRO_TITOLI);
	 
	 for (int i = 0; i < listino.size(); i++)
		{
		 result.append( listino.get(i).toString() + "\n");
		}
		
	 return result.toString();
	}
	
	
 public void simulaVariazione()
	{
	 // da completare per effettuare simulazione
	 System.out.println("GIT change");
	}
 
}

