import greenfoot.*;  

public class Player2 extends Actor
{
    private int scoreP2 = 0;
    
    public void act()
    {
        checkKeysP2(); 
        checkCollisionP2();
        showScoreP2();
    }
    
    public void checkKeysP2() {
        if (Greenfoot.isKeyDown("a")) { move(-3); }
        if (Greenfoot.isKeyDown("d")) { move(3); }
        if (Greenfoot.isKeyDown("w")) { setLocation(getX(), getY() - 3); }
        if (Greenfoot.isKeyDown("s")) { setLocation(getX(), getY() + 3); }
    }

    /**
     * Checks if the second player has collided with gold and plays a sound.
     */
    public void checkCollisionP2()
    {
        Actor gold = getOneIntersectingObject(Gold.class);
        if (gold != null)
        {
            getWorld().removeObject(gold);
            Greenfoot.playSound("cha_ching-sound_effect_download.wav"); 
            scoreP2++;
        
        }
    }
    
    public void showScoreP2() {
        getWorld().showText("P2 Score: " + scoreP2, 550, 25);
    }
}