package aimane.maane.Computer;

public class SuperVP implements VGA,HDMI{
    @Override
    public void view(byte[] Data) {
        String message = new String(Data);
        System.out.println(".................... Super VP HDMI ..................");
        System.out.println(message);
        System.out.println(".................... Super VP HDMI ..................");
    }

    @Override
    public void print(String message) {
        System.out.println(".................... Super VP VGA ..................");
        System.out.println(message);
        System.out.println(".................... Super VP VGA ..................");
    }
}
