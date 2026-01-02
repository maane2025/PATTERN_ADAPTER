package aimane.maane.Computer;

public class Moniteur implements VGA {
    @Override
    public void print(String message) {
        System.out.println("*********** Moniteur **********");
        System.out.println(message);
        System.out.println("*********** Moniteur **********");
    }

}
