/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Villalba
 */
public class ProvaUniversidade {
   
    public double getNotaAV1() {
        return notaAV1;
    }
    public void setNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }
    public double getNotaAV2() {
        return notaAV2;
    }
    public void setNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }

    private double notaAV1;
    private double notaAV2;
    
    public ProvaUniversidade(double notaAV1, double notaAV2){
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
    }
    
    public double calcularMedia() {
        return (notaAV1 + notaAV2) / 2;
    }
}