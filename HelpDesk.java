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
    private ArrayPriorityQueue _queue; //to hold all these tickets
    private int counter; //to assign id numbers to each ticket
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~basic methods~~~~~~~~~~~~
    public HelpDesk(){
	_queue = new ArrayPriorityQueue();
	counter = 0;
    }

    public String toString(){
	return "This HelpDesk has fixed " + counter + " issues!";
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~help desk methods~~~~~~~~~~
    
    //latest ticket under perusal
    public Ticket currentTicket(){
	if( _queue.isEmpty() ){
	    System.out.println("No problems are currently enqueued");
	    return null;
	}
	return (Ticket)_queue.peekMin();
    }

    //solve latest problem, and remove ticket from queue
    public boolean solveTicket(){
	Ticket prob = (Ticket)_queue.removeMin();
	System.out.println("Now resolving " + prob);
	System.out.print("What is your solution, IT guy?");
	String sol = Keyboard.readString();
	prob.solve(sol);
	System.out.println("Thank you for your assistance!");
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
			   "\n\t4. Staff" +
			   "\n\t5. I don't work here (but thank you for being nice and printing out stuff for me anyway)");
	int priority = Keyboard.readInt();

	//getting the problem
	System.out.println("Please describe the problem you are experiencing.");
	String problem = Keyboard.readString();

	Ticket tic = new Ticket(counter,priority,name,problem);
	System.out.println("\n\tNew Ticket Created: \n" + tic);
	System.out.println("\nA professional will fix this problem shortly."
			   + "\nThank you");
	_queue.add(tic);
	counter ++;
	
    }

    //????????????
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //main method: user interface time
    public static void main(String[] args){
	HelpDesk HD = new HelpDesk();
	//user is given option: solve a problem or request help
	System.out.println("Welcome to the HelpDesk! Are you here to:");
	System.out.println("1: Submit an issue");
	System.out.println("2: Resolve these issues. I work here!");
	System.out.println("3: Exit");
	System.out.print("Please select choice 1,2, or 3: ");
	int choice = Keyboard.readInt();
	while(choice != 1 && choice != 2 && choice != 3){
	    System.out.print("Please make a valid selection: ");
	    choice = Keyboard.readInt();
	}
        while(choice != 3){
	    if(choice == 1)
		HD.addTicket();
	    else
		HD.solveTicket();
	    System.out.println("Would you like to: " +
			       "\n1: Submit another issue" +
			       "\n2: Fix some issues" +
			       "\n3: Exit");
	    System.out.print("Choice: ");
	    choice = Keyboard.readInt();
	}
		
	System.out.println("Thank you for using the HelpDesk!");
	//should go through necessary options to do either
	//and then maybe a do you still want to work at the help desk?
    }
}//end class HelpDesk
