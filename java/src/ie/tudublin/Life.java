package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {

    int size = 100;
    float cellSize; //width and height of every cells getting drawn to the screen

    //delcare 2-D Boolean Array, rows go down , col go across
    boolean[][] board = new boolean[size][size];

    public int counterCellsAround(int row, int col)
    {
        //if true increase by one
        int count = 0; 
        //Use getCell here!
        //nested for loops
        for ( int r = row -1 ; r <= row + 1; r++)
        {
            for( int c = col - 1 ; c <= col + 1 ;c++)
            {
                if ( r!= row && c != col)
                {
                    if( getCell(board, r, c))
                    {
                        count++;
                    }
                }
            }
        } 
        return count;
    }
    public void setCell(boolean[][] board,int row , int col, boolean b)
    {
        if ( row >= 0 && row < size - 1 && col >= 0 && col < size - 1)
        {
            board[row][col] = b;
        }
    }

    public boolean getCell(boolean[][] board,int row, int col)
    {
        if ( row >= 0 && row < size - 1 && col >= 0 && col < size - 1)
        {
            return board[row][col];
        }
        else
        {
            return false;
        }
    }

    public void drawBoard(boolean[][] board)
    {
        //Use a nested Loop - if they are turnt on or off
        //use map to calculate x and y
        //rect to draw the cell
        //Use the cell size variable
        //Use some colours
    
        for (int row = 0 ; row < size ; row++)
        {
            for (int col = 0 ; col < size ; col++)
            {
                //width - 0 , size  - 0 , if col is 1 it will be 50 etc.
                // float x = map (col , 0, size, 0, width);
                // float y = map (row, 0 , size , 0 , height);
                float x = col * cellSize;
                float y = row * cellSize;

                if (board[row][col])
                {
                    rect(x, y, cellSize, cellSize);
                }
            }
        }

    }

    private  void printBoard(boolean[][] board){
        for (int row = 0 ; row < size ; row++)
        {
            for (int col = 0 ; col < size ; col++)
            {
                print(board[row][col] ? 1 : 0); //print either one or zero whether its true or false
            }
            println(); //print a charcter return

        }
    }

    public void randomize()
    {
        for (int row = 0 ; row < size ; row++)
        {
            for (int col = 0 ; col < size ; col++)
            {
                float dice = random(0.0f,1.0f);
                // if (dice < 0.f)
                // {
                //     board[row][col] = true;
                // }
                // else
                // {
                // //make sure that it is false after it is called true
                //   board[row][col] = false;  
                // }

                //inline if statement
                board[row][col] = (dice < 0.5f) ? true : false;
            }
        }
    }
    public void settings(){
        size(500, 500);
    }
    
    int mode = 0;
    public void keyPressed() {
        // the value of mode will be the number of the
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(RGB);
        //randomize();
        board[0][1] = true;
        board[1][2] = true;
        board[3][2] = true;

        println(counterCellsAround(0, 2));
        cellSize = width / (size);
        //printBoard(board);
    }


    public void draw() {
        background(0);
        drawBoard(board);
    }
}
