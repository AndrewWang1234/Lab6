import mayflower.*;

public class Animation
{
    // instance variables - replace the example below with your own
    private MayflowerImage[] frames; 
    private int currentFrame;
    private int frameRate;

    /**
     * Constructor for objects of class Animation
     */
    public Animation(int fR, String[] fileNames)
    {
        currentFrame = 0; 
        frameRate = fR;
        frames = new MayflowerImage[fileNames.length];
        
        for(int i = 0; i < fileNames.length; i++) {
            frames[i] = new MayflowerImage(fileNames[i]);
        }
    }
    public int getFrameRate() {
        return frameRate;
    }
    public MayflowerImage getNextFrame() {
        MayflowerImage currentImage = frames[currentFrame];
        currentFrame++;
        currentFrame = currentFrame % frames.length;
        return currentImage;
    }
    public void scale(int w, int h) {
        for(int i = 0; i <frames.length; i++) {
            frames[i].scale(w,h);
        }
    }
    public void setTransparency(int percent) {
        for(int i = 0; i < frames.length; i++) {
            frames[i].setTransparency(percent);
        }
    }
    
    public void mirrorHorizontally() {
        for(int i = 0; i < frames.length; i++) {
            frames[i].mirrorHorizontally();
        }
    }
    
    public void setBounds(int x , int y, int w, int h) {
        for(int i = 0; i < frames.length; i++) {
            frames[i].crop(x,y,w,h);
        }
    }
}
