package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing2 extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
	}
	
	public void draw()
	{	
		
		// background(255,0,0); //black bg - 0 // red - 255 , 0 , 0 //
		// stroke(255); //white color pen line 255 // 0, 255,0 - green outline
		// line(10,10,200,200); //x1,y1,x2,y2
		// noStroke();//some line will have a stroke and some line won't
		// ellipse(200,200,100,50); //cx ,cy , w ,h
		
		// fill(0,0,255); //fill in a colour
		// rect(20,100,70,90); //tlx ,tly, w, h
		// point(200,60);
		
		// fill(0,255,255); //fill in a colour
		// triangle(200,90,300,200,10,60);//x1, y1, x2, y2, x3, y3

		// //draw text to the screen
		// fill(0);
		// text("Hello World",300 , 300);

		/*class work - illuminati*/
		background(255,0,0);

		//for circle
		fill(255,204,0);
		noStroke();
		ellipse(250,300,400,400);

		//for triangle
		fill(0, 191, 255);
		triangle(250,100,70,450,430,450);

		//circle for eyelid
		fill(59, 52, 49); 
		ellipse(250,280,175,80);

		//circle for eyeball
		float x;
		x = 1;
		fill(0);
		//ellipse(250,280,50,50);
		ellipse(250,280,mouseX,mouseY);
	}
}
