import mayflower.*;
/**
 * Write a description of class GravityActor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GravityActor extends Actor
{
    /**
     * Constructor for objects of class GravityActor
     */
    public GravityActor()
    {

    }
    public void act() {
       setLocation(getX(),getY()+1);
       isBlocked();
    }
    public boolean isBlocked() {
        if(isTouching(Block.class)) {
            setLocation(getX(),getY()-1);
            return true;
        }
        else 
            return false;
    }
    public boolean isFalling() {
        boolean ret;
        setLocation(getX(),getY() + 1);
        ret = isTouching(Block.class);
        setLocation(getX(), getY() -1);
        return !ret;
    }
}
