package it.unibs.ingSW;

import it.unibs.fp.mylib.*;

public class Menu 
{
	public static void main(String[] args) throws Exception{
		int scelta = 0;
		do 
		{
			System.out.println("V1\n\nMenu principale [utente: configuratore]\n1) Gestione reti N\n\n0) Esci");
			scelta = InputDati.leggiIntero("Selezionare una delle voci del menu:", 0, 2);
			switch (scelta)
			{
				case 1: 
					System.out.println("\n");
					reti();
				break;
				default:
					System.out.println("Uscita in corso...");
					break;
			}
		} 
		while (scelta != 0);
	}
	
	public static void reti(){
		int scelta = 0;
		do 
		{
			System.out.println("Menu principale Reti N [utente: configuratore]\n1) Inserisci descrizione \n2) Visualizza descrizione \n\n0) Esci");
			scelta = InputDati.leggiIntero("Selezionare una delle voci del menu:", 0, 2);
			switch (scelta)
			{
				case 1: 
					AggiungiN aggiungi = new AggiungiN();
					aggiungi.add();
					System.out.println("\n");
				break;
				case 2:
					VisualizzaN visualizza = new VisualizzaN();
					visualizza.print();
					System.out.println("\n");
				break;
				default:
					System.out.println("\n");
				break;
			}
		} 
		while (scelta != 0);
	}
}
