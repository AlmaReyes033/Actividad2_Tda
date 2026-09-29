/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alma Reyes
 */
public class IMCAdulto extends IMC  {
    
    
    // ATRIBUTO
    

    private String nombre;

    
    // CONSTRUCTOR
    

    public IMCAdulto(
            String nombre,
            double peso,
            double estatura) {

        // Llama al constructor de la clase padre
        super(peso, estatura);

        if (nombre == null || nombre.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío."
            );
        }

        this.nombre = nombre;
    }

  
    // ==========================================
    // GETTER
    // ==========================================

    public String getNombre() {

        return nombre;
    }

    
    // SETTER
    

    public void setNombre(String nombre) {

        if (nombre == null || nombre.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío."
            );
        }

        this.nombre = nombre;
    }

    
    // MÉTODO DE LÓGICA
    

    public String generarReporte() {

        return "Nombre: " + nombre + "\n"   + generarResumen();
    }
}
