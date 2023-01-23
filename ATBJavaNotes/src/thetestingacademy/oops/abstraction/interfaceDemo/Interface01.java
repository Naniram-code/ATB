package thetestingacademy.oops.abstraction.interfaceDemo;

public class Interface01 {

}

interface II{
    void say();
    default void hello(){
        System.out.println("Hello Default");
    }
}

class Hello implements II{

    @Override
    public void say() {

    }
}
