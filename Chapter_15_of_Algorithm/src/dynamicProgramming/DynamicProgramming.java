package dynamicProgramming;

public class DynamicProgramming {
			
			public int memoizedCutRod(int[] p,int n){
				int[] r=new int[n];
				for (int i = 0; i < r.length; i++) {
					r[i]=-100;
				}
				return memoizedCutRodAux(p,n,r);
			}
			private int memoizedCutRodAux(int[] p, int n, int[] r) {
				// TODO Auto-generated method stub
				int q;
				if(r[n-1]>=0){
					return r[n-1];
				}
				if(n==0){
					q=0;
				}else{
					q=-100;
					for (int i = 1; i <n; i++) {
						if(p[i]+memoizedCutRodAux(p, n-i, r)>q){
							q=p[i]+memoizedCutRodAux(p, n-i, r);
						}else{
							q=q;
						}
					}
				}
				return q;
			}
}
