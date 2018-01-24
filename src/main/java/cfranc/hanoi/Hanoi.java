package cfranc.hanoi;

public class Hanoi {
	
	Tour tourInit;
	Tour tourInter;
	Tour tourDest;

	public Hanoi(int n){
		this.tourInit = new Tour(n);
		this.tourInter = new Tour(n);
		this.tourDest = new Tour(n);
		    
		for(int i = n ; i > 0 ; i--){
		    Disque d = new Disque(i);
		    tourInit.empiler(d);
		}
	}

	
	public Hanoi(){
		tourInit = new Tour();
		tourInter = new Tour();
		tourDest = new Tour();
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		tourInit.empiler(grand);
		tourInit.empiler(moyen);
		tourInit.empiler(petit);
	}
	
	public void bougerSommet(Tour from, Tour to) {
		Disque disqueADeplacer = from.depiler();  
        	if(disqueADeplacer != null){
    	        to.empiler(disqueADeplacer);                 
	        } 
	}

	public void deplacer(int nbDisque, Tour from, Tour to, Tour by){
		if (nbDisque > 0) {
			deplacer(nbDisque-1, from, to, by);
			bougerSommet(from, to);
			deplacer(nbDisque-1, by, to, from);
		}
	}

	public void jouer() {
		deplacer(tourInit.taille(), tourInit, tourDest, tourInter);
	}

	public static void main(String[] args) {
		// Compl�ter la classe Hanoi pour r�soudre le jeux avec 3 disques :
		Hanoi game = new Hanoi();
                System.out.println("--------Tour hanoi de taille 3 :--------");
		System.out.println("Tour initiale avant jeu vide ? : "+game.tourInit.estVide());
                System.out.println("Tour intermediare avant jeu vide ? :"+game.tourInter.estVide());
		System.out.println("Tour destination avant jeu vide ? :"+game.tourDest.estVide());
		System.out.println("-------------------Jeu-------------------");
                game.jouer();
		System.out.println("Tour initiale apr�s jeu vide ? : "+game.tourInit.estVide());
                System.out.println("Tour intermediare apr�s jeu vide ? : "+game.tourInter.estVide());
		System.out.println("Tour destination apr�s jeu vide ? : "+game.tourDest.estVide());
                System.out.println("----------------Fin du jeu----------------\n");
		
		// Compl�ter la classe Hanoi pour r�soudre le jeux avec n disques :
		int n =20; //Au-del� de 25, sur ma machine, le temps de calcul commence � �tre tr�s long, j'ai donc modifi� la valeur initial de n de 100 � 20.
		Hanoi gameN = new Hanoi(n);
                System.out.println("--------Tour hanoi de taille "+n+" :--------");
		System.out.println("Tour initiale avant jeu vide ? : "+gameN.tourInit.estVide());
                System.out.println("Tour intermediare avant jeu vide ? : "+game.tourInter.estVide());
		System.out.println("Tour destination avant jeu vide ? : "+gameN.tourDest.estVide());
		System.out.println("-------------------Jeu-------------------");
                gameN.jouer();
		System.out.println("Tour initiale apr�s jeu vide ? : "+gameN.tourInit.estVide());
                System.out.println("Tour intermediare apr�s jeu vide ? : "+game.tourInter.estVide());
		System.out.println("Tour destination apr�s jeu vide ? : "+gameN.tourDest.estVide());
                System.out.println("----------------Fin du jeu----------------");
		
	}

}
