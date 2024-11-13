package dominio.logic;

import dominio.model.dto.Mesa;
import dominio.model.exceptions.MesaException;
import java.util.ArrayList;

import java.util.List;

public class SistemaPoker {
    private ArrayList<Mesa> ListaMesas= new ArrayList<>();
    
    public void CrearMesa(Mesa mesa) throws MesaException{
        ListaMesas.add(mesa);
    }
    
    public double obtenerMontoTotalRecaudado(){
        return 4.1;
    }
    
    public List<Mesa> obtenerMesas(){
        return ListaMesas;
    }
    
    public List<Mesa> obtenerMesasAbiertas(){
        return ListaMesas;
    }
}
