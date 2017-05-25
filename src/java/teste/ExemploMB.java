/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class ExemploMB {

    /**
     * Creates a new instance of ExemploMB
     */
    public ExemploMB() {
    }
    private double decimal;

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }
    
}
