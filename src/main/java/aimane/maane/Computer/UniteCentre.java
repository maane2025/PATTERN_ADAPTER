package aimane.maane.Computer;

public class UniteCentre {
    //pattern strategy
    private VGA vga;

    public void print(String message){
        System.out.println("*********************");
        vga.print(message);
        System.out.println("*********************");
    }

    public void setVGA(VGA vga) {
        this.vga = vga;
    }
}
