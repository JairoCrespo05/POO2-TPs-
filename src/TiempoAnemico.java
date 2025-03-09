import java.time.LocalDateTime;

public class TiempoAnemico {
    private LocalDateTime fecha;

    public TiempoAnemico(){

    }

    public void setFecha(LocalDateTime fecha){
        this.fecha = fecha;
    }

    public LocalDateTime getFecha(){
        return fecha;
    }


}
