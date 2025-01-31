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
    
   /* public void registrarEmpleados(){
    
    if(buscarEmpleadoPorCodigo()){}
    
    
    
    
    
    }*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
