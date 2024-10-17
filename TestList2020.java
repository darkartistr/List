
import static java.lang.System.*;

public class TestList2020 {

	public static void main(String[] args) 
	{

		System.out.println("*****");
		
		KjvOwnList L = new KjvOwnList(); 
		L.addLast(5);
        L.addLast(8);
        out.println("L.size()=" + L.size()+" ");

        KjvOwnList L1 = new KjvOwnList(L);
        L1.addLast(34);
        System.out.println("L1.size()=" + L1.size());
        
        System.out.print("L=");
        L.print();
        System.out.println();

        System.out.print("L1=");
        L1.print();
        System.out.println();
        int i = 0;
        System.out.println("Диапазонный итератор:");
        for (Integer x: L)
          { System.out.print(x+" "); }
        System.out.println();

        System.out.println("Метод:");
        L.print();
        System.out.println();               
        KjvIterator it1 = L.iterator();
        it1.next();
        it1.remove();
        System.out.println("Метод после удаления:");
        L.print();
        System.out.println();               

	}   

}
