import mayflower.*;
/**
 * Write a description of class MoveableAnimatedActor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MoveableAnimatedActor extends AnimatedActor
{
    private Animation walkRight;
    private Animation idle;
    private Animation walkLeft;
    private String currentAction;
    private String direction;
    private Animation idleLeft;
    private Animation falling;
    private Animation fallingLeft;

    /**
     * Constructor for objects of class MoveableAnimatedActor
     */
    public MoveableAnimatedActor()
    {
        walkRight = null;
        idle = null;
        currentAction = null;
        direction = "right";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void act() {
        super.act();
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        String newAction = null;
        
        if(currentAction == null) {
            newAction = "idle";
        }
        
        if(x < (800-w) && Mayflower.isKeyDown(Keyboard.KEY_RIGHT)) {
            setLocation(x+1,y);
            newAction = "walkRight";
            direction = "right";
            if(isBlocked() == true) {
                setLocation(x-1,y);
            }
        }
        else if(x > 0 && Mayflower.isKeyDown(Keyboard.KEY_LEFT)) {
            setLocation(x-1,y);
            newAction = "walkLeft";
            direction = "left";
            if(isBlocked() == true) {
                setLocation(x+1,y);
            }
            
        }
        else {
            newAction = "idle";
            if(direction != null && direction.equals("left")) {
                newAction = "idleLeft";
            }
        }
        if(isFalling()==true && direction.equals("left")) {
            newAction = "fallingLeft";
        }
        else if(isFalling()==true && direction.equals("right")) {
            newAction = "falling";
        }
        
            
        if(!(newAction == null) && !(newAction.equals(currentAction))) {
           if(newAction.equals("idle")) {
               setAnimation(idle);
            }
           if(newAction.equals("walkRight")) {
              setAnimation(walkRight);
           }
           if(newAction.equals("walkLeft")) {
               setAnimation(walkLeft);
            }
           if(newAction.equals("idleLeft")) {
               setAnimation(idleLeft);
            }
           if(newAction.equals("falling")) {
               setAnimation(falling);
            }
           if(newAction.equals("fallingLeft")) {
               setAnimation(fallingLeft);
            }
            currentAction = newAction;
        }
        

    }
    
    public void setAnimation(Animation a) {
        super.setAnimation(a);
    }
    
    public void setWalkRightAnimation(Animation a) {
        walkRight = a;
        //currentAction = "walkRight";
    }
    
    public void setIdleAnimation(Animation a) {
        idle = a;
        //currentAction = "idle";
    }
    
    public void setWalkLeftAnimation(Animation a) {
        walkLeft = a;
        //currentAction = "walkLeft";
    }
    
    public void setIdleLeftAnimation(Animation a) {
        idleLeft = a;
    }
    
    public void setFallingRightAnimation(Animation a) {
        falling = a;
    }
    
    public void setFallingLeftAnimation(Animation a) {
        fallingLeft = a;
    }
}
    
