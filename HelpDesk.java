//Team JACofAllTrades
//Judy Liu, Carol Pan, Andrew Qu
//APCS2 pd5
//LAB03 -RUVIP
//2017-04-24

import cs1.Keyboard;

/**************************
 * class HelpDesk
 * models a help desk
 * utilizes an ArrayPriorityQueue of Tickets
 *************************/

public class HelpDesk{
    
    //~~~~~~instance vars~~~~~~~~~~~  
    private ArrayPriorityQueue _queue;
    private int counter;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~basic methods~~~~~~~~~~~~
    public HelpDesk(){
	_queue = new ArrayPriorityQueue();
	counter = 0;
    }

    public String toString(){
	return "";
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~help desk methods~~~~~~~~~~
    //latest ticket under perusal
    public Ticket currentTicket(){
	return null;
    }

    //solve latest problem, and remove ticket from queue
    public boolean solveTicket(){
	
	return true;
    }

    //more requests are coming in...
    public void addTicket(){
	
	//getting the name
	System.out.println("Hello. What is your name?");
	String name = Keyboard.readString();
	
	//getting the clearance
	System.out.println("\nWhat is your job title?" +
			   "\n\t0. Chairman" +
			   "\n\t1. President" +
			   "\n\t2. Vice President or Senior Executive" +
			   "\n\t3. Manager" +
			   "\n\t4. Staff");
	int priority = Keyboard.readInt();

	//getting the problem
	System.out.println("Please describe the problem you are experiencing.");
	String problem = Keyboard.readString();

	Ticket tic = new Ticket(counter,priority,name,problem);
	System.out.println("\n\tNew Ticket Created: \n" + tic);
	System.out.println("\nA professional will fix this problem shortly."
			   + "\nThank you");
	counter ++;
	
    }

    //????????????
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //main method: user interface time
    public static void main(String[] args){
	//user is given option: solve a problem or request help
	//should go through necessary options to do either
	//and then maybe a do you still want to work at the help desk?
    }
}//end class HelpDesk
