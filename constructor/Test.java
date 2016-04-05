public class Test
{
    public static void main(String[] args)
    {
        Human aPerson = new Human(160);
        Human aGirl = new Human(160, "girl");
        System.out.println(aPerson.getHeight());
    }
}

class Human
{
    /**
     * constructor
     */
    Human(int h)
    {
        this.height = h;
        System.out.println("I'm born");
    }
    
    Human(int h, String s)
    {
       this.height = h;
       System.out.println("I'm born "+s);
    }
 
    /**
     * accessor
     */
    int getHeight()
    {
        return this.height;
    }

    int height;
}
        
