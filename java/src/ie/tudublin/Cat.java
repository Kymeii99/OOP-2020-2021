package ie.tudublin;

public class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }

    public int toInt()
    {
        return numLives;
    }

    private int numLives = 9;

    public int getLives()
    {
        return this.numLives;
    }

    public void setLives(int numbLives)
    {
        this.numLives = numbLives; 
    }

    public void Kill(String name)
    {
        numLives = numLives - 1;
        if (numLives > 0)
        {
            System.out.println("Ouch!");
        }
       
        if (numLives == 0)
        {
            System.out.println("Dead x_x");
        }
    }
}