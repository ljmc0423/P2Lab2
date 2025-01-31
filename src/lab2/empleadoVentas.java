/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;
import java.util.Calendar;
/**
 *
 * @author ljmc2
 */
public class empleadoVentas extends Empleado{
    protected double tasaComision;
    int ventasMensuales[];
    public empleadoVentas(int codigoUnico, String nombre, double salarioBase, double tasaComision){
        super(codigoUnico,nombre,salarioBase);
        this.tasaComision=tasaComision;
        int ventasMensuales[]=new int[12];
    }
    
    public void registroVentas(double monto){
        int mesActual=Calendar.getInstance().get(Calendar.MONTH);
        ventasMensuales[mesActual-1] += monto;
    }
    
    public double calcularComision(){
        int ventasTotal=0;
        for(int i:ventasMensuales){
            ventasTotal+=ventasMensuales[i];
        }
        return ventasTotal*tasaComision;
    }
    
    
    @Override
    public double calcularPago(){
        
        int mesActual=Calendar.getInstance().get(Calendar.MONTH);
        double salarioProporcional=(salarioBase/160)*horasTrabajadas;
        double comision=ventasMensuales[mesActual]*tasaComision;
        return salarioProporcional+comision;
        
    }
    
    public int calculoVentasAnuales(){
        int ventasTotal=0;
        for(int i:ventasMensuales){
            ventasTotal+=ventasMensuales[i];
        }
        return ventasTotal;
    }
    
    @Override
    public String mostrarInformacion(){
        
        double ventasAnuales=calculoVentasAnuales();
        return super.mostrarInformacion() + ", Ventas Anuales: " + ventasAnuales;
        
    
    }
   
}
