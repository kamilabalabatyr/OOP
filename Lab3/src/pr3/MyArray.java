package pr3;

public class MyArray<E> implements MyCollection<E> {
	
	private Object[] data;
	private int size;
	
	
	public MyArray(){
		data = new Object[10];
		size = 0;
	}

	@Override
	public boolean add(E element) {
		data[size] = element;
		size++;
		return true;
	}

	@Override
	public boolean remove(Object element) {
		for (int i = 0; i<size; i++) {
			if (data[i].equals(element)) {
				for (int j = i; j<size-1; j++) {
					data[j] = data[j+1];
				}
			size--;
			return true;
			}
		}
		return false;
	}

	@Override
	public boolean contains(Object element) {
		for (int i = 0; i<size; i++) {
			if(data[i].equals(element)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		data = new Object[10];
		size = 0;		
	}
	

}
