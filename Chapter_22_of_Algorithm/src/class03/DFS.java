package class03;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import class02.BFS;


/**
 * 深度优先搜索，用二维数组（矩阵）将图存储起来，处理起来会更方便一些。
 * @author liyafei
 *
 */
public class DFS {
	class Node{
		Node pre;
		Node link;
		String color;
		double d;  //本节点找到的时间
		double f;  //本节点结束的时间
		int key;    //通过key的值判断两个节点是否为同一个节点
		int start;
		int end;
		double weight=1;
	}
	List list=new ArrayList();
	double[][] weights;
	int time;
	int count=1;
	boolean[] nodeFound;
	

	
	public void dfs(){
		double[][] weis=getWeightArray();
		nodeFound=new boolean[weis.length];
		for (int i = 0; i < weis.length; i++) {
			nodeFound[i]=false;
		}
		
		for (int i = 0; i < list.size(); i++) {
			Node node=(Node) list.get(i);
			while(node!=null){
				node.color="WHITE";
				node.pre=null;
				node=node.link;
			}
			}
		
		time=0;
		for (int i = 0; i < weis.length; i++) {
			double[] adjvertex=weis[i];  //第i个节点的相邻节点
			Node node=(Node) list.get(i);
			if(node.color.equals("WHITE")){
				dfsVisit(node,adjvertex);
			}
		}

		
//		for (int i = 0; i < list.size(); i++) {
//			Node node=(Node) list.get(i);
//			if(node.color.equals("WHITE")){
//				dfsVisit(node);
//			}
//		}
		
	}
	private void dfsVisit(Node node, double[] adjvertex) {
		// TODO Auto-generated method stub
		time=time+1;
		node.d=time;
		Node nodeBak=(Node) list.get(node.key);
		nodeBak.color="GRAY";
		nodeBak=nodeBak.link;
		while(nodeBak.color.equals("WHITE")){
			nodeBak.pre=node;
			dfsVisit(nodeBak, adjvertex);
			nodeBak=nodeBak.link;
		}
//		for (int i = 0; i < adjvertex.length; i++) {
//			if(adjvertex[i]){
//				dfsVisit(node, adjvertex);
//			}
//		}
		node.color="BLACK";
		nodeFound[node.key]=true;
		time=time+1;
		node.f=time;
		
	}
	
	/**
	 * 得到创建的带有权重的图，读出相邻节点之间的距离，然后存储到二维数组weights中。
	 * 权重图的大小比节点多1，但是角标为0的位置都没用，为了处理存储的位置与节点的编号相一致
	 */
	public double[][] getWeightArray(){
		weights=new double[list.size()][list.size()];
		for (int i = 0; i < list.size(); i++) {
			Node node=(Node) list.get(i);
			while(node!=null){
			int row=node.start-1;
			int col=node.end-1;
			double weight=node.weight;
			weights[row][col]=weight;
			node=node.link;
			}
		}
		return weights;
	}
	
	/**
	 * 打印权重图
	 */
	public void printWeightGraph(){
		double[][] weightsArray=getWeightArray();
		for (int i = 0; i < weightsArray.length; i++) {
			double[] wa=weightsArray[i];
			for (int j = 0; j < wa.length; j++) {
				System.out.print(wa[j]+"    ");
			}	
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * 创建图，以链表的方式创建图
	 * 
	 * @return 返回图的链表形式，其中数组中每个位置是一个顶点的链表
	 */
	// public Node[] createGraph(){
	public List createGraph() {
		Class clazz = this.getClass();
		InputStream ins = clazz.getResourceAsStream("/data1.txt"); // 通过外部数据创建链表,使用/加载src目录下的文件
																	// 不使用/是加载类路径下的文件
		Scanner scanner = new Scanner(ins); // 流输入。
		while (scanner.hasNextLine()) {
			String s = scanner.nextLine();
			Scanner oneLine = new Scanner(s);
			Node first = null;
			Node newNode = null, last = null;
			while (oneLine.hasNext()) {
				String s1 = oneLine.next();
				int num = Integer.parseInt(s1);
				if (num == 999)
					break;
				newNode = new Node();
				newNode.key=num;
				newNode.end = num;
				newNode.start = count;
				newNode.link = null;
				if (first == null) {
					newNode.end = count;
					newNode.weight=0;
					first = newNode;
					last = newNode;
				} else {
					last.link = newNode;
					last = newNode;
				}
			}
			list.add(first);
			count++;
		}
		return list;
	}
}
