/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t2e10;

/**
 *
 * @author dam107
 */
public class movilPlus extends cMovilPrepago{
    private static final int DATOS_SEGUNDO_VIDEOLLAMADA=2;
    movilPlus(long nM, float cML, float cMB, float s){
        super(nM,0,cML, cMB,s);
    }
    
    public void videollamada(int segundos){
        this.navegar(segundos*DATOS_SEGUNDO_VIDEOLLAMADA);
    }
    
   
}
