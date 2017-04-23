// Andrew Qu
// APCS2 pd5
// HW32 -- Getting Past the Velvet Rope
// 2017-04-20 hehe

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayPriorityQueue<Ticket> implements PriorityQueue<Ticket>{

    ArrayList<Ticket> _data;
    
    public ArrayPriorityQueue(){
	_data = new ArrayList<Ticket>();
    }

    public void add(Ticket x){
        int i = 0;
	while( i < _data.size() && ((Comparable) _data.get(i)).compareTo(x) > 0 )
	    i += 1;
	_data.add(i,x);
    }

    public boolean isEmpty(){
	return _data.size() == 0;
    }

    public Ticket peekMin(){
	if( isEmpty() )
	    throw new NoSuchElementException("Data structure is empty");
	return _data.get(_data.size() - 1);
    }

    public Ticket removeMin(){
	if( isEmpty() )
	    throw new NoSuchElementException("u doofus");
	return _data.remove(_data.size() - 1);
    }

    public static void main(String[] args){
	/* testing for ints
	ArrayPriorityQueue APQ = new ArrayPriorityQueue();
	System.out.print("Values added: ");
	for(int i = 0;i < 10;i ++){
	    int val = (int)( Math.random() * 10);
	    APQ.add(val);
	    System.out.print("  " + val);
	}
	System.out.println();
	System.out.print("Order of removal: ");
	while( !APQ.isEmpty() )
	    System.out.print("  " + APQ.removeMin());
	*/

	ArrayPriorityQueue APQ = new ArrayPriorityQueue();
	for(int i = 0;i < 10;i ++){
	    Ticket t = new Ticket(i);
	    APQ.add(t);
	}
	while( !APQ.isEmpty() )
	    System.out.println(APQ.removeMin());
    }
}
