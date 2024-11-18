package Controllers;

import Models.Carro;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Carross.
 */
public class CarroController {
    private Carro[] carros;
    private int count; 
    /**
     * @param capacidad
     */
    public CarroController(int capacidad){
        if (capacidad <= 0) {
            throw new IllegalArgumentException();
            
        }
        carros = new Carro[capacidad];
        count =0;

    }
    /**
     * @param carro
     * @return
     */
    public boolean agregarCarro(Carro carro){
        if (carro == null) {
            return false;
        }
        if (count < carros.length) {
            carros[count] = carro;
            count++;
            return true; 
        }
        return false;

    }
    /**
     * @param index
     * @return
     */
    public boolean eliminarCarro(int index){
        if (index < 0 || index >= count) {
            return false;
            
        }
        for(int i = index; i < count -1;i++){
            carros[i] = carros[i+1];

        }
        carros[count-1] = null;
        count--;
        return true;
    }
    public Carro buscarPorMarca(String marca){
        if (marca == null || marca.isEmpty()) {
            return null;
            
        }
        for(int i =0; i < count; i++){
            if (carros[i].getMarca().equalsIgnoreCase(marca)) {
                return carros[i];
                
            }
            
        }
        return null;

    }
    public Carro[] listaCarro(){
        Carro[] carroListado = new Carro[count];
        return carroListado;
    }
    public int contarCarro(){
        return count;
    }
    public boolean actualizarCarro(int index, Carro carroNuevo){
        if (index < 0 || index >= count ) {
            return false;
            
            
        }if (carroNuevo == null) {
            return false;
        }
        carros[index] = carroNuevo;
        return true;
    }

   
}



