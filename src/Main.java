import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Fecha actual
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);
        fecha.plusDays(5); // No se modifica el valor de fecha ya que es inmutable
        System.out.println(fecha);
        fecha = fecha.plusDays(5); // Debemos guardar el valor en la variable para modficarlo.
        System.out.println(fecha);

        //Hora actual
        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        //Fecha y hora actual
        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println(fechaHora);

        // Formato de la fecha:
        DateTimeFormatter formatFecha = DateTimeFormatter.ofPattern("dd/MM/yy");
        String fechaHoraFormateada = fechaHora.format(formatFecha);
        System.out.println("Fecha con formato: " + fechaHoraFormateada);

        // Comparar fechas
        LocalDate fechaSuperior = LocalDate.of(2024,5,21);
        boolean isFechaBefore = fecha.isBefore(fechaSuperior);
        System.out.println(isFechaBefore);
    }
}
