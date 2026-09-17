package TD2;

public class questions {
	public static void main(String[] args) {
		// Création d'une chaîne
		SinglyListClass chain = new SinglyListClass();
		chain.addLast(4);
		chain.addLast(9);
		chain.addLast(1);
		chain.addFirst(8);
		chain.addLast(5);
		chain.addLast(2);
		// On devrait avoir [8, 4, 9, 1, 5, 2]
		System.out.println("taille: " + chain.size()); // taille 6
		System.out.println("avant dernier noeud: " + chain.algorithme_avantDernierNoeud()); // 5
		
	}
}
