package lab2;

import java.util.ArrayList;
import java.util.Calendar;

public class Empresa {
    
    ArrayList <Empleado> empleados = new ArrayList<>(); 
    
    //7. buscar empleado
    public Empleado buscarEmpleadoPorCodigo(String codigo) {
        for (int i=0;i<empleados.size();i++) {
            if (empleados.get(i).codigoUnico == Integer.parseInt(codigo)) {
                return empleados.get(i);
            }
        }
        return null; 
    }
    
    
    //1. registrar empleados
    public boolean registrarEmpleados(Empleado empleado){
    
    if (buscarEmpleadoPorCodigo(String.valueOf(empleado.getCodigoUnico())) != null) {
        //si lo encontro pone false
        return false;  
    }
    //si no lo agrega y manda true 
    empleados.add(empleado);
    return true; 
    }
    
    
    //2. se agregara luego 
    public boolean registrarHorasTrabajadas(Empleado empleado,int horas){
     if(buscarEmpleadoPorCodigo(String.valueOf(empleado.getCodigoUnico())) != null){
     empleado.setHorasTrabajadas(horas);
     return true;
     }
        return false; 
    }
    
     
    //4. Actualizar Fecha de Fin de Contrato 
    public boolean actualizarFechaFinContrato(int codigoUnico, Calendar nuevaFecha) {
    Empleado empleado = buscarEmpleadoPorCodigo(String.valueOf(codigoUnico));

    //verificar que existe y tipo empleado temporal
    if (empleado != null && empleado instanceof empleadoTemporal) {
        empleadoTemporal empleadoTemporal = (empleadoTemporal) empleado;
        empleadoTemporal.setFechaVencimiento(nuevaFecha);
        return true;
    }
    return false; 
}
    
    
    	public boolean registrarVentas(int codigo, int mes, double monto) {
        for (Empleado e:empleados) {
            if (e.getCodigoUnico()==(codigo) && e instanceof empleadoVentas) {
                ((empleadoVentas) e).registroVentas(monto);
                return true;
            }
        }
        return false;
        
    }
    //calcular pago mensual
    public double calcularPagoMensual(int codigo) {
        for (Empleado e : empleados) {
            if (e.getCodigoUnico()==(codigo)) {
                return e.calcularPago();
            }
        }
        return 0;
    }
    
    
    
    
    
}