//Team JACofAllTrades
//Judy Liu, Carol Pan, Andrew Qu
//APCS2 pd5
//LAB03 -RUVIP
//2017-04-24

/***************************
 * class Ticket
 * models a help desk request
 **************************/

public class Ticket implements Comparable{

    //~~~~~~~~~~~instance vars~~~~~~~~~~~~
    private int id;
    private int VIP;
    private String problem;
    private boolean solved;
    private String name; 
    private String solution;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public Ticket(int Importance){
	VIP = Importance;
    }

    //~~~~~~~~~~~~~~~accessors~~~~~~~~~~~~
    public String getProblem(){
	return "";
    }

    public int getVIP() {
	return VIP;
    }
    
    public boolean isSolved(){
	return false;
    }

    public void solve(String s){
	return;
    }

    public int compareTo(Object t){
	Ticket tic = (Ticket) t;
	if(VIP < tic.VIP)
	    return 1;
	else if(VIP == tic.VIP)
	    return 0;
	return -1;
    }

    public int getID(){
	return 1;
    }

    public String toString(){
	return "Ticket of vip level: " + VIP;
    }
}
