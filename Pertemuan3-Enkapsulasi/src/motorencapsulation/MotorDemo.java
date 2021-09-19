package motorencapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();
        System.out.println("================================================");
        motor.nyalakanMesin();
        motor.printStatus();
        System.out.println("================================================");
        motor.tambahKecepatan();
        motor.printStatus();
        System.out.println("================================================");
        motor.tambahKecepatan();
        motor.printStatus();
        System.out.println("================================================");
        motor.tambahKecepatan();
        motor.printStatus();
        System.out.println("================================================");
        motor.matikanMesin();
        motor.printStatus();

    }
}
