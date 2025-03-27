package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall wall1=new Wall("Kuzey");
        Wall wall2=new Wall("Güney");
        Wall wall3=new Wall("Doğu");
        Wall wall4=new Wall("Batı");


        Wardrobe wardrobe=new Wardrobe(200,200,200);
        Bed bed =new Bed(2,1,3,5,"Modern");
        Lamp lamp =new Lamp(LampType.NEON,true,5);
        Carpet carpet=new Carpet(200,200, PaintColor.RED);
        Ceiling ceiling=new Ceiling(3,PaintColor.GREEN);

        Bedroom bedroom=new Bedroom("Yatak Odası",wall1,wall2,wall3,wall4,ceiling,bed,lamp,wardrobe,carpet);

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();

    }
}