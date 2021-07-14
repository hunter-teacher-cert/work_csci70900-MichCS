  public static void main(String[] args) {
	boolean solved;
	/*
	  Maze m = new Maze("maze.dat");

	Maze m = new Maze("maze.dat");
	System.out.println(m);
	solved = m.solve(1,1);
	*/

	/*object created
	  Knights k - new Knights(5);
	  solved = k.solve(1,1);
	*/ initializing knights
	Knights k = new Knights(5);
	k.solve(2,2,1); //referencing another class (anytime theres a dot)

    }
}
  32  code/maze/Maze.java 
@@ -63,7 +63,37 @@ public String toString(){
    }

    public boolean solve(int col,int row){
	return false; //initiaized to return false first run
	boolean solved; //boolean empty - just gave a name - no assignment

	System.out.println(clearScreen+this); //clearScreen= command
	delay(100); //command built
	// BASE CASE 1 - solved
	// if we found the exit we're done - return true
	if (board[col][row]=='$')
			       return true;

	// BASE CASE 2 - dead end
	// if we hit a wall or our path, we can't go further this
	// way - return false
	if (board[col][row]==' '
	    || board[col][row]=='z'
	    || board[col][row]=='.')
	    return false;
      
	// put ourselves in the maze
	board[col][row]='z';
	// RECURSIVE CALLS
	// try all the spaces we can go to 
	solved = solve(col+1,row);
	if (!solved)
	    solved = solve(col-1,row);
	if (!solved)
	    solved = solve(col,row+1);
	if (!solved)
	    solved = solve(col,row-1);
	// since we're not done yet remove ourselves
	board[col][row]='.';
	return solved;
    }

