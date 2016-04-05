public class Test{
    public static void main(String[] args)
    {
        Human aPerson = new Human();
        aPerson.breath();
        aPerson.height=3;
        System.out.println(aPerson.height);
        aPerson.repeat(5);
    }

}

class Human
{
    void breath()
    {
        System.out.println('h');
    }
    void repeat(int rep)
    {
        int i;
        for(i=0;i<rep;i++){
            this.breath();
        }
    }

    int height=1;
}
