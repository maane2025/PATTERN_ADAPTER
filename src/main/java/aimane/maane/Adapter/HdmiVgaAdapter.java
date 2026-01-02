package aimane.maane.Adapter;

import aimane.maane.Computer.HDMI;
import aimane.maane.Computer.VGA;

public class HdmiVgaAdapter implements VGA {
    //pattern adapter
    private HDMI hdmiDevice;
    @Override
    public void print(String message) {
        System.out.println("=========== Adapter converts VGA to HDMI ===============");
        byte[] data= message.getBytes();
        hdmiDevice.view(data);
        System.out.println("=========== Adapter converts VGA to HDMI ===============");
    }

    public void setHdmiDevice(HDMI hdmiDevice) {
        this.hdmiDevice = hdmiDevice;
    }
}
