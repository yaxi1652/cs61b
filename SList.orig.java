public class SList{
	public class IntNode {
		public int item;
		public IntNode next;
	
		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	}

	private IntNode front;
	private int size;
	
	
	public SList(){
		front = null;
		size = 0;
	}
	
	public void insertBack(int x) {
		size += 1;
		
// Special Case for empty list or null front - not necessary with Sentinel code
		if (front == null){
			front = new IntNode(x, null);
			return;
		}

		IntNode p = front;
		while (p.next != null){
			p = p.next;
		}
		p.next = new IntNode(x, null);
	}
	
// Sentinel code for empty list or null front 
// 		IntNode p = sentinel;
// 		while (p.next != null) {
// 			p = p.next;
// 		}
// 		
// 		p.next = new IntNode(x, null);
// 	}
		

	
	public SList(int x) {
		front = new IntNode(x, null);
	}
	
	public void addFront(int x) {
		IntNode oldFront = front;
		front = new IntNode(x, oldFront);
	}
	
	public void insertFront(int x){
		front = new IntNode(x, front);
	}
	
	public int getFront(){
		return front.item;
	}
	
	private int size(IntNode p){
		if (p.next == null){
			return 1;
		}
		return 1 + size(p.next);
	}
	
	public int size(){
		return size(front);
	}
	
	
}