package dynamicProgramming;

public class TestDynamicProgramming {
			public static void main(String[] args) {
				int[] p={0,1,5,8,9,10,17,17,20,24,30};
				int n=0;  //输入的n，实际为n-1 ;  因为java角标是从0开始的
				DynamicProgramming dp=new DynamicProgramming();
//				int maxProce=dp.memoizedCutRod(p, n+1);
				int maxPrice=dp.bottomUpCutRod(p, n+2);   //两个for循环嵌套
				System.out.println(maxPrice);
			}
}
