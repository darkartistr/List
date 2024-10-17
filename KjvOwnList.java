

public class KjvOwnList implements Iterable<Integer>
{

	int count = 0 ;
	KjvNode first = null;
	KjvNode last = null;

	public KjvOwnList() {}



	public KjvOwnList( KjvOwnList src) 
	  { addLast(src);
	  }

	public void addLast(KjvOwnList src) 
	  {for (Integer x: src)
	     { addLast(x);}
	  } 

	public void addFirst(int item) 
	  {
		first = new KjvNode(item, first);
		if (first.next==null)
			last = first;
		++count;
	  }
	

	public void addLast(int item) 
	  {

	   KjvNode newltem = new KjvNode(item, null);
	   if (last == null)
	     { first = newltem; } 
	   else
	     { last.next = newltem; }
	   last = newltem;
	   count++;
	  } 


	public int remove() 
	  {
	   int res = first.item;
	   first = first.next;
	   count--;
	   return res;
	  }

	public int size() { return count; }
	
	@Override
	public KjvIterator iterator()
			{ return new KjvIterator(this);}
	
	public void print()
	  { for (Integer x: this)
	      { System.out.print(x+" ");}
	  }
}
