interface A{
    public void X();
    public void Y();
    
}
interface B{
    public void Z();
}
class C implements A,B{
    public void X(){
        System.out.println("message from aiman sir");
    }
    public void Y(){
        System.out.println("message from basit");
    }
    public void Z(){
        System.out.println("message from charan");
    }

}
public class testc{
    public static void main(String[] args) {
        C obj = new C();
        obj.X();
        obj.Y();
        obj.Z();
    }

}
