package thetestingacademy.corejava.Wrapper.WrapperDemo;

public class WP01 {
    public static void main(String[] args) {
        char ch = 'a';
        // Autoboxing- primitive to Character object conversion
        Character a = ch;

        System.out.println(a);

        Character ch2 = 'a';
        // unboxing - Character object to primitive conversion
        char a2 = ch2;

        System.out.println(a2);
    }
}
