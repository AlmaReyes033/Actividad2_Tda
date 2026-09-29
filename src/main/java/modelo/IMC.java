/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alma Reyes
 */
public class IMC {
    
    // ==========================================
    // ATRIBUTOS
    // ==========================================

    private double peso;
    private double estatura;

    // ==========================================
    // CONSTRUCTOR VACÍO
    // ==========================================

    public IMC() {
        this.peso = 0;
        this.estatura = 0;
    }

    // ==========================================
    // CONSTRUCTOR CON PARÁMETROS
    // ==========================================

    public IMC(double peso, double estatura) {

        if (peso <= 0) {
            throw new IllegalArgumentException(
                    "El peso debe ser mayor que cero."
            );
        }

        if (estatura <= 0) {
            throw new IllegalArgumentException(
                    "La estatura debe ser mayor que cero."
            );
        }

        this.peso = peso;
        this.estatura = estatura;
    }

    // ==========================================
    // GETTER PESO
    // ==========================================

    public double getPeso() {
        return peso;
    }

    // ==========================================
    // SETTER PESO
    // ==========================================

    public void setPeso(double peso) {

        if (peso <= 0) {
            throw new IllegalArgumentException(
                    "El peso debe ser mayor que cero."
            );
        }

        this.peso = peso;
    }

    // ==========================================
    // GETTER ESTATURA
    // ==========================================

    public double getEstatura() {
        return estatura;
    }

    // ==========================================
    // SETTER ESTATURA
    // ==========================================

    public void setEstatura(double estatura) {

        if (estatura <= 0) {
            throw new IllegalArgumentException(
                    "La estatura debe ser mayor que cero."
            );
        }

        this.estatura = estatura;
    }

    // ==========================================
    // MÉTODO DE LÓGICA 1
    // CALCULAR IMC
    // ==========================================

    public double calcularIMC() {

        return peso / (estatura * estatura);
    }

    // ==========================================
    // MÉTODO DE LÓGICA 2
    // OBTENER CATEGORÍA
    // ==========================================

    public String obtenerCategoria() {

        double imc = calcularIMC();

        if (imc < 18.5) {

            return "Bajo peso";

        } else if (imc < 25) {

            return "Peso normal";

        } else if (imc < 30) {

            return "Sobrepeso";

        } else {

            return "Obesidad";
        }
    }

    // ==========================================
    // MÉTODO DE LÓGICA 3
    // CALCULAR PESO SALUDABLE
    // ==========================================

    public String calcularPesoSaludable() {

        double pesoMinimo =
                18.5 * (estatura * estatura);

        double pesoMaximo =
                24.9 * (estatura * estatura);

        return String.format(
                "De %.2f kg a %.2f kg",
                pesoMinimo,
                pesoMaximo
        );
    }

    // ==========================================
    // MÉTODO DE LÓGICA 4
    // OBTENER RECOMENDACIÓN
    // ==========================================

    public String obtenerRecomendacion() {

        double imc = calcularIMC();

        if (imc < 18.5) {

            return "Se recomienda consultar "
                    + "a un profesional de la salud.";

        } else if (imc < 25) {

            return "Tu IMC se encuentra "
                    + "dentro del rango normal.";

        } else if (imc < 30) {

            return "Se recomienda mantener "
                    + "una alimentación equilibrada "
                    + "y realizar actividad física.";

        } else {

            return "Se recomienda consultar "
                    + "a un profesional de la salud.";
        }
    }

    // ==========================================
    // MÉTODO RECURSIVO
    // ==========================================

    public double redondearRecursivo(
            double valor,
            int decimales) {

        // CASO BASE
        if (decimales <= 0) {

            return Math.round(valor);
        }

        // CONDICIÓN DE AVANCE
        double factor = Math.pow(10, decimales);

        return Math.round(valor * factor) / factor;
    }

    // ==========================================
    // OBTENER IMC REDONDEADO
    // ==========================================

    public double obtenerIMCRedondeado() {

        return redondearRecursivo(
                calcularIMC(),
                2
        );
    }

    // ==========================================
    // GENERAR RESUMEN
    // ==========================================

    public String generarResumen() {

        return "Peso: " + peso + " kg\n"
                + "Estatura: " + estatura + " m\n"
                + "IMC: " + obtenerIMCRedondeado() + "\n"
                + "Categoría: " + obtenerCategoria();
    }
}
