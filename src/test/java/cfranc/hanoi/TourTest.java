package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	@Test
	public void test() {
		//Tour vide, classe valide :
            	Disque disque = new Disque(1);
            	Tour tour = new Tour();
            	boolean result = tour.empiler(disque);
            	assertTrue("empillement de disque de taille 1 dans une tour vide", result);
            
            	Disque disque1 = new Disque(Integer.MAX_VALUE);
            	Tour tour1 = new Tour();
            	result = tour1.empiler(disque1);
            	assertTrue("empillement de disque de taille MAX_VALUE dans une tour vide", result);
            
            
            	//Tour vide, classe invalide :
            	Disque disque2 = new Disque(0);
            	Tour tour2 = new Tour();
            	result = tour2.empiler(disque2);
            	assertFalse("empillement de disque de taille 0 dans une tour vide", result);
            
            	Disque disque3 = new Disque(Integer.MAX_VALUE+1);
            	Tour tour3 = new Tour();
            	result = tour3.empiler(disque3);
            	assertFalse("empillement de disque de taille MAX_VALUE+1 dans une tour vide", result);
            
            
            	//Tour non vide mais pas pleine, classe valide :
            	Disque s = new Disque(2);
            	Tour tour4 = new Tour();
            	tour4.empiler(s);
            	Disque disque4 = new Disque(s.d-1);
            	result = tour4.empiler(disque4);
            	assertTrue("empillement de disque de taille s-1 dans une tour rempli avec un disque s", result);
            
            
            	//Tour non vide mais pas pleine, classe invalide :
            	Disque s1 = new Disque(2);
            	Tour tour5 = new Tour();
            	tour5.empiler(s);
            	Disque disque5 = new Disque(s1.d);
            	result = tour5.empiler(disque5);
            	assertFalse("empillement de disque de taille s dans une tour rempli avec un disque s", result);
            
            
            	//Tour pleine, classe invalide :
            	Disque s2 = new Disque(4);
            	Disque s3 = new Disque(3);
            	Disque s4 = new Disque(2);
            	Tour tour6 = new Tour();
            	tour6.empiler(s2);
            	tour6.empiler(s3);
            	tour6.empiler(s4);
            	Disque disque6 = new Disque(1);
            	result = tour6.empiler(disque6);
            	assertFalse("empillement de disque dans une tour pleine.", result);
	}

}
