/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlingresos;

/**
 *
 * @author usuario
 */
public class Movimiento {
    public String id;
    public String tipoMovimiento;
    public String concepto;
    public String fecha;
    public float monto;
    public String descripcion;
    
    public Movimiento(String tipoMovimiento,String concepto,String fecha,float monto,String descripcion){
      this.tipoMovimiento = tipoMovimiento;
      this.concepto = concepto;
      this.fecha = fecha;
      this.monto = monto;
      this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
