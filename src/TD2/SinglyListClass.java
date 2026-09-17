package TD2;

public class SinglyListClass {
	// Node class
	private static class Node {
		// Private variables
		private Integer element;
		private Node next;
		
		// Constructor
		public Node(Integer s, Node n) {
			this.element = s;
			this.next = n;
		}
		
		// Methods
		public Integer getElement() {
			return element;
		}
		public Node getNext() {
			return next;
		}
		public void setElement(Integer newElement) {
			this.element = newElement;
		}
		public void setNext(Node newNext) {
			this.next = newNext;
		}
	}
	
	// Private variables
	private Node head;
	private long size;
	
	// Constructor
	public SinglyListClass() {
		// Chaine vide
		this.head = null;
		this.size = 0;
	}
	
	// Methods
	public long size() {
		return size;
	}
	public boolean isEmpty() {
		return (size == 0);
	}
	public Integer first() {
		if (head != null) {
			return head.getElement();
		} else {
			return null;
		}
	}
	public Integer last() {
		if (head != null) {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			return current.getElement();
		} else {
			return null;
		}
	}
	public void addFirst(Integer e) {
		this.size++;
		Node newElement = new Node(e, this.head);
		// La tête devient le nouveau élément
		this.head = newElement;
	}
	public void addLast(Integer e) {
		this.size++;
		Node newElement = new Node(e, null);
		if (head != null) {
			// On fait en sorte que le next du dernier noeud soit le nouveau élément
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newElement);
		} else {
			// Chaîne vide, donc on initialise le premier élément
			this.head = newElement;
		}
	}
	public Integer removeFirst() {
		if (head != null) {
			this.size--;
			
			// On récupère le premier élément
			Integer firstElement = head.getElement();
			// Le deuxième noeud prend la place du premier
			Node secondNode = head.getNext();
			head.setNext(null);
			// On met le second noeud comme tête (le premier noeud sera automatiquement détruit car aucune variable ne lui fait référence)
			head = secondNode;
			// On retourne le premier élément qui à été enlever
			return firstElement;
		} else {
			return null;
		}
	}
	
	// Question 1.2 - 1
	public Integer algorithme_avantDernierNoeud() {
		if (head != null && head.getNext() != null) {
			Node current = head;
			while (current.getNext().getNext() != null) {
				current = current.getNext();
			}
			return current.getElement();
		} else {
			return null;
		}
	}
}
