import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold; //Введите порог для фильтра: 4
    }

    public void filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (int list : source) {
            if (list > treshold) {
                logger.log("Элемент " + list + " проходит");
                result.add(list);
            } else logger.log("Элемент " + list + " не проходит");
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        logger.log("Выводим результат на экран\nОтфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }
}
