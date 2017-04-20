public interface PriorityQueue<T>{

    /****************************
     * void add(i)
     * Adds an item to this priority queue.
     ****************************/
    public void add(T x);

    /****************************
     * boolean isEmpty()
     * Returns true if this stack is empty, otherwise returns false.
     ****************************/ 
    public boolean isEmpty();

    /****************************
     * Integer peekMin()
     * Returns the smallest item stored in this priority queue
     * without removing it.
     ****************************/
    public T peekMin();

    /****************************
     * Integer removeMin()
     * Removes and returns the smallest item stored in this priority queue
     ****************************/
    public T removeMin();

}
