import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Deletion {

 private static ArrayList<String> todoList = new ArrayList<>();

 public static void printList() {
   todoList.add(0,"Почистить зубы.");
   todoList.add(1,"Выпить кофе.");
   todoList.add(2,"Поехать на работу.");
   todoList.add(3,"Купить продукты.");
   for (int i = 0; i < todoList.size(); i++)
     System.out.println(todoList.get(i));
 }
  public static void instruction(){
    System.out.println("Я умею работать со списком приминяя следующие команды:\n" +
            "LIST печатаю список в консоль\n" +
            "ADD Какое-то дело\n" +
            "ADD 4 Какое-то дело на четвёртом месте\n" +
            "EDIT 3 Новое название дела\n" +
            "DELETE 7 ");
  }
  public static void addListIndex(int index, String text){
    if (index < 0) {
      System.out.println("Индекс " + index + " неверный, введите еще раз");
    }
    if (index > todoList.size()) {
      add(text);
    } else {
      todoList.add(index, text);
    }
  }

  public static void add(String text) {
    todoList.add(text);
  }
}
