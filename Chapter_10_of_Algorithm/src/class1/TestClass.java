package class1;

import java.io.FileNotFoundException;

import org.omg.PortableInterceptor.INACTIVE;

import class1.LinkedList.Node;

public class TestClass {

				public static void main(String[] args) throws FileNotFoundException {
                  LinkedList<Integer> ll=new LinkedList<Integer>();
                  ll.insert(6);
                  ll.insert(6);
                  Node first=ll.first;
                  ll.print(first);


}
}
