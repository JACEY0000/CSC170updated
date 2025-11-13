import greenfoot.*;  

public class Player extends Actor
{
    private int score = 0;
    
    public void act()
    {
        checkKeys(); 
        checkCollision();
        showScore();
    }
    
    public void checkKeys() {
        if (Greenfoot.isKeyDown("left")) { move(-3); }
        if (Greenfoot.isKeyDown("right")) { move(3); }
        if (Greenfoot.isKeyDown("up")) { setLocation(getX(), getY() - 3); }
        if (Greenfoot.isKeyDown("down")) { setLocation(getX(), getY() + 3); }
    }
    
    /**
     * Checks if the player has collided with gold and plays a sound.
     */
    public void checkCollision()
    {
        Actor gold = getOneIntersectingObject(Gold.class);
        if (gold != null)
        {
            getWorld().removeObject(gold);
            Greenfoot.playSound("cha_ching-sound_effect_download.wav"); 
            score++;
        }
    }
    
    public void showScore() {
        getWorld().showText("P1 Score: " + score, 50, 25);
    }
}