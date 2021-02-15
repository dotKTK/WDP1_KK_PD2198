/**
 *
 *  @author Koszykowski Krzysztof PD2198
 *
 */

package zad1;


public class Main {
  public static void main(String[] args) {

    int a =  6,            // liczby biorace udzial w sumowaniu 
        b =  9,            // i mnozeniu oznaczam przez: a, b, c  
        c = 18;
   System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));  //suma
   
   System.out.println(a+"*"+b+"*"+c+"="+(a*b*c));	//iloczyn
   
   double dzielnik=2,wynik=((a/dzielnik)+(b/dzielnik)+(c/dzielnik)); //suma połówek
   System.out.println(a+"/2+"+b+"/2+"+c+"/2="+wynik);
   
   dzielnik=3;											
	wynik=((a/dzielnik)+(b/dzielnik)+(c/dzielnik));	 //suma jednej trzeciej
   System.out.println(a+"/3+"+b+"/3+"+c+"/3="+wynik);
 }
}
 