package binarytree;


/**
 * 二叉树结构
 * @author liyafei
 * 
 * @param <T>  参数T是红黑树能够操作存储的泛型，红黑树是一种数据结构，因此树中节点需要存储数据，而T作为参数类型
 *                              保证了红黑树能够存储任意类型的数据，当然一个节点中也可以存储多个数据。另外由于本次测试代码，
 *                              使用的是整形类型，因此使T继承了Comparable接口， 使其具有比较功能，这样书中节点插入删除时，
 *                              可以通过比较大小，来确定插入，删除的位置。	
 */
public class BinaryTree<T extends Comparable<T>> {
	Node<T> root = null;
	/**
	 * 节点类包含四个属性
	 * @author liyafei
	 *
	 * @param <T>
	 */
	public class Node<T extends Comparable<T>> {
		Node leftChild;
		Node rightChild;
		Node parent;
		T key;
	}

	/**
	 * 打印节点泛型值
	 * @param node
	 */
	public void print(Node node) {
		System.out.println(node.leftChild.key);
	}
	
	/**
	 * 根据泛型值删除节点
	 * @param key
	 */
	public void delete(T key){
		Node temNode=new Node();
		Node newNode=new Node();
		newNode.key=key;
		temNode=root;
		while(newNode.key!=temNode.key){                      //先找到要被删除的节点
		if(temNode.key.compareTo(newNode.key)<0){
			temNode=temNode.rightChild;
		}else
			temNode=temNode.leftChild;
	}
		if(temNode.leftChild==null){
			transplant(temNode,temNode.rightChild);
		}else if(temNode.rightChild==null){
			transplant(temNode, temNode.leftChild);
		}
		else{
			Node minRight=minimum(temNode.rightChild);
			if(minRight.parent!=temNode){
				transplant(minRight, minRight.rightChild);
				minRight.rightChild=temNode.rightChild;
				minRight.rightChild.parent=minRight;
			}
			transplant(temNode, minRight);
			minRight.leftChild=temNode.leftChild;
			minRight.leftChild.parent=minRight;
		}
	}
//	public void delete(T key){
////		Node newNode=new Node();
////		newNode.key=key;
////		Node tem=root;
////		
////		
////			if (newNode.key.compareTo(tem.key) < 0) {
////				tem = tem.leftChild;
////			} else {
////				tem = tem.rightChild;
////			}
////		}
	//tem是最后和给定值相等的节点。
//		if (tem.rightChild==null)
//				transplant();
//		else if  tem.rightChild==null
//				transplant();
//		else y=treeMinimum(tem.rightChild)   //右孩子中的最小值。
//				if (y.p!=z)
//				    transplant(t,y,y.right)
//				    y.right=z.right
//				    y.right.p=y
//				  Transplant(T,z,y)
//		y.left.p=z.left
//	}
//
//	private void transplant() {
//		// TODO Auto-generated method stub
//		
//	}
    /**
     * 找到某一节点的最小值
     * @param rightChild
     * @return
     */
	private Node minimum(Node rightChild) {             //二叉树中的最小值
		// TODO Auto-generated method stub
		while(rightChild.leftChild!=null){
			rightChild=rightChild.leftChild;
		}
		return rightChild;
	}

	/**
	 * 将两个节点交换
	 * @param temNode   交换的节点
	 * @param rightChild   交换的右子节点
	 */
	private void transplant(Node temNode, Node rightChild) {           
		// TODO Auto-generated method stub
		if(temNode.parent==null){
			root=rightChild;
		}else if(temNode.key.compareTo(temNode.parent.leftChild.key)==0){
			temNode.parent.leftChild=rightChild;
		}else{
			temNode.parent.rightChild=temNode;
		}
		if(rightChild!=null){
			rightChild.parent=temNode.parent;
		}
	}

	
	
	
	
	/**
	 * 插入节点，根据插入节点的泛型值大小决定插入的位置
	 * @param key
	 */
	public void insert(T key) { // 向二叉树中插入
		Node newNode = new Node();
		newNode.key = key;
		Node tem = root;
		Node p = null;
		while (tem != null) {
			p = tem;
			if (newNode.key.compareTo(tem.key) < 0) {
				tem = tem.leftChild;
			} else {
				tem = tem.rightChild;
			}
		}
		newNode.parent = p;

		if (p == null) {                           //二叉树为空时。
			root = newNode;

		} else if ((newNode.key).compareTo(p.key) < 0) {

			p.leftChild = newNode;
		} else {
			p.rightChild = newNode;
		}
	}

}
