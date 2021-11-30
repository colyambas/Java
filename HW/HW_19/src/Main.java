import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        l.add("Hello");
        l.add(" ");
        l.add("world");

        String a = l.get(0);

        System.out.println(l);
        System.out.println(a);

        for (String item : l) {
            System.out.println(item);
        }

        Set<String> s = new HashSet<>();

        s.add("Sergey");
        s.add("Sergey");
        s.add("Sergey");
        s.add("Anna");

        System.out.println(s.contains("Sergey"));
        System.out.println(s);

        for (String item : s) {
            System.out.println(item);
        }

        Map<String, Integer> m = new HashMap<>();

        m.put("1", 526);
        m.put("1", 3160);
        m.put("2", 0);
        System.out.println(m.containsKey("1"));

        String str = "Hello world!";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            Integer value = map.get(ch);
            if (value == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, value + 1);
            }
        }

        for (int item : map.values()) {
            System.out.println(item);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }

        String itemToString = map.toString();
        System.out.println(itemToString);

        System.out.println(map);

        //for EACH
        String[] arrStr = {"1", "2", "3"};
        int[] arrInt = {12, 1, 2, 3};

        for (String item : arrStr) {
            System.out.println(item);
        }

        /*
        * Задача №1

Создать лист и добавить в него следующие слова:
White.
Tan.
Yellow.
Orange.
Red.
Pink.
Purple.
Blue.
Затем удалить из этого списка все цвета в которых встречается буква “L”
*/
        List<String> task1 = new ArrayList<>();


        task1.add("White");
        task1.add("Tan");
        task1.add("Yellow");
        task1.add("Orange");
        task1.add("Red");
        task1.add("Pink");
        task1.add("Purple");
        task1.add("Blue");

        System.out.println(task1);

        int size = task1.size();
        for (int i = 0; i < task1.size(); i++) {
            if (task1.get(i).toLowerCase().contains("l")) {
                task1.remove(i);
                //task1.set(i, "");
                i = 0;
            }
        }


        System.out.println(task1);

        /*

Задача №2

Создать лист со значениями от 100 до 1000.
*/
        List<Integer> task2 = new ArrayList<>();

        for (int i = 100; i <= 1000; i++) {
            task2.add(i);
        }


        System.out.println(task2);
        /*

Задача №3

Удалить из листа, созданного в предыдущей задаче, все четные элементы.

*/
        /*
        for (int i = 0; i < task2.size(); i++) {
           // if (task2.get(i) % 2 == 0){
                task2.remove(i);
           //     i = 0;
          //  }
        }
        System.out.println(task2);
*/



        /*
Экстра задача

Попробуйте изменить тип итерационной переменной из цикла, в третьей задаче, на Integer (не int, а Integer) и добиться такого же результата как и с типом int.

        * */
        for (Integer i = 0; i < task2.size(); i++) {
            System.out.println(i);
             if (task2.get(i.intValue()) % 2 == 0){
            task2.remove(i.intValue());
               //  i = 0;
              }
        }
        System.out.println(task2);
    }
}
