package class1;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆栈和队列
 * @author liyafei
 *
 */
public class StackAndQueue {
	     
			//列表，存放整形数据
	        static List<Integer> list=new ArrayList<Integer>();
	        
/*//	        public static void main(String[] args) {
//				List<Integer> list=Inital();
//				boolean b=stackEmpty(list);
//				System.out.println(b);
//				list=Push(list,9);
//				System.out.println(list);
//				list=remove(list,9);
//				System.out.println(list);
//			}
*/		
	        
	        /**
	         * 堆栈和队列
	         * @param list 列表，用来模拟堆栈和队列
	         */
	        public StackAndQueue(List< Integer> list){
				this.list=list;
				System.out.println("hello github");

			}
	        
	        /**
	         * 堆栈的初始化
	         * @return	创建的堆栈
	         */
			public static  List<Integer> Inital(){
			 	list.add(3);
				list.add(5);
	    		list.add(9);
				return  list;
			}
			
			/**
			 * 向堆栈中添加数据
			 * @param list 要被添加数据的堆栈
			 * @param a	添加的数据
			 * @return 被添加数据之后的堆栈
			 */
			public static List  Push(List list,int a){
				list.add(a);
				return list;
			}
			
			/**
			 * 从堆栈中删除数据
			 * @param list 要被删除数据的堆栈
			 * @param a 要被删除的数据
			 * @return 被删除数据之后的堆栈
			 */
			public static List  remove(List list,int a){
				list.remove(list.size()-1);
				return list;
			}
			
			/**
			 * 判断堆栈是否为空
			 * @param list 要被判断的堆栈
			 * @return 如果为空，返回true，否则，返回false。
			 */
			public static boolean stackEmpty(List< Integer> list){
				List list1=new ArrayList<>();
				System.out.println(list);
				System.out.println(list.hashCode());
				System.out.println(list1.hashCode());
				if (list==null)
					return true;
				else
					return false;
			}
}
