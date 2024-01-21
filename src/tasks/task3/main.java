package tasks.task3;

import java.util.Locale;
import java.util.Scanner;

public class main {
    private static final Scanner scanner = new Scanner(System.in);
    static String names = "Bob, Alice, Tom, Lucy, Bob, Lisa, Bob";


    public static void main(String[] args) {
        System.out.println("\nNames: " + names);

        findName(names,inputName());

        scanner.close();
    }
    //------------------------------------------------------------------------------------------------------------------
    private static String inputName(){
        scanner.useLocale(Locale.ENGLISH);
       return  scanner.nextLine().trim();
    }
    //------------------------------------------------------------------------------------------------------------------
    private static void findName(String names, String name){

        /*
            зробив приведення до нижнього регістру,
            щоб пошук імені був незалежним до регістру
        */

        //Якщо в списку є хочаб одне ім'я яке шукаємо то
        if (names.toLowerCase().contains(name.toLowerCase())) {
            //переводимо рядок в масисв і
            String[] arrNames = names.split(", ");
            int cnt = 0;
            for (String nm : arrNames) {
                //рахуємо кількість імен які шукаємо
                if (nm.toLowerCase().equals(name.toLowerCase())) {
                    cnt++;
                }
            }

            System.out.println("Found " + cnt + " identical names: " + name);
        }
        else System.out.println("Name: " + name + " not found");

    }
    //------------------------------------------------------------------------------------------------------------------
}
