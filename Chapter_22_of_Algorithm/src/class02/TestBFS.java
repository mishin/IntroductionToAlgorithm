package class02;

public class TestBFS {

			public static void main(String[] args) {
				BFS bfs=new BFS();
				bfs.createGraph();
//				bfs.printGraph();
				bfs.breadthFirstSearch(2);
				bfs.printPath(1,2);
				bfs.printGraph();
			}
}
