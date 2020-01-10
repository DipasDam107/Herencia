/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t2e9;

import java.time.LocalDate;

/**
 *
 * @author dam107
 */
final public class CuentaPlazo extends CuentaCorriente{
    private LocalDate fechaCreacion;
    private static float porcentajeComision;
    private static float minimoComision;
    
    CuentaPlazo(String i){
        super(i);
        this.fechaCreacion=LocalDate.now();
        setComision();
    }
    
    public static void setComision(){
        porcentajeComision = 0;
        minimoComision = 0;
    }
    
    @Override
    public boolean retirar (float importe) {
        if (importe <= this.getSaldo()) {
           this.setSaldo(this.getSaldo()- importe);  
           this.setContadorIngresos(0);
           return true;
        }
        else return false; 
    }
}
