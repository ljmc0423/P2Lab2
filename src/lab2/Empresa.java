package lab2;

import java.util.ArrayList;

public class Empresa {
    
    ArrayList <Empleado> empleados = new ArrayList<>(); 
    
    //buscar empleado
    public Empleado buscarEmpleadoPorCodigo(String codigo) {
        for (int i=0;i<empleados.size();i++) {
            if (empleados.get(i).codigoUnico == Integer.parseInt(codigo)) {
                return empleados.get(i);
            }
        }
        return null; 
    }
    
    
    //registrar empleados
    
    public void registrarEmpleados(Empleado empleado){
    
    if (buscarEmpleadoPorCodigo(String.valueOf(empleado.getCodigoUnico())) != null) {
        System.out.println("Error: El código único ya está registrado.");
        return;  
    }
    empleados.add(empleado);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
