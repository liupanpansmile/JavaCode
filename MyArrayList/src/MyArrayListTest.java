import java.util.Iterator;


public class MyArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyArrayList<Integer> intList = new MyArrayList<Integer>() ;
		
		for(int i = 1 ;i < 10 ;++i)
		{
			intList.add(i);
		}
		
		Iterator<Integer>  iterator = intList.iterator() ;
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
