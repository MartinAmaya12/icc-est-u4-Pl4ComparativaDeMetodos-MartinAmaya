package models;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getCriterioOrdenamiento() {
        int valorNombre = 0;
        
        for (int i = 0; i < nombre.length(); i++) {
            valorNombre += nombre.charAt(i);
        }
        
        return edad * 100000 + valorNombre;
    }
}
