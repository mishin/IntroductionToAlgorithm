package heapify;

/**
 * 堆
 * @author admin
 *
 */
public class Heapify {

	/**
	 * 返回输入节点的父节点序号
	 * @param i 输入节点的序号
	 * @return
	 */
	public int parent(int i){
		return i/2;  //父节点角标
	}
	public int left(int i){
		return 2*i;
	}
	public int right(int i){
		return 2*i+1;
	}
	/**
	 * 维护最大堆的性质
	 * @param arr 最大堆的数组表示形式
	 * @param i 向最大堆中插入的序号
	 */
	public void maxHeapify(int[] arr,int i){
		int largest;
		int l=left(i);
		int r=right(i);
		if(l<=arr.length && arr[l]>arr[i]){
			largest=l;
		}else{
			largest=i;
		}
		if(r<=arr.length && arr[r]>arr[largest]){
			largest=r;
		}
		if(largest!=i){
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=arr[i];
			maxHeapify(arr, largest);
		}
	}
	public void buildMaxHeapify(int[] arr){
		int heapSize=arr.length;
		for (int i = heapSize/2; i >=1 ; i--) {
			maxHeapify(arr, i);
		}
	}
	public void heapSort(int[] arr){
		int heapSize=arr.length;
		buildMaxHeapify(arr);
		for (int i = arr.length/2; i >=2; i--) {
			int temp=arr[i];
			arr[i]=arr[1];
			arr[1]=temp;
			heapSize=heapSize-1;
			maxHeapify(arr, 1);
		}
	}
	private void heap() {
		// TODO Auto-generated method stub
		
	}
}
