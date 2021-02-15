/**
 *
 *  @author Koszykowski Krzysztof PD2198
 *
 */

package zad3;




public class BooksOnShelves 
{
	
	private int iloscKsiazek, pojemnoscPolki;
	
	public BooksOnShelves(int numOfBooks, int shelfCap) 
	{
		iloscKsiazek=numOfBooks;
		pojemnoscPolki=shelfCap;
	}
	
	public int getNumOfShelves()
	{
		int wynik;
		
		if (iloscKsiazek%pojemnoscPolki!=0)
		wynik=(iloscKsiazek/pojemnoscPolki)+1;
		else wynik=(iloscKsiazek/pojemnoscPolki);
		
		return wynik;
	}
	
	public int getBooksOnLastShelf()
	{
		int wynik;
		if (iloscKsiazek%pojemnoscPolki == 0) {return pojemnoscPolki;}
		else
		wynik=iloscKsiazek%pojemnoscPolki;
		return wynik;
		
	}
	
}
