package testmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 */
public class MyTranslator {
    HashMap<String,String> dictionary = new HashMap<>();

    void addNewWord(String en, String ru){
       dictionary.put(en, ru);
    }

    String translate (String en){
        return dictionary.get(en);
    }

    public static void main(String[] args) {
        MyTranslator transl = new MyTranslator();
        transl.addNewWord("cat", "котик");
        transl.addNewWord("good", "хорошо");
        transl.addNewWord("mood", "настроение");
        transl.addNewWord("sun", "солнце");

        System.out.println(transl.translate("cat"));
        System.out.println(transl.translate("good"));
        System.out.println(transl.translate("mood"));
        System.out.println(transl.translate("dog"));

        Scanner sc = new Scanner(System.in);
        String fromConsole = sc.nextLine();
        StringTokenizer st = new StringTokenizer(fromConsole);

        while (st.hasMoreTokens()){
            System.out.print(transl.translate(st.nextToken()) + " ");
        }
    }

}


