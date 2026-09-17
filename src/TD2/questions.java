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
		
		System.out.println("Chaine actuelle: " + chain);
		chain.algorithme_inverserChaine();
		System.out.println("Chaine inversé: " + chain);
		chain.algorithme_inverserChaine();
		
		System.out.println("avant dernier noeud: " + chain.algorithme_avantDernierNoeud()); // 5
		
		System.out.println("premier noeud: " + chain.first()); // 8
		System.out.println("dernier noeud: " + chain.last()); // 2
		
		System.out.println("premier noeud (enlever): " + chain.removeFirst()); // 8
		System.out.println("premier noeud (enlever): " + chain.removeFirst()); // 4
		System.out.println("premier noeud (enlever): " + chain.removeFirst()); // 9
		System.out.println("taille: " + chain.size()); // taille 3
	}
}
