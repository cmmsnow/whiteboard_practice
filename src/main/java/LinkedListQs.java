import javax.xml.soap.Node;
import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListQs {

    /**
     * count the nodes
     */
    public int countNodes(LinkedList linkedList){
        Iterator iterator = linkedList.iterator();
        int count = 0;
        while(iterator.hasNext()){
            iterator.next();
            count++;
        }
        return count;
    }

    /**
     * add an element
     */
    public void addElement(LinkedList linkedList, Object element){}

    /**
     * reverse the elements
     */
    public LinkedList reverseNodes(LinkedList linkedlist){ return linkedlist; }

    /**
     * get element at
     */
    public Object getElementAt(LinkedList linkedList, int location){
        Iterator iterator = linkedList.iterator();
        int size = countNodes(linkedList);
        if (location <= size){
            int count = 0;
            while(iterator.hasNext()){
                Object object = iterator.next();
                if (count == location) return object;
                count++;
            }
        } else return null;
        return null;
    }
}
