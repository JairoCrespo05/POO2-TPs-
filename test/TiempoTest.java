import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

public class TiempoTest {
    @Test
    public void test1(){

        var tiempo = new Tiempo(LocalDateTime.now());

        assertTrue(tiempo.formatoDeFechaLargo().equals("domingo, 9 de marzo de 2025"));

    }

    @Test
    public void test2(){

        var tiempo = new Tiempo(LocalDateTime.now());

        String condicion = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        assertTrue(tiempo.formatoDeFechaCorto().equals(condicion));

    }

}