package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {

    int size = 100;
<<<<<<< HEAD
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
=======
    float cellSize;
    boolean[][] board = new boolean[size][size];
    boolean[][] next = new boolean[size][size];

    public int countNeighbours(int row, int col)
    {
        int count = 0;
        
        for(int r = row -1 ; r <= row + 1; r ++)
        {
            for(int c = col -1 ; c <= col + 1; c ++)
            {
                if (! (r == row && c == col))
                {
                    if (getCell(board, r, c))
                    {
                        count ++;
                    }
                }
            }
        }

        // OR Use 8 if statements
        /*
        if (getCell(board, row-1, col-1))
        {
            count ++;
        }
        if (getCell(board, row-1, col))
        {
            count ++;
        }
        if (getCell(board, row-1, col+1))
        {
            count ++;
        }
        if (getCell(board, row, col-1))
        {
            count ++;
        }
        if (getCell(board, row, col+1))
        {
            count ++;
        }
        if (getCell(board, row+1, col-1))
        {
            count ++;
        }
        if (getCell(board, row+1, col))
        {
            count ++;
        }
        if (getCell(board, row+1, col+1))
        {
            count ++;
        }
        */
        
        return count;
    }

    public void setCell(boolean[][] board, int row, int col, boolean b)
    {
        if (row >= 0 && row < size -1 && col >= 0 && col < size -1)
>>>>>>> b95b4a8f70bf2b2cc83c67adf3ebf793626c2f39
        {
            board[row][col] = b;
        }
    }

<<<<<<< HEAD
    public boolean getCell(boolean[][] board,int row, int col)
    {
        if ( row >= 0 && row < size - 1 && col >= 0 && col < size - 1)
=======
    public boolean getCell(boolean[][] board, int row, int col)
    {
        if (row >= 0 && row < size -1 && col >= 0 && col < size -1)
>>>>>>> b95b4a8f70bf2b2cc83c67adf3ebf793626c2f39
        {
            return board[row][col];
        }
        else
        {
            return false;
<<<<<<< HEAD
        }
=======
        }        
>>>>>>> b95b4a8f70bf2b2cc83c67adf3ebf793626c2f39
    }

    public void drawBoard(boolean[][] board)
    {
<<<<<<< HEAD
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

=======
        // Use a nested loop
        // Use map to calculate x and y
        // Rect draw the cell
        // Use the cell size variable
        // Use some colours!
        for(int row = 0 ; row < size ; row ++)
        {
            for (int col = 0 ; col < size ; col ++)
            {
                float x = map(col, 0, size, 0, width);
                float y = map(row, 0, size, 0, height);
>>>>>>> b95b4a8f70bf2b2cc83c67adf3ebf793626c2f39
                if (board[row][col])
                {
                    rect(x, y, cellSize, cellSize);
                }
            }
        }

    }

<<<<<<< HEAD
    private  void printBoard(boolean[][] board){
        for (int row = 0 ; row < size ; row++)
        {
            for (int col = 0 ; col < size ; col++)
            {
                print(board[row][col] ? 1 : 0); //print either one or zero whether its true or false
            }
            println(); //print a charcter return

        }
=======
    private void printBoard(boolean[][] board)
    {
        for(int row = 0 ; row < size ; row ++)
        {
            for (int col = 0 ; col < size ; col ++)
            {
                print(board[row][col] ? 1 : 0);
            }
            println();
        }        
>>>>>>> b95b4a8f70bf2b2cc83c67adf3ebf793626c2f39
    }

    public void randomize()
    {
<<<<<<< HEAD
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
=======
        for(int row = 0 ; row < size ; row ++)
        {
            for (int col = 0 ; col < size ; col ++)
            {
                float dice = random(0.0f, 1.0f);
                /*
                if (dice < 0.5)
                {
                    board[row][col] = true;
                }
                else
                {
                    board[row][col] = false;
                }
                */
>>>>>>> b95b4a8f70bf2b2cc83c67adf3ebf793626c2f39
                board[row][col] = (dice < 0.5f) ? true : false;
            }
        }
    }
<<<<<<< HEAD
    public void settings(){
=======

    public void settings()
    {
>>>>>>> b95b4a8f70bf2b2cc83c67adf3ebf793626c2f39
        size(500, 500);
    }
    
    int mode = 0;
    boolean paused = false;
    public void keyPressed() {
        if (keyCode == ' ')
        {
        }
        
        if (keyCode == '1')
        {
        }
        if (keyCode == '2')
        {
        }
        if (keyCode == '3')
        {
        }
            
    }

    public void setup() {
        colorMode(RGB);
<<<<<<< HEAD
        //randomize();
        board[0][1] = true;
        board[1][2] = true;
        board[3][2] = true;

        println(counterCellsAround(0, 2));
        cellSize = width / (size);
        //printBoard(board);
=======
        randomize();
        
        /*
        board[0][1] = true;
        board[1][2] = true;
        board[3][2] = true;
        */
        println(countNeighbours(0, 2));

        cellSize = width / (size);
        
        //printBoard(board);        
    }

    private void updateBoard()
    {
        // Put code here to apply the rules!!

        
        // Swap board and next
        boolean[][] temp = board;
        board = next;
        next = temp;
>>>>>>> b95b4a8f70bf2b2cc83c67adf3ebf793626c2f39
    }

    public void mouseDragged()
    {
        // This method gets called automatically when the mouse is dragged across the screen
    }

    public void draw() {
        background(0);
<<<<<<< HEAD
        drawBoard(board);
=======
        drawBoard(board);        
        updateBoard();
>>>>>>> b95b4a8f70bf2b2cc83c67adf3ebf793626c2f39
    }
}
