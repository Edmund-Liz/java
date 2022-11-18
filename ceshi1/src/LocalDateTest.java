import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate a=LocalDate.of(2022,11,18);
        int year=a.getYear();
        int month=a.getMonthValue();
        int day=a.getDayOfMonth();
        System.out.print(a+"\n"+year+" "+month+" "+day+"\n");
        LocalDate b=a.plusDays(14);
        System.out.println(b);
    }
}
