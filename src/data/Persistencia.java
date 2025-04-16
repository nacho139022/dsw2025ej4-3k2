package data;

import domain.*;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;

public class Persistencia {
    
    private static ArrayList<Mamifero> animales = new ArrayList<>();
    private static ArrayList<Sector> sectores = new ArrayList<>();
    private static ArrayList<Especie> especies = new ArrayList<>();
    private static ArrayList<Pais> paises = new ArrayList<>();

    private static void inicializarEspecies() {
        especies.add(new Especie("León", TipoAlimentacion.CARNIVORO, 0.2));
        especies.add(new Especie("Jirafa", TipoAlimentacion.HERBIVORO, 0));
        especies.add(new Especie("Tigre", TipoAlimentacion.CARNIVORO, 0.15));
        especies.add(new Especie("Elefante", TipoAlimentacion.HERBIVORO, 0));
    }

    private static void inicializarSectores() {
        Empleado raul = new Empleado("Raul A", "20111222", "Tucumán" );
        Empleado maria = new Empleado("Maria B", "30111222", "Tucumán" );
        sectores.add(new Sector(1, -26.250724, -65.522827, 10, TipoAlimentacion.HERBIVORO, raul));
        sectores.add(new Sector(2, -26.252359, -65.521511, 10, TipoAlimentacion.CARNIVORO, maria));
        sectores.add(new Sector(3, -26.254661, -65.522726, 10, TipoAlimentacion.HERBIVORO, maria));
        sectores.add(new Sector(4, -26.257250, -65.523514, 10, TipoAlimentacion.CARNIVORO, raul));
    }
    
    private static void inicializarAnimales() throws InvalidPropertiesFormatException {
        
    }

    private static void inicializarPaises(){
        paises.add(new Pais("Sudafrica"));
        paises.add(new Pais("Madagarcar"));
        paises.add(new Pais("Sudan"));
        paises.add(new Pais("Nigeria"));
    }
    
    public static void inicializar() throws InvalidPropertiesFormatException{
        inicializarEspecies();
        inicializarSectores();
        inicializarAnimales();
        inicializarPaises();
    }

    public static ArrayList<Pais> getPaises() {
        if (paises.isEmpty()){
            inicializarPaises();
        }
        return paises;
    }
    
    public static ArrayList<Mamifero> getAnimales() {
        return animales;
    }

    public static ArrayList<Sector> getSectores() {
        return sectores;
    }

    public static ArrayList<Especie> getEspecies() {
        return especies;
    }

    public static double getTotalComida(TipoAlimentacion tipoAlimentacion) {
        double total = 0;
        for(Mamifero animal : animales){
            total += animal.TieneAlimentacion(tipoAlimentacion) ? animal.calcularCantidadDeComida() : 0;
        }
        return total;
    }
}
