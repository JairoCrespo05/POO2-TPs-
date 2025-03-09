
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Tiempo {

    private LocalDateTime fecha;

    public Tiempo(LocalDateTime fecha){
        this.fecha = fecha;

    }

    public String formatoDeFechaLargo(){

        return fecha.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

    public String formatoDeFechaCorto(){

        return fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

}
