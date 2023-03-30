package oppgave5;


public class BinaryPile<T extends Comparable<T>> implements Binary_tree_ADT<T> {
	//create a minimums pile

	private T[] data;
	private int intData;
	private int size;
	private int numbOfNodes;
	private BinaryPile<T> left;
	private BinaryPile<T> right;

	private static final int STDK = 100;

	public BinaryPile() {
		data = (T[]) new Comparable[STDK];
		size = 0;
	}
	public int getData() {
	    return intData;
	}
	public void setData(T[] data) {
	    this.data = data;
	}
	public int getNumbOfNodes() {
	    return numbOfNodes;
	}
	public BinaryPile<T> getElement() {
	    return this;
	}
	public BinaryPile<T> getLeft() {
	    return left;
	}
	public void setLeft(BinaryPile<T> left) {
	    this.left = left;
	}
	public BinaryPile<T> getRight() {
	    return right;
	}
	public void setRight(BinaryPile<T> right) {
	    this.right = right;
	}


	public void addElement(T el) {
		if (size == data.length)
			extendTable();
		data[size] = el; // place the new last
		size++;
		if (size > 1)
			repairUp(); // change upwards if necessary
	}
	/*public void addElement(int value) {
	    if (value < getData()) {
	        if (getLeft() == null) {
	            setLeft(new BinaryPile(value));
	        } else {
	            getLeft().addElement(value);
	        }
	    } else {
	        if (getRight() == null) {
	            setRight(new BinaryPile(value));
	        } else {
	            getLeft().addElement(value);
	        }
	    }
	}*/

	private void extendTable() {
		// extend table if needed
		int length = data.length;
		T[] ny = (T[]) new Comparable[2 * length];
		for (int i = 0; i < size; i++)
			ny[i] = data[i];
		data = ny;
	}

	private void repairUp() {
		T temp;
		int leftChild = -1;
		int rightChild = -1;
		
		//checks if we have a right child
		if(size % 2 == 0) {
			leftChild = size-1;
			numbOfNodes++;
		}
		else {
			rightChild = size-1;
			leftChild = rightChild-1;
		}
		
		int parent = (leftChild - 1)/2;
		while(rightChild > 0) {
			int minChild = rightChild;
			if(rightChild == -1) { // one child
				minChild = leftChild;
			} // else two children
			
			if(leftChild > 0 && data[rightChild].compareTo(data[leftChild]) > 0) {
				minChild = leftChild;
			}
			if(data[parent].compareTo(data[minChild]) <= 0) {
				break;
			}
			else {
				temp = data[minChild];
				data[minChild] = data[parent];
				data[parent] = temp;
				if(parent % 2 == 0) {
					leftChild = parent;
					rightChild = leftChild + 1;
				}
				else {
					rightChild = parent;
					leftChild = rightChild-1;
				}
				parent = (leftChild-1)/2;
			}
		}
	}

	public T removeSmallest() {
		T smallest = null;
		if (size > 0) {
			smallest = data[0];
			data[0] = data[size - 1];
			repairDown(); // change downward if necessary
			size--;
		}
		return smallest;
	}

	public T findSmallest() {
		T smallest = null;
		if (size > 0) {
			smallest = data[0];
		}
		return smallest;
	}

	private void repairDown() {
		T help;
		
		boolean done = false;
		int parent = 0; // Start in root and sml at the next level
		int minChild;
		int leftChild = parent * 2 + 1;
		int rightChild = leftChild + 1;
		while ((leftChild < size) && !done) { // Have more nodes further down
			minChild = leftChild;

			if ((rightChild < size) && ((data[rightChild]).compareTo(data[leftChild]) < 0)) {
				minChild = rightChild;
				// found the "smallest". sml with parent
			}

			
			if ((data[parent]).compareTo(data[minChild]) <= 0) {
				done = true;

			} else { // rebuild and continue down if parent is to large
				help = data[minChild];
				data[minChild] = data[parent];
				data[parent] = help;
				parent = minChild;
				leftChild = parent * 2 + 1;
				rightChild = leftChild + 1;
			}
		}
	}

	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	/*private T finnRek(T el, BinaryPile<T> p){
		T svar = null;
		// p == null -> base do nothing
		if (p != null){
			int sml = el.compareTo(p.getElement());
			if(sml == 0){ // I rot
				svar = p.getElement(); // basis
			} else if (sml < 0) {
				svar = finnRek(el, p.getLeft());
			} else {
				svar = finnRek(el, p.getRight());
			}
		}
		return svar;
	}*/
	
	public boolean find(T el) {
		boolean doesContain = false;
		for(int i = 0; i < data.length; i++) {
			if(data[i] == el) {
				return doesContain = true;
			}
		}		
		
		return doesContain = false;
		
	}

	public void writeTab() {
		// Hjelpemetode til test
		for (int i = 0; i < size; i++)
			System.out.print(data[i] + " ");
		System.out.println();
	}

	@Override
	public void removeElement(T el) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T removeLargest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getLeft(T el) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLeft(T el) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getRight(T el) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRight(T el) {
		// TODO Auto-generated method stub
		
	}
}
