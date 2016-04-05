public class Taller
{
    public static void main(String[] args)
    {
        Human aPerson = new Human();
        System.out.println(aPerson.getHeight());
    }
}

class Human
{/**
   *accessor
   */
    int getHeight()
    {
        return this.height;
    }
    int height = 1;
}
