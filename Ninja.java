import mayflower.*;


public class Ninja extends AnimatedActor
{
    private Animation slide;
    private int currentFrame;
    public Ninja() 
    {
        String[] ninjaFrames = new String[9];
        
        for(int i = 0; i < ninjaFrames.length; i++) {
            ninjaFrames[i] = new String("img/ninjagirl/Slide__00" + (i) + ".png");
            
        }
        slide = new Animation(50, ninjaFrames);
        slide.scale(75,63);
        slide.setTransparency(0);
    }
    public void act()
    {
        super.act();
        setAnimation(slide);
    }
    }