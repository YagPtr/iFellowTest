import java.util.Scanner;

/**
 * Задача 3 посложнее:
 * Напишите класс BaseConverter для конвертации из градусов по Цельсию в
 * Кельвины, Фаренгейты, и так далее. У метода должен быть метод convert, который
 * и делает конвертацию.
 * При запуске кода должна быть возможность ввести градусы Цельсия и выбора конвертации в Кельвины или Фаренгейты
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Degree degree = null;
        while (degree == null) {
            System.out.print("Введите \nk - для конвертации в Кельвины\nf - для конвертации в Фаренгейты\nr - для конвертации в Ранкины\n");
            String type=s.nextLine();
            degree =
                    ("f".equals(type)) ? Degree.FAHRENHEIT :
                            ("r".equals(type)) ? Degree.RANKINE :
                                    ("k".equals(type)) ? Degree.KELVIN:
                                            null;
        }
        Double amount=null;
        while (amount == null) {
            System.out.print("Введите значение градусов для конвертации\n");
            try{
                amount = s.nextDouble();
            }
            catch(Exception e){
                s.nextLine();
            }
        }
        System.out.printf("Конвертированное значение равно %.2f ", BaseConventer.convert(amount, degree));
    }

}

enum Degree{
    FAHRENHEIT,      //Фаренгейты
    KELVIN,          //Кельвины
    RANKINE,         //Ранкины
}

class BaseConventer{
   static double convert(double value, Degree degree){
       switch (degree){
           case FAHRENHEIT:
               return value*9/5+32;
           case KELVIN:
               return value+273.15;
           case RANKINE:
               return value*9/5+491.67;
           default:
               return -1;

       }
   }

}