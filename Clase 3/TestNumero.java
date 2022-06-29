public class TestNumero {

    public static void main(String[] args) {

        // Solamente acepta números entre 0 y 3999.
        // TODO: Implementar un filtro para el rango valido...
        Numero numA = new Numero("2579");
        numA.mostrar();
        System.out.println("\t "+numA.transformarARomano());

    }

}
