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
    public String mostrarInformacion(){
        return ("Codigo: "+codigoUnico+"\nNoombre: "+nombre+"\nFecha de contratacion: "+fecha+"\nFecha fin de contrato: "+fechaVencimiento);
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
