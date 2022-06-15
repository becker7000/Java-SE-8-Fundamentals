public class ReciboCFE {

    private double consumo; //kWh
    private final double t1=1.2;
    private final double t2=1.5;
    private final double t3=1.8;

    public ReciboCFE(double consumo) {
        this.consumo = consumo;
    }

    public double getConsumo() {
        double clone=consumo;
        return clone;
    }

    //Método para generar un reporte de consumo:

    public String generarReporte(){

        //Variable local dentro de generarReporte
        double tarifa=0.0;

        //Asignamos una tarifa al usuario:
        if(consumo<800){
            tarifa=t1;
        }else if(consumo>=800 && consumo<=1450){
            tarifa=t2;
        }else{
            tarifa=t3;
        }

        double montoAPagar=tarifa*consumo;

        //Generar el reporte como un string
        StringBuilder reporte = new StringBuilder();

        // append, remove, indeOf(String cadena), insert

        reporte.append("\n\t +------------------------+");
        reporte.append("\n\t +-------REPORTE-CFE------+");
        reporte.append(String.format("\n\t | Consumo: %.2f kWh",consumo));
        reporte.append(String.format("\n\t | Tarifa: $%.2f x kWh",tarifa));
        reporte.append(String.format("\n\t | Monto: $%.2f",montoAPagar));
        reporte.append("\n\t +------------------------+");

        //Con el método toString() transformamos a String()
        return reporte.toString();

    }

}
