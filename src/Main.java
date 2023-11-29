// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1. Использование статического метода
        Build[] builds = new Build[5];
        for (int i = 0; i < 5; i++) {
            builds[i] = new Build();
        }
        System.out.printf("Число заказов: %d", Build.GetNumber() - 1);

        //2. Использование массива объектов
        Build[] test = new Build[3];
        test[0] = new Build("Андрей");
        test[1] = new Build("Сергей");
        test[2] = new Build("Станислав");
        for (Build item : test) item.out_build();

        //3. Возврат объекта через вспомогательный класс
        int status = Build.Stat.GetStat(Status.WORKING.getName());
        Build build = new Build(status);
        build.out_build();

        //4. Работа с классом String
        String test1 = test[1].GetClient();
        System.out.println(String.join(" ", test1));
        System.out.println(test1.toUpperCase());
        String ex = "Где я?";
        String[] words = ex.split(" ");
        for (String word : words) System.out.println(word);
    }
}