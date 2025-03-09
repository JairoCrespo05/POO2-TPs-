
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        //Forma Anemica
        /*La forma Anemica deja un modelo vacio de logica y encapsulamiento, en donde
        * todo el proceso y resultado se generan por fuera del modelo, cosa que va en contra de los principios de la POO.
        * Como se ve a continuacion la clase Anemica utiliza un setter para instanciarse y luego mediante un getter recupera la fecha
        * Pero La clase TiempoAnemico carece de procesos Logicos debido a que depende de que se haga todo en el Main */

        TiempoAnemico tiempoAnemico = new TiempoAnemico();
        tiempoAnemico.setFecha(LocalDateTime.now());

        System.out.println("////////////Forma Anemica/////////////");
        System.out.println(tiempoAnemico.getFecha().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(tiempoAnemico.getFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));


        //Forma NO Anemica
        /* La forma NO Anemica respeta el encapsulamiento de la informacion y mantiene toda la logica y los procesamientos dentro de la clase Tiempo
        * En donde mediante un constructor se instancia la fecha que va a devolver en cierto formato y, utilizando 2 metodos,
        * se obtienen los resultados la cual es la fecha en Formato Corto o Formato Largo */

        Tiempo tiempo = new Tiempo(LocalDateTime.now());

        System.out.println("//////////////Forma NO Anemica/////////////");
        System.out.println(tiempo.formatoDeFechaLargo());
        System.out.println(tiempo.formatoDeFechaCorto());

    }
}