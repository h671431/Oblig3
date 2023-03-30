package oppgave5;

public interface Binary_tree_ADT <T> {
	/**
	 * 
	 * @param get Left element from current node
	 */
    void getLeft(T el);
    
    /**
	 * 
	 * @param set Left element from current node
	 */
    void setLeft(T el);
    
    /**
	 * 
	 * @param get Right element from current node
	 */
    void getRight(T el);
    
    /**
	 * 
	 * @param set Right element from current node
	 */
    void setRight(T el);
	
	/**
	 * 
	 * @param el that we check if exists in the tree
	 */
    boolean find(T el);
    
    /**
	 * find the smallest element in the pile
	 * @return The element with the smallest value or null if its empty
	 */
    T findSmallest();
	
	/**
	 * 
	 * @param el elements that should be added to the pile
	 */
    void addElement(T el);
    
    /** 
	 * removes el from tree if it exists
	 * 
	 */ 
	 void removeElement(T el);
    
	
	/** 
	 * removes the smallest value in the pile
	 * @return The element with the smallest value or null if its empty
	 */ 
	 T removeSmallest();
	 
	 /** 
	  * removes the largest value in the pile
	  * @return The element with the largest value or null if its empty
	  */ 
	 T removeLargest();
    
    
    /**
     * checks if the pile is empty
     * @return true if the pile is empty
     */
	 boolean isEmpty();
	 
	 /**
	  * returns the number of elements
	  * @return the  number of elements
	  */
	 int size();
	 
	 
}