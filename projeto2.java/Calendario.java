import java.time.*; // importa a classe de data
// * importa toda a classe e subclasses

public class Calendario {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1); /*
                                           * vai para o
                                           * inicio do Mês
                                           */
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = segunda 2 = terça
        // ... 7 = domingo
        System.out.println("Seg Ter Qua Qui Sex Sab Dom");
        for (int i = 1; i < value; i++) {
            System.out.print("    "); // 4 espaços
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1){
                System.out.println();
            }

        }
        if (date.getDayOfWeek().getValue() != 1){
            System.out.println();
        }

    }
}