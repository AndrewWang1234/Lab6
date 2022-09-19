import mayflower.*;
public class Cat extends MoveableAnimatedActor
{
    private Animation walkRight;
    private int currentFrame;
    private Animation idle;
    private Animation walkLeft;
    private Animation idleLeft;
    private Animation falling;
    private Animation fallingLeft;
    public Cat() 
    {
        String[] catFrames = new String[10];
        String[] idleFrames = new String[10];
        String[] fallingFrames = new String[8];
        
        for(int i = 0; i < catFrames.length; i++) {
            catFrames[i] = new String("img/cat/Walk (" + (i+1) + ").png");
            
        }
        walkRight = new Animation(50, catFrames);
        walkRight.scale(100,87);
        //walk.setTransparency(50);
        for(int i = 0; i < idleFrames.length; i++) {
            idleFrames[i] = new String("img/cat/Idle (" + (i+1) + ").png");
            
        }
        idle = new Animation(50, idleFrames);
        idle.scale(100,87);
        
        for(int i = 0; i < fallingFrames.length; i++) {
            fallingFrames[i] = new String("img/cat/Fall (" + (i+1) + ").png");
            
        }
        falling = new Animation(50, fallingFrames);
        falling.scale(100,87);
        
        fallingLeft = new Animation(50, fallingFrames);
        fallingLeft.scale(100,87);
        fallingLeft.mirrorHorizontally();
        
        idleLeft = new Animation(50, idleFrames);
        idleLeft.scale(100,87);
        idleLeft.mirrorHorizontally();
        
        walkLeft = new Animation(50, catFrames);
        walkLeft.scale(100,87);
        walkLeft.mirrorHorizontally();
        
        
        setWalkRightAnimation(walkRight);
        setWalkLeftAnimation(walkLeft);
        setIdleAnimation(idle);
        setIdleLeftAnimation(idleLeft);
        setFallingRightAnimation(falling);
        setFallingLeftAnimation(fallingLeft);
        
        walkRight.setBounds(18,5,54,80);
        walkLeft.setBounds(28,5,54,80);
        idle.setBounds(18,5,54,80);
        idleLeft.setBounds(28,5,54,80);
        falling.setBounds(18,5,54,80);
        fallingLeft.setBounds(28,5,54,80);
        
        
        
        
        
    }
    public void act()
    {
        super.act();
    }
    }

