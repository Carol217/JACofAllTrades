public class Ticket implements Comparable{
    private int id;
    private int VIP;
    private String problem;
    private boolean solved;
    private String name; 
    private String solution;

    public Ticket(int Importance){
	VIP = Importance;
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
