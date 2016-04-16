import com.sun.org.apache.xpath.internal.SourceTree;

import java.math.BigDecimal;
import java.util.*;

  public class Gool {

      static String str = "mama papa m mama papa mama m m g g  g ";


      public static void main(String[] args) {

          String[] arrStr = str.split(" ");
          int count = 0;
          String favorinWord = "";
          for (int i = 0; i < arrStr.length; i++) {
              int temp = 0;
              for (int j = 0; j < arrStr.length; j++) {

                  if (arrStr[i].equals(arrStr[j])) {
                      temp++;
                  }

                  if (temp > count) {
                      count = temp;

                  }
              }
          }
          Set<String> arrS = new TreeSet<>();
          for (int i = 0; i < arrStr.length; i++) {
              int temp = 0;
              for (int j = 0; j < arrStr.length; j++) {

                  if (arrStr[i].equals(arrStr[j])) {
                      temp++;
                  }
                  if (temp == count) {
                      arrS.add(arrStr[i]);
                      // favorinWord = arrStr[i];
                  }
              }
          }
                  String total = "";
                  for (String s : arrS) {
                      if (total==""){
                          total = s;
                      }
                      else {
                          total = total + " & " + s;
                      }
                  }
          System.out.println( "Часто встречающиеся слова " +total);
              }


          }










