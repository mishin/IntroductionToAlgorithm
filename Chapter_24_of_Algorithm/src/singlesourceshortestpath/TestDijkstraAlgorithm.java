package singlesourceshortestpath;


public class TestDijkstraAlgorithm {
	public static void main(String[] args) {
		DijkstraAlgorithm da=new DijkstraAlgorithm(100,0);
		da.createGraph();
		da.printGraph();
		da.printWeightGraph();
		da.shortestPathOfBFS(2);
		da.printShortestPathOfBFS(2);
	
	}
}
