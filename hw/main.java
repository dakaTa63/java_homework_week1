package hw;
import java.util.Scanner;

public class main {

    public static void main(String[] args){

        rectangular rekt = new rectangular();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете страна а: ");
            int numberOneA = Integer.parseInt(scanner.nextLine());
        System.out.println("Въведете страна б: ");
            int numberTwoB = Integer.parseInt(scanner.nextLine());

            System.out.println("Обиколката на правоъгълника е равна на: " + rekt.calculatePerimeter(numberOneA , numberTwoB));
            System.out.println("Лицето на правоъгълнка е равно на: " + rekt.calculateSurface(numberOneA , numberTwoB));




        int January = 31;
        int February = 29;
        int March = 30;
        int April = 30;
        int May = 31;
        int June = 30;
        int July = 31;
        int August = 30;
        int September = 30;
        int October = 31;
        int November = 30;
        int December = 31;


        if (February == 30) {
            System.out.println("Месецът има 30 дни ");
        } else if (November == 31) {
            System.out.println("Месецът има 31 дни ");
        } else {
            System.out.println("Месецът има 29 дни ");
        }




        int floor = 9;
        while(floor < 0 || floor > 8 ){
            System.out.println("въведете етаж: (от 0 до 8) ");
            floor = Integer.parseInt(scanner.nextLine());
        }

        String floors ;

        switch(floor){
            case 8:
                 System.out.println("Хей Мими ;)");
                break;
            case 7:
                System.out.println("Хей Пепи ;)");
                break;
            case 6:
                System.out.println("Хей Ваня ;)");
                break;
            case 5:
                System.out.println("Хей Вики ;)");
                break;
            case 4:
                System.out.println("Хей Роси ;)");
                break;
            case 3:
                System.out.println("Хей Маги ;)");
                break;
            case 2:
                System.out.println("Хей Стаси ;)");
                break;
            case 1:
                System.out.println("Хей Жаси ;)");
                break;
            case 0:
                System.out.println("АУЧ!");
                break;
        }

    }

}







