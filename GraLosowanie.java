import java.util.Random;
import java.util.Scanner;

public class GraLosowanie{
	public static void main(String[] args){
	do{
		System.out.println("Rozpoczęto nową grę.");
		rozpocznijGre();
		System.out.println("Aby zagrać ponownie wpisz t, lub dowolny znak by zakończyć.");
	}while(sprawdzZnak());
}
public static void rozpocznijGre(){
	int wylosowanaLiczba;
	int podanaLiczba;
	int liczbaProb=0;
	wylosowanaLiczba=losujLiczbe();
	System.out.println("Wylosowana liczba " + wylosowanaLiczba);
	do{
		System.out.println("Podaj liczbę: ");			
		podanaLiczba=odczytajLiczbe();
		liczbaProb++;
		if(wylosowanaLiczba<podanaLiczba) System.out.println("Za dużo!");
		else if(wylosowanaLiczba>podanaLiczba) System.out.println("Za mało!");
		else System.out.println("Zgadłeś! Liczba prób:" +liczbaProb);
	}while(wylosowanaLiczba!=podanaLiczba);
}

public static boolean sprawdzZnak(){
		String odczytanyTekst;
		Scanner odczytTekstu = new Scanner(System.in);
		odczytanyTekst=odczytTekstu.nextLine();
		if(	odczytanyTekst.toLowerCase().equals("t")) return true;
		else return false;
}
public static int odczytajLiczbe(){
		Scanner odczytLiczby = new Scanner(System.in);
		String odczytanaLiczba;
		int odczytanyInt=0;
		int inputOut=0;
		do{
			try{
				odczytanaLiczba=odczytLiczby.nextLine();
				odczytanyInt=Integer.parseInt(odczytanaLiczba);
				if (odczytanyInt<0) throw new NumberFormatException();
				inputOut=1;
			}
			catch(NumberFormatException e){
				System.out.println("Podana wartość powinna być liczbą całkowitą dodatnią!");
				System.out.println("Podaj liczbę:");
			}
		}while(inputOut==0);	
		return odczytanyInt;
}

public static int losujLiczbe(){
		Random generator = new Random();
		int wylosowanaLiczba;
		do{
			double wLiczba = (generator.nextGaussian() *50 +25);
			wylosowanaLiczba = (int) (Math.abs(wLiczba));		
		}while(wylosowanaLiczba>100);
		return wylosowanaLiczba;
	}
}

