import mayflower.*;


public class Dog extends AnimatedActor
{
    private Animation walk;
    private int currentFrame;
    public Dog() 
    {
        String[] dogFrames = new String[10];
        
        for(int i = 0; i < dogFrames.length; i++) {
            dogFrames[i] = new String("img/dog/Walk (" + (i+1) + ").png");
            
        }
        walk = new Animation(50, dogFrames);
        walk.scale(200,174);
        walk.setTransparency(25);
    }
    public void act()
    {
        super.act();
        setAnimation(walk);
    }
    }