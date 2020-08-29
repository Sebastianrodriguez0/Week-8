
public class LinkedQueue {

	LinkedNode front;
	LinkedNode rear;
	int count;
	
	LinkedQueue() {
		front = rear = null;
		count = 0;
	}
	
	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear!=null)			
			rear.next = newNode;
		else 
			front = newNode;
		rear = newNode;
		count++;
	}
	
	int dequeue() {
		if (front==null) {
			return -1;
		}
		
		if (front!=rear) {
			int x = front.x;
			front = front.next;		
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count --;
			return x;
		}
	}
	public void removeMiddle() {
		int length = count;
		int mid = (count / 2);
		int number = 0;
		int[] arr = new int[length - 1];
		for (int i = 0; i < length; i++) {
			if(i != mid) {
				arr[number] = dequeue();
				number++;
			}else {
				dequeue();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			enqueue(arr[i]);
		}
	}
	
	int first() {
		return front.x;
	}
	
	boolean isEmpty() {
		return count==0;
	}
	
	int size() {
		return count;
	}
}