
import Controllers.CarroController;
import Models.Carro;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class App {
        public static void main(String[] args) throws Exception {
                Carro[] carros = new Carro[] {
                                new Carro("Toyota", 2010),
                                new Carro("Honda", 2015),
                                new Carro("Ford", 2005),
                                new Carro("Chevrolet", 2018),
                                new Carro("BMW", 2010),
                                new Carro("Nissan", 2015),
                                new Carro("Volkswagen", 2020),
                                new Carro("Hyundai", 2010),
                                new Carro("Kia", 2005),
                                new Carro("Mazda", 2000),
                                new Carro("Subaru", 2012),
                                new Carro("Mercedes-Benz", 2016),
                                new Carro("Lexus", 2011),
                                new Carro("Audi", 2019),
                                new Carro("Tesla", 2020),
                                new Carro("Jaguar", 2014),
                                new Carro("Land Rover", 2018),
                                new Carro("Volvo", 2013),
                                new Carro("Infiniti", 2008),
                                new Carro("Acura", 2017)
                };

                // Implementar un método para ordenar los carros por año en orden ascendente
                // El metodo se le especificara en el enunciado del examen

                // Encontrar el carro usando búsqueda binaria basada en el año de fabricación y
                // imprimir su posició
                // en el arreglo de carros
                // Años a buscar en el arreglo de carros:
                // - 2012
                // - 2009

                // Imprimir:
                // Si encontro al carro en el arreglo de carros y su posisción
                // Si no encontro al carro en el arreglo de carros

                Arrays.sort(carros,Comparator.comparingInt(Carro::getAnio));

                for(Carro carro : carros){
                        System.out.println(carro.getMarca() +" - "+ carro.getAnio());

                }
                int anioBuscado = 2012;
                int anioBuscado2 = 2005;

                Carro carroEncontrado = buscarCarroPorAnio(carros, anioBuscado);
                if (carroEncontrado != null) {
                        System.out.println("");
                        
                }else{
                        System.out.println();

                }
                public static Carro buscarCarroPorAnio(Carro[]carros, int anioBuscado){
                        int inicio = 0;
                        int fin = carros.length;

                        while (inicio >= fin) {
                                int medio = inicio(inicio- fin)/2;

                        }if (carros[medio].getAnio = anioBuscado) {
                                return carros[medio];

                        }else if (inicio - fin) {
                                return -1;
                                
                        }
                        return null;


                }

        }
}