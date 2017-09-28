package dynamicProgramming;

public class DynamicProgramming {
	
	
	      public int bottomUpCutRod(int[] p,int n){
				int[] r=new int[n];
				r[0]=0;
				for (int j = 0; j < r.length; j++) {
					int q=Integer.MIN_VALUE;
					for (int i = 0; i < j; i++) {
						if(q>p[i]+r[j-i]){
							q=q;
						}else{
							q=p[i]+r[j-i];
						}
					}
					r[j]=q;
				}
				return r[n-1];
	      }
	
			
			public int memoizedCutRod(int[] p,int n){
				int[] r=new int[n];
				for (int i = 0; i < r.length; i++) {
					r[i]=Integer.MIN_VALUE;
				}
				return memoizedCutRodAux(p,n,r);
			}
			private int memoizedCutRodAux(int[] p, int n, int[] r) {
				// TODO Auto-generated method stub
				int q;
				if(r[n-1]>=0){
					return r[n-1];
				}
				if(n-1==0){
					q=0;
				}else{
					q=Integer.MIN_VALUE;
					for (int i = 1; i <n; i++) {
						if(p[i]+memoizedCutRodAux(p, n-i, r)>q){
							q=p[i]+memoizedCutRodAux(p, n-i, r);
						}else{
							q=q;
						}
					}
				}
				r[n-1]=q;
				return q;
			}
}
