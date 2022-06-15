public class Numero {

    private String numero;

    public Numero(String numero) {
        this.numero = numero;
    }

    public String transformarARomano(){

        //Transformamos la cadena a Entero (Wrapper)
        Integer num = Integer.parseInt(numero);
        StringBuilder romano = new StringBuilder();

        // 3457 -> MMMCDLVII
        // miles 3, centenas 4, decenas 5 y unidades 7


        int miles= num/1000; num%=1000; //num=457
        int centenas=num/100; num%=100; //num=57
        int decenas=num/10; num%=10; //num=7
        int unidades=num;

        //Generamos la parte de los miles:
        switch (miles){
            case 1 -> romano.append("M");
            case 2 -> romano.append("MM");
            case 3 -> romano.append("MMM");
        }

        //Generamos la parte de las centenas:
        switch (centenas){
            case 1 -> romano.append("C");
            case 2 -> romano.append("CC");
            case 3 -> romano.append("CCC");
            case 4 -> romano.append("CD");
            case 5 -> romano.append("D");
            case 6 -> romano.append("DC");
            case 7 -> romano.append("DCC");
            case 8 -> romano.append("DCCC");
            case 9 -> romano.append("CM");
        }

        //Generamos las decenas:
        switch (decenas){
            case 1 -> romano.append("X");
            case 2 -> romano.append("XX");
            case 3 -> romano.append("XXX");
            case 4 -> romano.append("XL");
            case 5 -> romano.append("L");
            case 6 -> romano.append("LX");
            case 7 -> romano.append("LXX");
            case 8 -> romano.append("LXXX");
            case 9 -> romano.append("XC");
        }

        //Generamos las unidades:
        switch (unidades){
            case 1 -> romano.append("I");
            case 2 -> romano.append("II");
            case 3 -> romano.append("III");
            case 4 -> romano.append("IV");
            case 5 -> romano.append("V");
            case 6 -> romano.append("VI");
            case 7 -> romano.append("VII");
            case 8 -> romano.append("VIII");
            case 9 -> romano.append("IX");
        }

        return romano.toString();

    }

    @Override
    public String toString() {
        return numero;
    }
}
