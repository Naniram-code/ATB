package thetestingacademy.designpattern.SingleTon;

public class RunnerSingleTon {

    public static void main(String[] args) {
        SingleTon singleTonRef = SingleTon.getInstance();
        singleTonRef.work();
    }
}
