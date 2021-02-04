package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
    public void settings(){
        size(500,500);
    }

    public void setup(){
        playerX = 235;
        playerY = height - 30;
    }

    float playerX;
    float playerY;
    float playerWidth = 30;
    
    float bugX = 235;
    float bugY = 20;
    float bugWidth = 25;

    public void draw(){
        background(0);
        drawPlayer(playerX,playerY,playerWidth);
        drawBug(bugX,bugY,bugWidth);

        if ((frameCount % 60) == 0){
            bugX += random(-100, 100);
        }
    }

    public void drawPlayer(float x, float y, float w){
        float h = w /2;
        stroke(255);
        line(x, y + h, x + w, y + h);
        line(x, y + h, x, y + h * 0.5f);
        line(x + w, y + h, x + w, y + h * 0.5f);

        line(x, y + h * 0.5f, x + w * 0.2f, y + h * 0.3f);
        line(x + w, y + h * 0.5f, x + w * 0.8f, y + h * 0.3f);
        line(x + w * 0.2f, y + h * 0.3f, x + w * 0.8f, y + h * 0.3f);
        line(x + w * 0.5f, y, x + w * 0.5f, y + h * 0.3f);
    }

    public void drawBug(float x , float y, float w){
        stroke(255);
        rect(x, y, 25, bugWidth);
    }


    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
            playerX -= 1;
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
            playerX += 1;
		}
		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
            line(playerX + 15,playerY - 15, playerX + 15, playerY - 500);
		}

	}
}