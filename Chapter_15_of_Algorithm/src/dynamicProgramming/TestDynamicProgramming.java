package dynamicProgramming;

public class TestDynamicProgramming {
			public static void main(String[] args) {
				int[] p={1,5,8,9,10,17,17,20,24,30};
				int n=10;
				DynamicProgramming dp=new DynamicProgramming();
				int maxProce=dp.memoizedCutRod(p, n);
				System.out.println(maxProce);
			}
}
