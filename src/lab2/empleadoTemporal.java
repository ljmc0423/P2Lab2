package lab2;

import java.util.Calendar;

public class empleadoTemporal extends Empleado {
    
    protected Calendar fechaVencimiento; 

    public empleadoTemporal(Calendar fechaVencimiento, int codigoUnico, String nombre, double salarioBase) {
        super(codigoUnico, nombre, salarioBase);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
   public double calcularPago() {
        Calendar fechaActual = Calendar.getInstance();
        
        if (fechaActual.after(fechaVencimiento)) {
            return 0; 
        } else {
            return super.calcularPago();
        }
    }

    public void ActualizarFinContrato(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    @Override
    public void mostrarInformacion(){
        
        System.out.println("Codigo: "+codigoUnico);
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha de contratacion: "+ fecha);
        System.out.println("Fecha fin de contrato: "+fechaVencimiento);
    
    
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
