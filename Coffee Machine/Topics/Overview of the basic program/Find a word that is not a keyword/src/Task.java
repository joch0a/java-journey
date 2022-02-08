// You can experiment here, it won’t be checked

import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    var total = 0;
    for (int i = 0; i < 5; i++) {
      total++;
      if (i < 3) {
        continue;
      } else {
        for (int j = 0; j < 5; j++) {
          total++;
        }
      }
    }

    System.out.println(total);
  }
}
