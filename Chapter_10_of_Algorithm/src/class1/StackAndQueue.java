package class1;

import java.util.ArrayList;
import java.util.List;

public class StackAndQueue {
	     
	        static List<Integer> list=new ArrayList<Integer>();
	        
	        public static void main(String[] args) {
				List<Integer> list=Inital();
				boolean b=stackEmpty(list);
				System.out.println(b);
				list=Push(list,9);
				System.out.println(list);
				list=remove(list,9);
				System.out.println(list);
			}
			public StackAndQueue(List< Integer> list){
				this.list=list;

			}
			public static  List<Integer> Inital(){
			 	list.add(3);
				list.add(5);
	    		list.add(9);
				return  list;
			}
			public static List  Push(List list,int a){
				list.add(a);
				return list;
			}
			public static List  remove(List list,int a){
				list.remove(list.size()-1);
				return list;
			}
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
