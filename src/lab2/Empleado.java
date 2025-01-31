package lab2;

import java.util.Calendar;

public class Empleado {
    protected int codigoUnico; 
    protected String nombre; 
    protected Calendar fecha; 
    protected double salarioBase; 
    protected int horasTrabajadas; 

    public Empleado(int codigoUnico, String nombre, double salarioBase) {
        this.codigoUnico = codigoUnico;
        this.nombre = nombre;
        this.fecha = Calendar.getInstance();
        this.salarioBase = salarioBase;
        this.horasTrabajadas = 0;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        if(horasTrabajadas>0){
        this.horasTrabajadas = horasTrabajadas;
        }
    }
    
    public double calcularPago(){
    
    double pagoProporcional = (salarioBase/160);
    double deduccion = (pagoProporcional*0.035);
    return pagoProporcional - deduccion; 
    }
    
    public void mostrarInformacion(){
    
        System.out.println("Codigo: "+codigoUnico);
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha de contratacion: "+ fecha);
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
