public class Driver {

	public static void main(String[] args) {
		
		ArrayQ firstArrayQ = new ArrayQ();
		LinkedQueue firstLinkedQueue = new LinkedQueue();

		firstArrayQ.enqueue(1);
		firstArrayQ.enqueue(7);
		firstArrayQ.enqueue(3);
		firstArrayQ.enqueue(4);
		firstArrayQ.enqueue(9);
		firstArrayQ.enqueue(2);
		
		firstLinkedQueue.enqueue(1);
		firstLinkedQueue.enqueue(7);
		firstLinkedQueue.enqueue(3);
		firstLinkedQueue.enqueue(4);
		firstLinkedQueue.enqueue(9);
		firstLinkedQueue.enqueue(2);
		while(firstArrayQ.size() > 0) {
			System.out.println("Element " + firstArrayQ.size() + " from firstArrayQ dequeue: " + firstArrayQ.dequeue());
		}
		
		System.out.println();
		
		while(firstLinkedQueue.size() > 0) {
			System.out.println("Element " + firstLinkedQueue.size() + " from firstLinkedQueue dequeue: " + firstLinkedQueue.dequeue());
		}
		
		System.out.println();
		
		firstLinkedQueue.enqueue(1);
		firstLinkedQueue.enqueue(7);
		firstLinkedQueue.enqueue(3);
		firstLinkedQueue.enqueue(4);
		firstLinkedQueue.enqueue(9);
		firstLinkedQueue.enqueue(2);
		
		firstLinkedQueue.removeMiddle();
		
		
		System.out.println("firstLinkedQueue after removing the middle (round down) element: ");
		while(firstLinkedQueue.size() > 0) {
			System.out.println("Element " + firstLinkedQueue.size() + " from firstLinkedQueue dequeue: " + firstLinkedQueue.dequeue());
		}
	}

}