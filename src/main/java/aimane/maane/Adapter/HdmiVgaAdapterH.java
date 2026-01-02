package aimane.maane.Adapter;

import aimane.maane.Computer.TV;
import aimane.maane.Computer.VGA;

public class HdmiVgaAdapterH extends TV implements VGA {
    @Override
    public void print(String message) {
        System.out.println("=========== Adapter   ===============");
        byte[] data= message.getBytes();
        super.view(data);
        System.out.println("=========== Adapter  ===============");
    }
}
