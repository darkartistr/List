
import java.util.*;

public class KjvIterator implements Iterator<Integer>
{
	private KjvOwnList list;
	private KjvNode current;
	private KjvNode prev;
	private KjvNode pprev;
	

	public KjvIterator(KjvOwnList lst) {
		list = lst;
		current = lst.first;
		prev = null;
		pprev = null;
	}
	
	public boolean hasNext() { return current != null; }

	public Integer next() 
	  {
	   if (!hasNext()) throw new NoSuchElementException("Нет следующего элемента");
	   Integer item = Integer.valueOf(current.item);
	   pprev = prev;
	   prev = current;
	   current = current.next;
	   return item;
	  }

	public void remove() 
	  { if (pprev==prev)
		  throw new IllegalStateException("Операция удаления недопустима");
		if (pprev == null)
		  list.first = list.first.next;
	    else
		  pprev.next = current;
	    prev = pprev;
	    if (current == null)
	    	list.last = prev;
	    --list.count;
	  }	

}
