import java.util.*;
import java.io.Serializable;


class Portafoglio implements Serializable
{
 
 private final static String DESC_DENOMINAZIONE = "Portafoglio denominato: %s %n";
 private final static String INTRO_COMPOSIZIONE = "Composizione:\n";
 private final static String DESC_TOTALE = "Valore totale= %1.2f";
 
 private String denominazione;
 private ElencoTitoli listaTitoli;

 private Vector<Lotto> composizione;
 
 public Portafoglio (String nome, ElencoTitoli eleTit)
	{
	 denominazione = nome;
	 listaTitoli = eleTit;
	 composizione = new Vector<Lotto>();
	}

 public void addLotto(Lotto l)
	{
	 composizione.add(l);
	}
	
 public double valore()
	{
	 // da completare per effettuare simulazione
	}
	
	public void simulaVariazione ()
	 {
		listaTitoli.simulaVariazione(); 
		// metodo da completare nella classe ElencoTitoli
	 }
 
	 public String toString()
	 {
		 StringBuffer result = new StringBuffer();
			
		 result.append (String.format(DESC_DENOMINAZIONE, denominazione));
		 result.append (INTRO_COMPOSIZIONE);

		 for (int i = 0; i < composizione.size(); i++)
			{
			 result.append( composizione.get(i).toString() + "\n");
			}
			
		 result.append(String.format(DESC_TOTALE, valore()));
		 
		 return result.toString();
	 }

}

