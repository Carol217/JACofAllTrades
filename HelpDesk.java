//Team JACofAllTrades
//Judy Liu, Carol Pan, Andrew Qu
//APCS2 pd5
//LAB03 -RUVIP
//2017-04-24

/**************************
 * class HelpDesk
 * models a help desk
 * utilizes an ArrayPriorityQueue of Tickets
 *************************/
public class HelpDesk{
    
    //~~~~~~instance vars~~~~~~~~~~~  
    private ArrayPriorityQueue<Ticket> _queue;	
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~basic methods~~~~~~~~~~~~
    public HelpDesk(){
	_queue  new ArratPriorityQueue<Ticket>();
    }

    public String toString(){
	return "";
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~help desk methods~~~~~~~~~~
    //latest ticket under perusal
    public Ticket currentTicket(){
	
    }

    //solve latest problem, and remove ticket from queue
    public boolean solveTicket(){
	
	return true;
    }

    //more requests are coming in...
    public boolean addTicket(){

	return true;
    }

    //????????????
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //main method: user interface time
    public static void main(String[] args){

    }
}//end class HelpDesk
