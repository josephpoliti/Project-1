
/**
 * Write a description of class MazeWalker here.
 * 
 * @author Joseph Politi 
 * @version September 8, 2017
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MazeWalker
     */
    public MazeWalker()
    {
        // initialise instance variables
        x = 0;
    }

    public void walkMaze(MazeBot mazeBot){
        /*mazeBot.moveForward();
        mazeBot.moveForward();
        while(mazeBot. canMoveForward()){
        mazeBot.moveForward();
        }
        mazeBot.turnLeft();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        while(mazeBot. canMoveForward()){
        mazeBot.moveForward();
        }
        mazeBot.turnRight();
        mazeBot.moveForward();
        mazeBot.moveForward();
        while(mazeBot. canMoveForward()){
        mazeBot.moveForward();
        }
        mazeBot.turnRight();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward(); 
        while(mazeBot. canMoveForward()){
        mazeBot.moveForward();
        }
        mazeBot.turnLeft();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        while(mazeBot. canMoveForward()){
        mazeBot.moveForward();
        }
        mazeBot.turnLeft();
        mazeBot.moveForward();
        mazeBot.moveForward();
        while(mazeBot. canMoveForward()){
        mazeBot.moveForward();
        }
        mazeBot.turnRight();
        mazeBot.moveForward();
        mazeBot.moveForward();
        while(mazeBot. canMoveForward()){
        mazeBot.moveForward();
        }

        if(mazeBot. didReachGoal()){
        mazeBot.signalSuccess();
        }
        else{
        mazeBot.signalError();
        }*/

        while(mazeBot.didNotReachGoal()){
            //mazeBot.turnRight();
            if (mazeBot.canMoveForward()){
                mazeBot.moveForward();
            }
            else{
                mazeBot.turnLeft();
            }

        }
        
        
    }
}
