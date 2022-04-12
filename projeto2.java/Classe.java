import java.time.*; 

public class Classe {
    public static void main (String [] args) {
        LocalDate date= LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        System.out.println(month +""+today);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue ();
        System.out.println(" SEG TER QUA QUI SEX SAB DOM");
        for (int i = 1; i < value; i++) {
            System.out.println("    " );        
        }
        while (date.getMonthValue()== month){
            System.out.printf("%3d" , date.getDayOfMonth());
            if (date.getDayOfMonth()== today){
                System.out.println("*");
            }else {
                System.out.print (" ");
            }
            date=date.plusDays (1);
            if (date.getDayOfWeek().getValue() == 1){
                System.out.println ();
            }

        }
        if (date.getDayOfWeek().getValue () !=1){
            System.out.println();
        }
    }
    }
    

