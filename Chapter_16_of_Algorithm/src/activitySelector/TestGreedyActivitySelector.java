package activitySelector;

public class TestGreedyActivitySelector {
			public static void main(String[] args) {
				GreedyActivitySelector gas=new GreedyActivitySelector();
				String[] a={"a0","a1","a2","a3","a4","a5","a6","a7","a8","a9"};
				int[] s={1,3,5,8,9,13,15,19,20,30};
				int[] f={4,6,9,13,19,29,30,31,34,38};
				String string=gas.greedyactiivitySeletor(a, s, f);
				System.out.println(string);
			}
}
