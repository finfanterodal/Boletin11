/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Fran
 */
public class Intervalo {

    private long diferencia;
    private Date intervaloInicio;
    private Date intervaloFin;

    public void intervalo() {
        intervaloInicio = new Date();
        JOptionPane.showInputDialog("Escribe a siguiente frase" + "\n A documentaciÃ³n Ã© todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicaciÃ³n informÃ¡tica.");
        intervaloFin = new Date();
        diferencia = intervaloFin.getTime() - intervaloInicio.getTime();
        diferencia = (diferencia / 1000);
        JOptionPane.showMessageDialog(null, "Tardaches " + diferencia + " segundos en escribir a frase");
    }

}
