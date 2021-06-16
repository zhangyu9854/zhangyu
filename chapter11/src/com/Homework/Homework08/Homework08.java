package com.Homework.Homework08;

import com.Homework.Homework05.A;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.text.rtf.RTFEditorKit;

public class Homework08 {
    public static void main(String[] args) {
        Color.GREEN.show();

    }
}
enum Color implements AB {
    RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0),YELLOW(255,255,0),GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }
private String ID;

    Color(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}'; 
    }

    @Override
    public void show() {
        System.out.println(this);
    }
//        switch (ID){
//            case "RED":
//                System.out.println(RED);
//                break;
//            case "BLUE":
//                System.out.println(BLUE);
//                break;
//            case "YELLOW":
//                System.out.println(YELLOW);
//                break;
//            case "GREEN":
//                System.out.println(GREEN);
//                break;
//            default:
//                System.out.println("重输");
//                break;
//        }
    }

interface AB{
    void show();
}