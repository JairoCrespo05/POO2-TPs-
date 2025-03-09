
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        Tiempo tiempo = new Tiempo(LocalDateTime.now());

        TiempoAnemico tiempoAnemico = new TiempoAnemico();
        tiempoAnemico.setFecha(LocalDateTime.now());

        //Forma Anemica
        System.out.println("////////////Forma Anemica/////////////");
        System.out.println(tiempoAnemico.getFecha().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(tiempoAnemico.getFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));


        //Forma NO Anemica
        System.out.println("//////////////Forma NO Anemica/////////////");
        System.out.println(tiempo.formatoDeFechaLargo());
        System.out.println(tiempo.formatoDeFechaCorto());

    }
}