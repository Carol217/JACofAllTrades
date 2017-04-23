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
    private int id;
    private int VIP;
    private String problem;
    private boolean solved;
    private String name; 
    private String solution;

    public Ticket(){

    }

    public String getProblem(){
	return "";
    }

    public boolean isSolved(){
	return false;
    }

    public void solve(String s){
	return;
    }

    public int compareTo(Ticket t){
	return 1;
    }

    public int getID(){
	return 1;
    }

    public String toString(){
	return "";
    }
}
