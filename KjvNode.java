
public class KjvNode implements Cloneable 
  {

	 public KjvNode (int i, KjvNode n) 
	   {item = i;
	    next = n;	    
	   }
	 public KjvNode clone() throws CloneNotSupportedException {
		   return (KjvNode)super.clone();
	   }
	 
	 KjvNode Comp() {
		 try 
		   {
		    return this.clone();  
		   }
		 catch (CloneNotSupportedException e) 
		   { return null; }
	   }
	 
	     int item;
	 KjvNode next;
  }
