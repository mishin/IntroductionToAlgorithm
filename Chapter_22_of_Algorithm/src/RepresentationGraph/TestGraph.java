package RepresentationGraph;

import java.util.List;

import RepresentationGraph.Graph.Node;

/**
 * 图测试类
 * @author liyafei
 *
 */
public class TestGraph {
			public static void main(String[] args) {
				Graph g=new Graph(100,0);
//				Node[] graph=g.createGraph();   //以数组的形式创建列表
//				List list=g.createGraph();                 //以数组列表的形式创建图结构
//				for (int i = 0; i < list.size(); i++) {
//					Node first=(Node) list.get(i);
//					if(first==null){
//						break;
//					}
//					while(first!=null){
//						System.out.print(first.key);
//						first=first.link;
//					}
//					System.out.println("");
//				}
			g.createGraph();
			g.printGraph();
			}
}
