import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        GreenfootImage bg = new GreenfootImage("background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        prepare();
    }

    private void prepare() {
        Player player1 = new Player();
        addObject(player1, 150, 200);
        Player2 player2 = new Player2();
        addObject(player2, 450, 200);
        for (int i = 0; i < 20; i++) {
            Gold gold = new Gold();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(gold, x, y);
        }
    }


    public void act() {
        
        if (getObjects(Gold.class).isEmpty()) {
            removeObjects(getObjects(null)); 
            GreenfootImage gameOverImage = new GreenfootImage("gameover.png");
            gameOverImage.scale(getWidth(), getHeight()); 
            setBackground(gameOverImage);
            Greenfoot.stop(); 
        }
    }
}