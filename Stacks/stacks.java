class Stack{

	int pointer;
	int[] arr = new int[10];

	Stack(){
		pointer = -1;
	}

	public boolean isEmpty(){
		if(pointer == -1){
			return true;
		}

		return false;
	}

	public void push(int x){
		arr[++pointer] = x;
	}

	public int pop(){
		if(!isEmpty()){
			int poped = arr[pointer];
			--pointer;
			return poped;
		}
		return 0;
	}

	public int peek(){
		if(!isEmpty()){
			System.out.println(arr[pointer]);
		}
		return 0;
	}

	public void getStack(){
		for(int i = pointer; i >= 0; i--){
			System.out.println(arr[i]);
		}
	}
}

public class stacks{


	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.getStack();
		System.out.println();
		s.peek();
	}

}
