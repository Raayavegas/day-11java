import java.util.*;
interface out
{
    void outm();
interface in {
    void innm();
}
}
class nes implements out.in
{
    public void innm()
    {
        System.out.println("hello im inner method");
    }
    public static void main(String args[])
    {
      nes h=new nes();
      h.innm();
    }
}