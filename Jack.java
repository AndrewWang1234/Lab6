import mayflower.*;


public class Jack extends AnimatedActor
{
    private Animation walk;
    private int currentFrame;
    public Jack() 
    {
        String[] jackFrames = new String[7];
        
        for(int i = 0; i < jackFrames.length; i++) {
            jackFrames[i] = new String("img/jack/Walk (" + (i+1) + ").png");
            
        }
        walk = new Animation(50, jackFrames);
        walk.scale(50,43);
        walk.setTransparency(90);
    }
    public void act()
    {
        super.act();
        setAnimation(walk);
    }
    }