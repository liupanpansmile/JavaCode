import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class MyArrayList<E> {

	
	private List<E> list = new ArrayList<E> () ;
	private int size ;
	
	public MyArrayList(){}
	
	public MyArrayList(Collection<E> collection)
	{
		list.addAll(collection) ;
		size = list.size() ;
	}
	
	public void add(E obj)
	{
		list.add(obj) ;
		++size ;
	}
	
	public void remove(int index)
	{
		if(index < 0 || index >= list.size())
			throw new IndexOutOfBoundsException() ;
		list.remove(index) ;
		--size ;
	}
	
	public E get(int index)
	{
		if(index < 0 || index >= list.size())
			throw new IndexOutOfBoundsException() ;
		return list.get(index) ;
	}
	
	public Iterator<E> iterator()
	{
		return  new Ite() ;
	}
	
	private class Ite implements Iterator<E>
	{

		private int cursor = 0;
		private int lastRet = -1 ;
		
		@Override
		public boolean hasNext() {
			return cursor < size;
		}

		@Override
		public E next() {
			int index = cursor ;
			E element = MyArrayList.this.get(index) ;
			cursor = index +1 ;
			lastRet = index ;
			return element;
		}
		
	}
}
