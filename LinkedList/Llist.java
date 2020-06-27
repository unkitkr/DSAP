class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
	}
}

class linkedList{
	Node head;
	void insertBack(int data){
		Node new_node = new Node(data);
		new_node.next = null;
		if(head == null){
			head = new_node;
		}
		else{
			Node currentNode = head;
			while(currentNode.next != null){
				currentNode = currentNode.next;
			}
			currentNode.next = new_node;
		}
	}

	void insertFront(int data){
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	void insertAfter(int pos, int data){
		Node new_node = new Node(data);
		Node currentNode = head;
		int counter = 0;
		while(pos != counter){
			currentNode = currentNode.next;
			counter++;
		}
		new_node.next = currentNode.next;
		currentNode.next = new_node;
		
	}

	void insertBefore(int pos, int data){
		insertAfter(--pos,data);
	}

	void showList(){
		Node currentNode = head;
		while(currentNode != null){
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	int listLength(){
		Node currentNode = head;
		int counter = 0;
		while(currentNode != null){
			currentNode = currentNode.next;
			counter++;
		}

		return counter;
	}

	void deleteNode(int pos){
		Node currentNode = head;
		if(pos == 0){
			head = head.next;
		}
		else if(pos>0 && pos<listLength()){
			pos--;
			int counter = 0;
			while(pos != counter){
				currentNode = currentNode.next;
				counter++;
			}
			System.out.println(counter);
			Node k = currentNode.next.next;
			currentNode.next = k;
		}

		else {
			int counter = 0;
			while(currentNode.next.next != null){
				currentNode = currentNode.next;
			}
			currentNode.next = null;
			// System.out.println(currentNode.data);

		}
	}
}

public class Llist{
	public static void main(String[] args) {
		linkedList llist = new linkedList();
		llist.insertBack(20);
		llist.insertBack(30);
		llist.insertBack(40);
		llist.insertFront(50);
		llist.deleteNode(4);
		llist.deleteNode(0);
		llist.showList();
	}
}