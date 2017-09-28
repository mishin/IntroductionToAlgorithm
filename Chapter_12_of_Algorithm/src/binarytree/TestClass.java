package binarytree;

import binarytree.BinaryTree.Node;

/**
 * 二叉树测试类
 * @author liyafei
 *
 */
public class TestClass {
				public static void main(String[] args) {
					BinaryTree<Integer> bt=new BinaryTree<>();
					bt.insert(5);
					bt.insert(9);
					bt.insert(6);
					bt.insert(3);
					bt.insert(5);
					bt.insert(9);
					bt.insert(6);
					bt.insert(2);
					Node node=bt.root;
					bt.print(node);
					
					bt.delete(3);
					bt.print(node);
				}
}
