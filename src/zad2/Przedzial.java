/**
 *
 /**
 *
 *  @author Koszykowski Krzysztof PD2198
 *
 */

package zad2;


public class Przedzial {

  private int pocz, koniec;

  public Przedzial(int a, int b) //konstruktor klasy Przedzial
  {
	  pocz = 	Math.min(a, b); //znalezienie poczatku przedzialu
	  koniec = 	Math.max(a, b); //znalezienie konca przedzialu
  }

  Przedzial przeciecie(Przedzial p)
  {
	  Przedzial wspolny = new Przedzial(0,0);  //zdefiniowanie nowego obiektu klasy Przedzial
	  if ((p.poczatek()>this.koniec())||(p.koniec()<this.poczatek())) {return null;}  // sprawdzenie warunku rozlacznosci przedzialow
	  else
	  {
	
		  if (this.poczatek() < p.poczatek())  //pzdzial p znalduje sie  po prawej stronie this
		  {
			  wspolny.pocz=p.poczatek();
			  wspolny.koniec=this.koniec();
		  }
		  
		  if (p.koniec()<this.koniec()) //przedial p znajduje sie po lewej stronie this
		  {
			  wspolny.pocz=this.poczatek();
			  wspolny.koniec=p.koniec();
		  }
		  
		  if ((this.poczatek()<p.poczatek())&&(this.koniec()>p.koniec())) //przedzial p zawiera sie w this
		  {
			  wspolny=p;
		  }
		  
		  if ((this.poczatek()>p.poczatek())&&(this.koniec()<p.koniec())) //przedzial this zawiera sie w p
		  {
			  wspolny=this;
		  }
		  
	  } return wspolny;
     
  }
  
  
  /*<-  kod innych metod */
  
  public String toString()
  {
	  return ("["+this.poczatek()+","+this.koniec()+"]");
  }
  public int poczatek()	//metoda zwracająca początek przedziału
  {
	 return pocz;
  }
 
  public int koniec()   //metoda zwracająca koniec przedziału
  {
	 return koniec;
  }
}


