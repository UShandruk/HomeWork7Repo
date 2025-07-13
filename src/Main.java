//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 1");
        int amountTotal1 = 2_459_000;
        int deposit1 = 15_000;
        int amountCurrent1 = 0;
        int monthCurrent1 = 1;

        while(amountCurrent1 < amountTotal1)
        {
            amountCurrent1 = amountCurrent1 + deposit1;
            System.out.println("Месяц " + monthCurrent1 + ", сумма накоплений равна " + amountCurrent1 + " рублей.");
            monthCurrent1++;
        }
        System.out.println("");

        System.out.println("Задача 2");
        int i = 1;
        while(i <= 10)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        for (int ii = 10; ii >= 1; ii--)
        {
            System.out.print(ii + " ");
        }
        System.out.println("");
        System.out.println("");

        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertilityPerThousand = 17;
        int mortalityPerThousand = 8;
        int yearCount = 10;
        int currentYear = 2025;

        for (int year = currentYear; year < currentYear + yearCount; year++)
        {
            population = population + population * fertilityPerThousand / 1000 - mortalityPerThousand / 1000;
            System.out.println("Год " + (currentYear + yearCount) + ", численность населения составляет " + population + ".");
        }

        System.out.println("");

        System.out.println("Задача 4");
        int deposit4 = 15_000;
        float percent4 = 0.07f;
        int amountTotal4 = 12_000_000;

        for(int month = 0; deposit4 < amountTotal4; month++ )
        {
            deposit4 = Math.round(deposit4 + deposit4 * percent4);
            System.out.println("В " + month + " месяц сумма накоплений составит " + deposit4 + " рублей.");
        }
        System.out.println("");

        System.out.println("Задача 5");
        int deposit5 = 15_000;
        float percent5 = 0.07f;
        int amountTotal5 = 12_000_000;

        for(int month = 0; deposit5 < amountTotal5; month++ )
        {
            if (month % 6 == 0)
            {
                deposit5 = Math.round(deposit5 + deposit5 * percent5);
                System.out.println("В " + month + " месяц сумма накоплений составит " + deposit5 + " рублей.");
            }
        }
        System.out.println("");

        System.out.println("Задача 6");
        int deposit6 = 15_000;
        float percent6 = 0.07f;
        int monthTotal6 = 108; // 9 * 12

        for(int month = 0; month < monthTotal6; month += 6) // month = month + 6
        {
            if (month % 6 == 0)
            {
                deposit5 = Math.round(deposit5 + deposit5 * percent5);
                System.out.println("В " + month + " месяц сумма накоплений составит " + deposit5 + " рублей.");
            }
        }

        System.out.println("");

        System.out.println("Задача 7");
        int firstFriday = 4;
        int daysInMonth = 31;
        for(int day = firstFriday; day <= daysInMonth; day += 7) //day = day + 7
        {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("");

        System.out.println("Задача 8");
        int firstYear = 0;
        int period = 79;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        for(int year = firstYear; year < endYear; year += period) //year = year + period
        {
            if (year > startYear)
            {
                System.out.println(year);
            }
        }
    }
}