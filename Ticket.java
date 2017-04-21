public class Ticket{
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
