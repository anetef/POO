/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Villalba
 */ 
public class Teste {
    public static void main(String[] args) {
        ProvaUCB provaUcb = new ProvaUCB(7.6, 9.0);
        ProvaFafifo provaFafifo = new ProvaFafifo(5.0, 6.9);

        System.out.println("Se Aluno UCB for APROVADO mostre (true) se for DESAPROVADO (false): " + provaUcb.aprovado());
        System.out.println("Se Aluno Fafifo for APROVADO mostre (true) se for DESAPROVADO (false): " + provaFafifo.aprovado());
        }
}

