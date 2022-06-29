public class ReciboCFE {

    private double consumo;
    // final nos ayuda a declarar constantes:
    // Atajo: ctrl+d duplica una línea
    private final double tarifa1 = 1.2;
    private final double tarifa2 = 1.5;
    private final double tarifa3 = 1.8;

    public ReciboCFE(double consumo) {
        this.consumo = consumo;
    }

    //Método generarReporte
    public String generarReporte(){

        //Variable local
        double tarifa = 0.0;

        //Asignamos una tarifa de acuerdo al consumo:
        if(consumo<800){
            tarifa=tarifa1;
        }else if(consumo>=800 && consumo<=1450){ // Rangos
            tarifa=tarifa2;
        }else{
            tarifa=tarifa3;
        }

        double monto = consumo*tarifa;

        //Generamos un reporte con StringBulder:
        StringBuilder reporte = new StringBuilder();

        reporte.append("\n\t +-------REPORTE-------+ ");
        reporte.append(String.format("\n\t | Consumo: %.2f",consumo));
        reporte.append(String.format("\n\t | Tarifa: %.2f",tarifa));
        reporte.append(String.format("\n\t | Monto: %.2f",monto));
        reporte.append("\n\t +---------------------+ ");

        // toString() transforma a String un objeto de tipo StringBuilder
        return reporte.toString();
    }

}
