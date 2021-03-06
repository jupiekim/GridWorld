import info.gridworld.actor.Bug;
public class DancingBug extends Bug
{
    private int[] turns;
    private int steps;

    /**
       Write a class DancingBug that dances by making different turns before
       each move. The DancingBug constructor has an integer array as parameter.
       The integer entries in the array represent how many times the bug turns before it moves. For example, an array entry of 5 represents a turn of 225 degrees (recall one turn is 45 degrees). When a dancing bug acts, it should turn the number of times given by the current array entry, then act like a Bug. In the next move, it should use the next entry in the array. After carrying out the last turn in the array, it should start again with the initial
    **/
    
    public DancingBug(int[] turnCounter)
    {
	steps = 0;
        turns = turnCounter;
    }
    
    /**
     * Moves to the next location of the square.
     */

    public void act()
    {
	for(int i = 0; i < turns.length; i ++) {
	    for(int j = 0; j < turns[i]; j ++) {
		turn();
	    }
	    if (canMove())
		{
		    move();
		}
	    else
		{
		    turn();
		}
	}
    }
}
