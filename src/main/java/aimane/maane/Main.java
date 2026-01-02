package aimane.maane;

import aimane.maane.Adapter.HdmiVgaAdapter;
import aimane.maane.Adapter.HdmiVgaAdapterH;
import aimane.maane.Computer.*;

public class Main {
    public static void main(String[] args) {
        UniteCentre uc= new UniteCentre();
        uc.setVGA(new Ecrant());
        uc.print("Hello");
        uc.setVGA(new Moniteur());
        uc.print("Hello");

        HdmiVgaAdapter adapter= new HdmiVgaAdapter();
        adapter.setHdmiDevice(new TV());
        uc.setVGA(adapter);
        uc.print("Hello TV");

        uc.setVGA(new SuperVP());
        uc.print("Hello Super VP");

        //adapter with compositation
        HdmiVgaAdapter adapter2= new HdmiVgaAdapter();
        adapter2.setHdmiDevice(new SuperVP());
        uc.setVGA(adapter2);
        uc.print("Hello Super VP via adapter");

        //adapter with heritage
        HdmiVgaAdapterH adapter3= new HdmiVgaAdapterH();
        uc.setVGA(adapter3);
        uc.print("Hello Super VP via adapter with heritage");

    }
}