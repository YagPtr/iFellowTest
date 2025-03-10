/**
 * Задача 4 посложнее:
 * Напишите метод, который будет вычислять угол между часовой и минутной стрелками часов. На вход функции подаётся время в виде двух переменных: "hours" и "minutes".
 * Расчет угла производить относительно реального поведения стрелок часов.
 */
public class Task4 {
    public static void main(String[] args) {

        System.out.println(calcDegree(12,23));
    }

    /**
     * 360 / 12 * hours упрощается до 15 * hours - градусы часовой стрелки
     * 360 / 12 / 60 * minutes упрощается до 0.5 * minutes - градусы часовой стрелки по минутам
     * 360 / 60 * minutes упрощается до 6 * minutes - градусы минутной стрелки
     * @param hours
     * @param minutes
     * @return
     */
    static double calcDegree(int hours, int minutes) {
        double abs = Math.abs(5.5 * (minutes) - 15 * (hours % 12));
        return Math.min(abs, 360 - abs);
    }
}

