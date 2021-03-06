package hashtable;

import java.util.ArrayList;

/**
 * 哈希表
 * @author liyafei
 *
 */
public class HashTable {
				/**
				 * 向哈希表中插入
				 * @param al			链表，相当于哈希表
				 * @param x			参数
				 */
				public void hashInsert(ArrayList<Integer> al,int x){
					al.add(hashFunction(x), x);
				}
				
				/**
				 * 哈希函数
				 * @param x	输入参数
				 * @return    哈希函数
				 */
				private int hashFunction(int x) {
					// TODO Auto-generated method stub
					return x*2;
				}
				
				/**
				 * 打印哈希表
				 * @param al  要打印的数组，相当于链表
				 */
				public <T> void print(ArrayList<T> al){
					for (int i = 0; i < al.size(); i++) {
						System.out.println(al.get(i));
					}
					
				}
}
