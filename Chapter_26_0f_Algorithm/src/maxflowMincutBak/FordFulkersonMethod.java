package maxflowMincutBak;

import java.util.List;

/**
 * FordFulkerson 方法求最大流问题，每次从残存网路中找到一个最短距离和最小容量，将其加到最大流值上，
 * 直到最后最小容量为0，结束。
 * @author liyafei
 *
 */
public class FordFulkersonMethod {
			DijkstraAlgorithm da=new DijkstraAlgorithm(100, 0);
			int vertex=0,end=4;
			public void fordFulkerson(){
				List list=da.createGraph("/page425InAlgorithm");
//				List list=da.createGraph("/page425InAlgorithm.txt");
				List<List> list2=da.shortestPathOfBFS(vertex, end);
				double d=da.minValueofPath( list2.get(end));
				da.printShortestPathOfBFS(vertex, end);
			}
}
