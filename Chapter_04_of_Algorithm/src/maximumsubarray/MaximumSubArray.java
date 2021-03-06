package maximumsubarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mydatastructure.Pojo;

/**
 * 最大子数组
 * @author admin
 *
 */
public class MaximumSubArray {
	
	/**
	 * 最大子数组是跨越中点的数组时，求最大子数组的算法。
	 * @param arr 输入数组
	 * @param low 最低角标值
	 * @param mid 中间角标值
	 * @param high 最高角标值
	 * @return 返回一个自定义的数据结构pojo，封装返回的最大子数组左角标值，右角标值，最大值
	 */
	public Pojo findMaxCrossingSubArray(int[] arr,int low,int mid,int high){
		Pojo pojo=new Pojo();
		int leftSum=Integer.MIN_VALUE;
		int sum=0;
		int maxLeft=-1;
		for (int i = mid; i >= 0; i--) { //求左边一半的最大值和左角标值
			sum=sum+arr[i];
			if(sum>leftSum){
				leftSum=sum;
				maxLeft=i;
			}
		}
		int rightSum=Integer.MIN_VALUE;
		sum=0;
		int maxRight=-1;
		for (int j = mid+1; j < high; j++) {//求右边一半的最大值和右角标值
			sum=sum+arr[j];
			if(sum>rightSum){
				rightSum=sum;
				maxRight=j;
			}
		}
		pojo.setData1(maxLeft);
		pojo.setData2(maxRight);
		pojo.setData3(leftSum+rightSum);
		return pojo;	
	}
	
	/**
	 * 求最大子数组
	 * @param arr 输入数组
	 * @param low 输入数组的最低角标值
	 * @param high 输入数组的最高角标值
	 * @return 返回一个自定义的数据结构pojo，封装返回的最大子数组左角标值，右角标值，最大值
	 */
	public Pojo findMaximumSubArray(int[] arr,int low,int high){
		Pojo pojo=new Pojo();
		int mid=(low+high)/2;
		int leftLow,leftHigh,leftSum,rightLow,rightHigh,rightSum,crossLow,crossHigh,CrossSum;
		if(low==high){
			pojo.setData1(low);
			pojo.setData2(high);
			pojo.setData3(arr[low]);
			return pojo;
		}else{
			Pojo pojo1=findMaximumSubArray(arr, low, mid);
			leftLow=pojo1.getData1();
			leftHigh=pojo1.getData2();
			leftSum=pojo1.getData3();
			Pojo pojo2=findMaximumSubArray(arr, mid+1, high);
			rightLow=pojo2.getData1();
			rightHigh=pojo2.getData2();
			rightSum=pojo2.getData3();
			Pojo pojo3=findMaxCrossingSubArray(arr, low, mid, high);
			crossLow=pojo3.getData1();
			crossHigh=pojo3.getData2();
			CrossSum=pojo3.getData3();
			if(leftSum>=rightSum && leftSum>=CrossSum){ //最大子数组在左边一半
				pojo.setData1(leftLow);
				pojo.setData2(leftHigh);
				pojo.setData3(leftSum);
				return pojo;
			}else if(rightSum>=leftSum && rightSum>=CrossSum){ //最大子数组在右边一半
				pojo.setData1(rightLow);
				pojo.setData2(rightHigh);
				pojo.setData3(rightSum);
				return pojo;
			}else{     //最大子数组跨越中点
				pojo.setData1(crossLow);
				pojo.setData2(crossHigh);
				pojo.setData3(CrossSum);
				return pojo;
			}
		}
	}
}
