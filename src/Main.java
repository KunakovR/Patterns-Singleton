import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Введите размер списка: ");
        Scanner scanner = new Scanner(System.in);
        int sizeList = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int upperBoarder = scanner.nextInt();
        List<Integer> source = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < sizeList; i++) {
            source.add(random.nextInt(upperBoarder));
        }
        logger.log("Создаем и наполняем список\nВот случайный список: " + source);
        logger.log("Введите порог для фильтра: ");
        int treshold = scanner.nextInt();
        Filter filter = new Filter(treshold);
        filter.filterOut(source);
    }
}
