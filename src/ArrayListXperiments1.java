import java.util.Scanner;

public class ArrayListXperiments1 {
  final static String COMMAND_LIST = "LIST";
  final static String COMMAND_ADD = "ADD\\s+.+";
  final static String COMMAND_ADD_TO_INDEX = "ADD\\s+\\d+\\s+.+";
  final static String COMMAND_REMOVE_TO_INDEX = "REMOVE\\s+\\d+\\s+.+";
  final static String COMMAND_EDIT_TO_INDEX = "EDIT\\s+\\d+\\s+.+";


  public static void main(String[] args) {
      menu();
      String test = "ADD 8 gfjg ghijh hjh.";
    System.out.println(splitUp3(test));


  }
  public static String enterLine() {
    Scanner in = new Scanner(System.in);
    return in.nextLine();
  }
  private static void menu() {
    String text = enterLine();
    if (text.matches(COMMAND_LIST)){
        Deletion.printList();
    }
    if (text.matches(COMMAND_ADD)) {
        Deletion.add(splitUp2(text));
      }
    if (text.matches(COMMAND_ADD_TO_INDEX)){  //
      Deletion.addListIndex(indexNumber(splitUp3(text)),splitUp2(text));
        }
      else
        Deletion.instruction();
  }
  private static int indexNumber(String str) {
    return Integer.getInteger(str);
  }
  private static String splitUp2(String s){
    String[] a = s.split("\\s+",2 );
    if (a.length == 2 && a[0] != null) {
      return a[1];
    }
    else return a[0];
  }
  private static String splitUp3(String s) {
    String[] a = s.split("\\s+", 3);
    if (a.length == 3 && a[1] != null) {
      return a[1];
    } else return "null";
  }
}