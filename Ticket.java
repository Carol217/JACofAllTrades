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
    private int vip;
    private String problem;
    private boolean solved;
    private String name; 
    private String solution;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public Ticket(int ID, int Importance, String Name, String Oops){
	id = ID;
	vip = Importance;
	problem = Oops;
	name = Name;
	solved = false;
	solution = "?";
    }

    //~~~~~~~~~~~~~~~accessors~~~~~~~~~~~~
    public String getProblem(){
	return problem;
    }

    public int getVIP() {
	return vip;
    }

    public int getID(){
	return id;
    }
    
    public boolean isSolved(){
	return solved;
    }

    public String getSolution(){
	return solution;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public void solve(String s){
        solution = s;
	solved = true;
    }

    public int compareTo(Object t){
	Ticket tic = (Ticket) t;
        return vip - tic.getVIP();
    }

    public String toString(){
	String retStr = "";
	retStr += "Ticket " + id + ": submitted by " + name;
	retStr += "\nissue: " + problem;
	retStr += "\nsolution: " + solution;
	return retStr;
    }
}
