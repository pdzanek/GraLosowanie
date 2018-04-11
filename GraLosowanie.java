import java.util.Random;
import java.util.Scanner;

public class GraLosowanie{
	public static void main(String[] args){
	int wylosowanaLiczba=losujLiczbe();	
	int podanaLiczba;
	System.out.println(wylosowanaLiczba);
	do{
		int liczbaProb=0;
		do{
			System.out.println("Podaj Liczbę: ");
			podanaLiczba=odczytajLiczbe();
			liczbaProb++;
			if(wylosowanaLiczba<podanaLiczba) System.out.println("Za dużo!");
			else if(wylosowanaLiczba>podanaLiczba) System.out.println("Za mało!");
			else System.out.println("Zgadłeś! Liczba prób:" +liczbaProb);
		}while(wylosowanaLiczba!=podanaLiczba);	
	}while(1!=1);
}
public static int odczytajLiczbe(){
		String odczytanaLiczba;
		Scanner odczyt = new Scanner(System.in);
		odczytanaLiczba=odczyt.nextLine();
		return Integer.parseInt(odczytanaLiczba);
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

