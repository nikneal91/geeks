
public class MaxHeap {

	class PriorityQueue {
		private Integer[] heap;
		private Integer lastindex;
	
	public PriorityQueue(Integer size) {
		heap =new Integer[size];
		this.lastindex=0;
	}
	
	
	private void shiftUp() {
		int index = lastIndex;
		int parentIndex = parent(index);
		while (parentIndex > 0 && heap[index] > heap[parentIndex]) {
			swap(index,parentIndex);
			index=parentIndex;
			parentIndex = parent(parentIndex);
		}
		
	}
	
	private void shiftDown() {
		int index=1;
		while ( index < lastIndex) {
			int maxValue=heap[index];
			int maxIndex = index;
			int leftIndex = left(index);
			if ( leftIndex >0 && maxValue < heap[leftIndex]) {
				maxValue = heap[leftIndex];
				
			}
			
		}
		
	}
	
	private int parent(int index) {
		if ( index <=1) return 0;
		return index/2;
	}
	
	private int left(int parent) {
		int leftchild = parent*2;
		return  leftchild <= lastindex ? leftchild : 0;
	}
	
	private int right(int parent) {
		int rightchild = parent*2 +1;
		return  rightchild <= lastindex ? rightchild : 0;
	}
	
	private void swap(int index1 , int index2) {
		int temp = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] =temp;
	}
	
	
	}
	
	
	
	
	public static void main(String[] args) {

		
		
		
	}

}
