package DefaultInterface;

interface Phone{
    void call();
    default void alert(){
        System.out.println("Default method");
    }
}

class Android implements Phone{
    public void call(){
        System.out.println("calling");
    }
}
public class DefaultInterface {
    public static void main(String[] args) {
        Phone asus = new Android();
        asus.call();
        asus.alert();
    }
}
