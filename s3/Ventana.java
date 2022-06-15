import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private String titulo;
    private JPanel panel;
    private JTextField textField;
    private JTextArea reporte;
    Double consumo;


    public Ventana(String titulo, int ancho, int altura){

        this.titulo=titulo;

        //Ajustamos el tamaño de la ventana:
        setSize(ancho,altura);

        //Ajustamos el título;
        setTitle(titulo);

        //Ajustamos el tamaño mínimo de la ventana:
        setMinimumSize(new Dimension(450,450));

        // Ajustamos que la ventana aparezca justo al centro
        // de forma automatica.
        setLocationRelativeTo(null);

        //Agregando componentes a la Ventana:
        iniciarComponentes();

        //Configuramos la acción que se ejecutará al cerrar la ventana:
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarCajaTexto();
        colocarBoton();
    }

    public void colocarPaneles(){

        panel = new JPanel();

        // Existe un diseño por defecto para las ventanas en Java:
        // Desactivamos ese diseño:
        panel.setLayout(null);

        // Agregamos JFrame el panel:
        this.getContentPane().add(panel);

    }

    public void colocarEtiquetas(){

        //Creamos una etiqueta de texto con un mensaje:
        JLabel etiqueta = new JLabel();

        //Ajustamos el texto de la etiqueta:
        etiqueta.setText("Recibo CFE, consumo electrico");

        //Ajustamos permisos de diseño:
        etiqueta.setOpaque(true);

        //Ajustamos la alineación del texto en el label:
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

        //Ajustamos el tamaño y la posición del JLabel
        etiqueta.setBounds(10,20,450,20);
        //etiqueta.setSize(450,20);

        //Creamos una instancia de una Fuente
        Font font = new Font("Arial",Font.BOLD,18);

        //Agregamos la fuente creada a la JLabel
        etiqueta.setFont(font);

        //Configuramos el color de la fuente
        etiqueta.setForeground(Color.BLUE);

        //Agregamos la etiqueta al panel
        panel.add(etiqueta);

    }

    public void colocarCajaTexto(){
        textField = new JTextField();
        //Ajustamos posición y tamaño del input:
        textField.setBounds(90,60,200,30);
        //Agregamos el input al panel
        panel.add(textField);
    }

    public void colocarBoton(){

        //Creamos un boton:
        JButton button = new JButton("Calcular");

        //Ajustamos el tamaño del boton:
        button.setBounds(90,110,200,30);

        //Creamos una instancia de una Fuente
        Font font = new Font("Arial",Font.BOLD,18);

        //Agregamos una fuente al botón
        button.setFont(font);

        //Color de fuente
        button.setForeground(Color.BLUE);

        //Agregamos el botón al panel
        panel.add(button);

        //Creamos una zona de texto
        reporte = new JTextArea();
        reporte.setBounds(90,160,300,100);
        reporte.setForeground(Color.DARK_GRAY);

        //Creamos una fuente para la textArea
        //Creamos una instancia de una Fuente
        Font font2 = new Font("Arial",Font.BOLD,14);

        //Ajustamos la fuente del textArea
        reporte.setFont(font2);

        //Agregamos el reporte al panel
        panel.add(reporte);

        //Acción del botón:
        ActionListener click = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consumo=Double.parseDouble(textField.getText());
                ReciboCFE reciboCFE = new ReciboCFE(consumo);
                reporte.setText(reciboCFE.generarReporte());
            }
        };

        button.addActionListener(click);

    }



}
