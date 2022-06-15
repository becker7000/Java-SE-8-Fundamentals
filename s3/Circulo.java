public class Circulo {

    private double radio;
    private static int cantidadCirculos=0;

    public Circulo(double radio) {
        this.radio = radio;
        cantidadCirculos++;
    }

    //Sobrecargando el constructor:
    public Circulo(){
        this.radio=1;
        cantidadCirculos++;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // +calcularArea(): double
    public double calcularArea(){
        double area;
        area=Math.PI*Math.pow(radio,2);
        return area;
    }

    // +sumarAreaCon(Circulo C): double
    public double sumarAreaCon(Circulo C){
        double sumaDeAreas;
        sumaDeAreas=this.calcularArea()+C.calcularArea();
        return sumaDeAreas;
    }

    // Sobrecargando el método sumarAreaCon
    // +sumarAreaCon(double area): double
    public double sumarAreaCon(double area){
        double sumaDeAreas;
        sumaDeAreas=this.calcularArea()+area;
        return sumaDeAreas;
    }

    // Método estático para mostrar cuantos Circulos han sido creados:
    public static void cuantosCirculosHay(){
        System.out.printf("\n\t Hay %d circulos creados",cantidadCirculos);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
