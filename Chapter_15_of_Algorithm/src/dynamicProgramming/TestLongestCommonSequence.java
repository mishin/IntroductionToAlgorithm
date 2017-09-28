package dynamicProgramming;

import java.util.List;

public class TestLongestCommonSequence {
		public static void main(String[] args) {
			LongestCommonSequence lcs=new LongestCommonSequence();
			char[] c1={'A','B','C','A','C','D','B','F','G'};
			char[] c2={'A','B','C','A','B','D','B','E','G'};
			List list=lcs.LCSLength(c1, c2);
			String[][] b=(String[][]) list.get(0);
			lcs.printLCS(b, c1, c1.length-1, c2.length-1);
		}
}
