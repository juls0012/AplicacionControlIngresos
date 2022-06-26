/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlingresos;

/**
 *
 * @author usuario
 */
public class AbstactFactory {
    
    public static VistaIntroducirMovimiento getVistaIntroMov(){
        
        return new VistaIntroducirMovimiento();
    }
    
    public static VistaCancelarMovimiento getVistaCanMov(){
        return new VistaCancelarMovimiento();
    }
    
    public static VistaConsultaIntervalo getVistaConInt(){
        return new VistaConsultaIntervalo();
    }
    
    public static VistaSaludFinanciera getVistaSalud(){
        return new VistaSaludFinanciera();
    }
    
    public static Principal getPrincipal(){
        return new Principal();
        
    }
    
     public static Mensaje getMensaje(){
        return new Mensaje();
        
    }
    
}
