package aimane.maane.Computer;

public class Ecrant implements VGA {
    @Override
    public void print(String message) {
        System.out.println("*********** Ecrant **********");
        System.out.println(message);
        System.out.println("*********** Ecrant **********");
    }
    
}
