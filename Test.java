public class Test{
    public static void main(String[] args)
    {
        Human aPerson = new Human();
        aPerson.breath();
        aPerson.height=3;
        System.out.println(aPerson.height);
    }

}

class Human
{
    void breath()
    {
        System.out.println('h');
    }

    int height=1;
}
