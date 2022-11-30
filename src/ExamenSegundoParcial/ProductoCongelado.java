package ExamenSegundoParcial;

public class ProductoCongelado extends Producto {
    private double tempCongelacionRecomendada;

    public ProductoCongelado(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        tempCongelacionRecomendada = 0;
    }

    public void setTemperaturaRecomendada(double temperatura){
        tempCongelacionRecomendada = temperatura;
    }

    public double getTemperaturaRecomendada(){
        return tempCongelacionRecomendada;
    }

    public void imprimirDatos(){
        imprimirInfo();
        System.out.println("Temperatura Recomendada: " + getTemperaturaRecomendada() + "\n");
    }
}



