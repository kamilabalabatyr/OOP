package pr3;

public interface MyCollection<E> {
	boolean add (E element);
	boolean remove (E element);
	boolean contains (E element);
	boolean isEmpty();
	int size();
	
	void clear();
}
