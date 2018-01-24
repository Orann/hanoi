package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {

	@Test
	public void testCompareTo() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);

		assertEquals("petit disque comparé à un petit disque", 0, petit.compareTo(petit));
            
            	assertEquals("petit disque comparé à un moyen disque : ", -1, petit.compareTo(moyen));
	    	assertEquals("moyen disque comparé à un petit disque : ", 1, moyen.compareTo(petit));
	    
	    	assertEquals("petit disque comparé à un grand disque : ", -1, petit.compareTo(grand));
	    	assertEquals("grand disque comparé à un petit disque : ", 1, grand.compareTo(petit));
	    
	    	assertEquals("moyen disque comparé à un grand disque : ", -1, moyen.compareTo(grand));
	    	assertEquals("grand disque comparé à un moyen disque : ", 1, grand.compareTo(moyen));		
	}

}
