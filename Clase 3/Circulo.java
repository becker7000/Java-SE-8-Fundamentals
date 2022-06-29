public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

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

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

}
