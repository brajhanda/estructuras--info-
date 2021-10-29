/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Tem
 */
package co.edu.ucundinamarca.tallern;

public class Hanoi {
    private Pil int tubo;             
    private final int dis;       
    
    public Hanoi () { 
	this(3);
    }

     
    public Hanoi (int n) {
	System.out.println("Torres de Hanoi");
	dis = n;

	tubo = new Pil [4];  
	for (int i = 1; i < 4; i++)
	    tubo[i] = new Pil();

			
	for (int i = dis; i > 0; i--)
	    tubo[1].push(new Integer(i));

	System.out.println("Las torres inicialmente tienen ");
	pinta();

  	
	FIN(dis, 1, 2, 3);
    }

   
    public void pinta () {
	java.util.Iterator it1 = tubo[1].iterador();
	java.util.Iterator it2 = tubo[2].iterador();
	java.util.Iterator it3 = tubo[3].iterador();

	System.out.println("Palo1 / Palo2 / Palo3");
	for(int i = 0; i < dis; i++) {
	    if (it1.hasNext())
		DISCOS(((Integer)it1.next()).intValue());
	    else System.out.print("  \t\t");

	    if (it2.hasNext())
		DISCOS(((Integer)it2.next()).intValue());
	    else System.out.print("  \t\t");

	    if (it3.hasNext())
		DISCOS(((Integer)it3.next()).intValue());
	    System.out.println();
	}
    }

   
    private void DISCOS(int n){
	for (int i=0; i < n; i++)
	    System.out.print("*");
	System.out.print("\t\t");
    }

   
    private void FIN (int n, int p1, int p2, int p3) {
	if (n > 0) {
	    FIN(n-1, p1, p3, p2);
	    Object disco = tubo[p1].pop();
	    tubo[p2].push(disco);
	    pinta();
	    FIN(n-1, p3, p2, p1);
	}
    }
}