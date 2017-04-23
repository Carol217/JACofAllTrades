# JACofAllTrades
## Team Roster: Andrew Qu, Carol Pan, Judy Liu

## Design

The user of the help desk is first greeted by (the homescreen) the choices of submitting an issue, resolving an issue or exiting the help desk. When choosing to submit an issue the user has to enter his/her name and his/her job title and his/her issue. If they choose to resolve an issue he/she enters the solution. After submitting or resolving an issue, user returns to the home screen.

## Classes

### 1. Ticket
#### Instance variables: 
 1. (-) int id // Unique ticket number
 2. (-) int vip // Priority of the issue with 0 being most important
 3. (-) String problem // States the issue
 4. (-) boolean solved // True if the issue is solved
 5. (-) String name // Name of the user that introduced the problem
 6. (-) String solution // If the problem is not solved, this is an empty string
 
#### Accessors:
 1. (+) String getProblem() // Returns the problem
 2. (+) int getVIP() // Returns priority of the issue
 3. (+) int getID() // Returns ticket ID
 4. (+) boolean isSolved() // Returns solved
 5. (+) String getSolution() // Returns the solution
#### Methods:
 1. (+) void solve(String s) // Takes the input of a solution and solves the problem
 2. (+) int compareTo(Object t) // Compares tickets based on priority
 3. (+) String toString() // Returns a string with information about the ticket ID, the problem, the name of the user that introduced the problem and the solution
 
### 2. Help Desk
 #### Instance Variables
 1. (-) ArrayPriorityQueue queue // holds all tickets
 2. (-) int counter // used to assign id numbers for tickets
 #### Methods
 1. (+) Ticket currentTicket() // Returns the lastest ticket under perusual
 2. (+) boolean solveTicket() // Solves the latest problem and removes it from the queue
 3. (+) void addTicket() // Creates a ticket with priority based on status of the user and askes for the user's name and problem.
