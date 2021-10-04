package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	public static void main(String[] args) {
	int[] tabell1 = { 1, 4, 6, };
	int[] tabell2 = { 1 }; 
	int[] tabell4 = {9,8,5,3,2,1,6,4};
	System.out.println("Oppgave a - Skriv ut");
	skrivUt(tabell1);skrivUt(tabell2);skrivUt(tabell4);
	System.out.println("Oppgave b - Til streng");
	System.out.println(tilStreng(tabell4));
	System.out.println("Oppgave c - Summer");
	System.out.println(summer(tabell1));
	System.out.println("Oppgave D - Finnes tallet?");
	System.out.println(finnesTall(tabell1,1));
	System.out.println("Oppgave E - Posisjon tall");
	System.out.println(posisjonTall(tabell1,6));
	System.out.println("Oppgave F - Reverser");
	skrivUt(reverser(tabell4));
	System.out.println("Oppgave G - Er tabell sortert?");
	System.out.println(erSortert(tabell1));
	System.out.println(erSortert(tabell4));
	System.out.println("Oppgave H - Slå sammen to tabeller");
	settSammen(tabell1, tabell4);
	}
	
	// a)
	public static void skrivUt(int[] tabell) {
		for(int i:tabell) {
			System.out.print(i + " ");
		}System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tekst = "[";
		for(int i=0;i<tabell.length;i++) {
			if(i==tabell.length-1) {
				tekst += tabell[i];
			}else {
				tekst += tabell[i]+",";
			}
		}
		tekst = tekst+"]";
		return tekst;
	}
	// c)
	public static int summer(int[] tabell) {
	//utvidet forløkke	
		int sum = 0;
		for(int i:tabell) {
			sum += i;
		}return sum;
	/* forløkke
	  int sum=0;
	  for(int i =0; i<tabell.length;i++){
	  sum += (tabell[i]);
	  }
	 * return sum;

		int sum=0;
		int i=0;
	 	while(i<tabell.length){
	 	sum+=tabell[i]
	 	i++
	 	}
	 return sum;
	 */
		
	}
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		int i =0;
		while(!finnes && i<tabell.length) {
			if(tabell[i]== tall) {
				finnes = true;
			}else {
				i++;
			}
		}
		return finnes;
	}
	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int i = 0;
		while(i<tabell.length) {
			if (tabell[i]==tall) {
				return i;
			}
			i++;
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int nyTabellEn [] = new int [tabell.length];
		int j=0;
		for(int i=tabell.length-1;i>=0;i--) {
			nyTabellEn[j]=tabell[i];
			j++;
		}
		return nyTabellEn;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert=true;
		int i = 0;
		while (sortert && i<tabell.length-1) {
			if (tabell[i] < tabell[i+1]) {
				i++;
			}else {
				sortert=false;
			}
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[]nyTabell = new int[tabell1.length + tabell2.length];
		for(int i =0; i<tabell1.length; i++) {
			nyTabell[i]=tabell1[i];
			}
		for(int j =0; j< tabell2.length; j++) {
			nyTabell[tabell1.length + j] = tabell2[j];
		}
		return nyTabell;	
		}
}
