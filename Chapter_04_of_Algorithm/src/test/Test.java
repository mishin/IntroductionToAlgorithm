package test;

import maximumsubarray.MaximumSubArray;
import mydatastructure.Pojo;

public class Test {

	public static void main(String[] args) {
		MaximumSubArray maximumSubArray=new MaximumSubArray();
		int[] arr={3,4,2,-4,-5,5,3,2,6,-4,5,-8,7};
		Pojo pojo=maximumSubArray.findMaximumSubArray(arr, 0, arr.length-1);
		System.out.println(pojo.getData1());
		System.out.println(pojo.getData2());
		System.out.println(pojo.getData3());
	}
}
