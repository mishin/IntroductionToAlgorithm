package class1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 链表
 * @author liyafei
 *
 * @param <T>  参数T是红黑树能够操作存储的泛型，红黑树是一种数据结构，因此树中节点需要存储数据，而T作为参数类型
 *                              保证了红黑树能够存储任意类型的数据，当然一个节点中也可以存储多个数据。
 *                              具有属性：头结点，新节点，尾节点
 */
public class LinkedList<T> {
					
	            public Node<T> first,newNode,last=null;  //创建三个节点，头节点，新节点，尾节点
	            public int count;
	            
	            /**
	             * 节点
	             * @author liyafei
	             *
	             * @param <T>  同链表T说明相同
	             */
				class Node<T>{
					Node<T> link;
					int info;
					T key;
//					public Node(T key){
//						this.key=key;
//					}
				}
//				public void insertNode(Node<T> node){
//					
//				}
				/**
				 * 创建链表
				 * @return 被创建的链表
				 * @throws FileNotFoundException 	抛出文件找不到异常
				 */
				public Node<T> createLinked() throws FileNotFoundException{
					int num=0;
					String inputline;
					Class clazz=this.getClass();
					InputStream ins=clazz.getResourceAsStream("data.txt");   //通过外部数据创建链表
					Scanner scanner=new Scanner(ins);  //流输入。
 //   				Scanner scanner=new Scanner(System.in);   //Scanner录入从控制台数据，也可以从各种其它地方录入。比如InputStream in等。
 				while(scanner.hasNextLine()){
//						inputline=scanner.toString();
//						num=Integer.parseInt(inputline);
 					
						String s=scanner.nextLine();
						Scanner oneLine=new Scanner(s);
//						if (oneLine==null)
//							break;
						while(oneLine.hasNext()){
							String s1=oneLine.next();
							num=Integer.parseInt(s1);
							if(num==999)
								break;
							newNode=new Node<T>();
							newNode.info=num;
							newNode.link=null;
							if(first ==null){
								first=newNode;
								last=newNode;
							}else{
								last.link=newNode;
								last=newNode;
							}
						}
						
			        }
 				return first;
 				
				}
				
				/**
				 * 插入节点
				 * @param key 根据泛型值决定插入节点的位置
				 */
				public  void insert(T key){                  //利用泛型，可以用这个链表数据结构保存任意数据类型。插入链表数据，可以用这个方法来创建链表，也可以读入数据来创建。
    				Node<T> newNode=new Node<T>();
    				newNode.key=key;
					newNode.link=null;
					if(first==null){
						first=newNode;
						last=newNode;
					}else{
						last.link=newNode;
						last=newNode;
					}
                     count++;
				}
				
				/**
				 * 打印节点
				 * @param node	要被打印的节点
				 */
				public  void  print(Node<T> node){  //给一个头节点,打印链表
					while(node!=null){
						System.out.println(node.key);
						node=node.link;
					}
				}
				
				/**
				 * 获取链表的长度
				 * @param node  要被获取长度的链表
				 * @return	链表的长度
				 */
				public  int getLength(Node<T> node){  //获取链表长度
					int length=0;
					while(node!=null){
						node=node.link;
						length++;
					}
					return length;
				}
}
