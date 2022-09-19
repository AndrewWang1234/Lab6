import mayflower.*;
/**
 * Write a description of class AnimatedActor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnimatedActor extends GravityActor
{
    private Animation animation;
    private Timer animationTimer;
    private MayflowerImage[] frames;
    /**
     * Constructor for objects of class AnimatedActor
     */
    public AnimatedActor()
    {
        animationTimer = new Timer(1000);
    }

    public void act()
    {
        if(animation != null) {
            if(animationTimer.isDone()) {
            animationTimer.reset();
            MayflowerImage nextFrame = animation.getNextFrame();
            setImage(nextFrame);
            }
        }
        super.act();
    }
    
    public void setAnimation(Animation a) {
        animation = a; 
    }
}
