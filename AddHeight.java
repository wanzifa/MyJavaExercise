public class AddHeight
{ 
    public static void main(String[] args)
    {
        Human aPerson = new Human();
        System.out.println(aPerson.getHeight());
        aPerson.grow(2);
        System.out.println(aPerson.getHeight());
    }
}

class Human
{/**
  *accesor
  */
    int getHeight()
    {
        return this.height;
    }

    /**
     *pass argument
     */
    void grow(int h)
    { 
        this.height = this.height +  h;
    }
    int height;
}
