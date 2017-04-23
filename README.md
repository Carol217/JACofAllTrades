# JACofAllTrades
## Team Roster: Andrew Qu, Carol Pan, Judy Liu

## Classes

###1. Ticket
* Instance variables: 
 - (-) int id
  - Unique ticket number
 - (-) int vip
  - Priority of the issue with 0 being most important
 - (-) String problem
  - States the issue
 - (-) boolean solved
  - True if the issue is solved
 - (-) String name
  - Name of the user that introduced the problem
 - (-) String solution
  - If the problem is not solved, this is an empty string
 
* Accessors:
 - (+) String getProblem()
  - Returns the problem
 - (+) int getVIP()
  - Returns priority of the issue
 - (+) int getID()
  - Returns ticket ID
 - (+) boolean isSolved()
  - Returns solved
 - (+) String getSolution()
  - Returns the solution
* Methods:
 - (+) void solve(String s)
  - Takes the input of a solution and solves the problem
 - (+) int compareTo(Object t)
  - Compares tickets based on priority
 - (+) String toString()
  - Returns a string with information about the ticket ID, the problem, the name of the user that introduced the problem and the solution
 
###2. Help Desk
 * Methods
 - (+) Ticket currentTicket()
  - Returns the lastest ticket under perusual
 - (+) boolean solveTicket()
  - Solves the latest problem and removes it from the queue
 - (+) void addTicket()
  - Creates a ticket with priority based on status of the user and askes for the user's name and problem.
