package activitySelector;

public class GreedyActivitySelector {
			public String greedyactiivitySeletor(String[] a,int[] s,int[] f){
				String A="";
				int n=s.length;
				A=A+a[0];
				int k=0;
				for (int m = 1; m < n; m++) {
					if(s[m]>=f[k]){
						A=A+a[m];
						k=m;
					}
				}
				return A;
			}
}
