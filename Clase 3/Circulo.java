public class Circulo {

    //ATRIBUTOS:
    private double radio;
    // Sintaxis para una variable estática:
    private static int cantidadDeCirculos=0;

    //CONSTRUCTORES:
    public Circulo(double radio) {
        this.radio = radio;
        cantidadDeCirculos++; // Incrementamos su valor al crear cada circulo
    }

    public Circulo(){ //Sobrecargando el constructor
        this.radio=1; // Circulo unitario...
        cantidadDeCirculos++;
    }


    // GETTERS Y SETTERS
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // MÉTODOS PERSONALIZADOS:
    public double calcularArea(){
        double area;
        area=Math.PI*Math.pow(radio,2);
        return area; // El tipo de dato de retorno debe ser igual
        // al de retorno del método
    }

    public double sumarAreaCon(Circulo circulo){
        double sumaAreas;
        sumaAreas= this.calcularArea()+ circulo.calcularArea();
        return sumaAreas;
    }

    // Sobrecargando el método sumarAreaCon
    public double sumarAreaCon(double area){
        double sumaAreas;
        sumaAreas = this.calcularArea()+area;
        return sumaAreas;
    }

    //MÉTODOS ESTÁTICOS:
    public static void cuantosCirculosHay(){
        System.out.printf("\n\t Al momento van %d circulos creados...",cantidadDeCirculos);
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

}
