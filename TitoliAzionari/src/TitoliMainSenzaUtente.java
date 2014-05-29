import java.io.*;


class TitoliMain
{
  final private static String NOMEFILETITOLI = "titoli.dat";
  final private static String MSG_NO_CAST = "ATTENZIONE PROBLEMI CON IL CAST";
  final private static String MSG_OK_FILE = "CARICAMENTO DA FILE EFFETTUATO";
  final private static String MSG_NO_FILE = "NON POSSO CARICARE DA FILE: ESEGUO CREAZIONE DA ZERO";
  final private static String MSG_INTRO_PORTFOLIO = "SITUAZIONE PORTAFOGLIO";
  final private static String MSG_PROCEDI = "PROCEDERE CON LA SIMULAZIONE ?";
  final private static String MSG_SALVA = "SALVATAGGIO DATI";
  final private static String MSG_SALUTO = "GRAZIE PER AVER USATO IL NOSTRO PROGRAMMA";
  final private static String MSG_INTRO_GIORNO = "GIORNO N.%d NUOVA SITUAZIONE INVESTIMENTI";
  
  public static void main (String [] args)
	 {
	  File fTitoli = new File(NOMEFILETITOLI);
		
	  Portafoglio patrimonio = null;
		
	  boolean caricamentoRiuscito = false;
		
	  if ( fTitoli.exists() )
		{
		 try 
		  {
			patrimonio = (Portafoglio) ServizioFile.caricaSingoloOggetto(fTitoli);
			// metodo da completare nella classe ServizioFile
		   }
		  catch (ClassCastException e)
		   {
			 System.out.println(MSG_NO_CAST);
			}
		   finally
			{
		      if ( (patrimonio != null) )
			    {
				 System.out.println(MSG_OK_FILE);
				 caricamentoRiuscito = true;
				 }
			  }
			
		 }
			
		 if (!caricamentoRiuscito)
		   {
			System.out.println(MSG_NO_FILE);

		     Titolo t1 = new Titolo("DITTA_A", 1.1); // NOMI E VALORI NON HANNO ALCUN RIFERIMENTO ALLA SITUAZIONE REALE
		 	 Titolo t2 = new Titolo("DITTA_B", 2.2);
		 	 Titolo t3 = new Titolo("DITTA_C", 3.3);
			
		 	 ElencoTitoli borsa = new ElencoTitoli();
		 	 borsa.addTitolo(t1);
		 	 borsa.addTitolo(t2);
		 	 borsa.addTitolo(t3);
			
			 Lotto l1 = new Lotto (t1, 10);
		 	 Lotto l2 = new Lotto (t2, 20);
		 	 Lotto l3 = new Lotto (t3, 30);
			
		 	 patrimonio = new Portafoglio("PRIMA PROVA", borsa);
		 	 patrimonio.addLotto(l1);
		 	 patrimonio.addLotto(l2);
		 	 patrimonio.addLotto(l3);
		 }
		 
			
		 System.out.println(MSG_INTRO_PORTFOLIO);
		 System.out.println(patrimonio);
			
		 int giorni = 0;
		 while (InputDati.yesOrNo(MSG_PROCEDI))
			{
			 giorni++;
			 patrimonio.simulaVariazione();
			 System.out.println(String.format(MSG_INTRO_GIORNO, giorni));
		 	 System.out.println(patrimonio);
			}
			
			System.out.println(MSG_SALVA);
			ServizioFile.salvaSingoloOggetto(fTitoli, patrimonio);
			// metodo da completare nella classe ServizioFile
		    System.out.println(MSG_SALUTO);
					
	 }

}





