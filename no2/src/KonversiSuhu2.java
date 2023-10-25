/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adams
 */
public class KonversiSuhu2 {
    public void FahrenheitToReamur(double fahrenheit) {
        reamur = (fahrenheit - 32) * 4/9;
    }

    public double getReamur2() {
        return reamur;
    }

    public void disp2() {
        System.out.println("Konversi dari fahrenheit ke reamur adalah " + getReamur2());
    }
}
