class Queue{

	int[] Q;
	int front, rear,size = 10, curr_size = 0;
	Queue(){
		front = curr_size;
		rear = size - 1;
		Q = new int[size];
	}

	boolean isFull(){
		if (size == curr_size){
			return true;
		}
		else {
			return false;
		}
	}

	boolean isEmpty(){
		if (curr_size == 0){
			return true;
		}
		else {
			return false;
		}
	}

	void enQueue(int x){
		if(!isFull()){
			rear = (rear+1)%size;
			Q[rear] = x;
			curr_size ++;
		}

		else{
			return;
		}
		
	}

	void deQueue(){
		if(!isEmpty()){
			front = (front+1)%size;
			curr_size--;
		}
		return;
		
	}

	void display(){
		for(int i = front; i<= rear; i++){
			System.out.println(Q[i]);
		}
	}
}

public class Q{
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		q.enQueue(60);
		q.deQueue();
		q.display();
	}
}