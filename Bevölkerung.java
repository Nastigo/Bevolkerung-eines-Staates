import Prog1Tools.IOTools;
public class Bev�lkerung {

	public static void main(String[] args) {
		double bwp, bwph, ez, ezh;  //bwp-Bev�lkerungswachstum in %, bwph-Bev�lkerungswachstum heute in %, ez-Einwihnerzahl, ezh-einwohnerzahlheute
		int aj, ej; // aj-anfangsjahr, ej-endjahr
		int i; //Z�hlvariable deklarieren
		
		ez=IOTools.readDouble("Einwohnerzahl: ");
		bwp=IOTools.readDouble("Bev�lkerungswachstum in %: ");
		aj=IOTools.readInteger("Anfangsjahr: ");
		ej=IOTools.readInteger("Endjahr: ");
		i=aj;
		
		do {
			bwph=ez*bwp/100;
			ezh=ez+bwph;			
			
			System.out.printf("%d",i);
			System.out.printf("   ");
			System.out.printf ("%.2f",ez);
			System.out.printf("      ");
			
			System.out.printf ("%.2f",bwph);
			System.out.print("      ");
			System.out.printf ("%.2f",ezh);
		
			System.out.println();

			
			ez=ezh;
			aj=ej;
			i++; //i=i+1
		}

		while(i<=ej); //solange Bedienung erf�llt bleibe in die Schleife
			
	}

}
