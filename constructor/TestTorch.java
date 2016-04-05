public class TestTorch
{
    public static void main(String[] args)
    {
        Torch t = new Torch();
        t.lighten();
        t.AddEn();
    }
}

class Torch
{
    void lighten()
    {
        System.out.println("正在充电哈哈哈");
    }
    void AddEn()
    {
        this.energe += 1;
        System.out.println("充电充到了"+this.energe+"度");
    }
    private int energe = 100;
}
