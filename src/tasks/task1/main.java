package tasks.task1;

public class main {

    static String products = "brange, plum, tomato, onibn, grape";


    public static void main(String[] args) {
        //Виправляю слова з помилками
        String correctProducts = сorrectMistakes(products, "b", "o");

        //метод split() рядок на підрядки використовуючи кому з пробілом як розділювач
        String[] arrProducts = stringToArray(correctProducts, ", ");

        //вивід набору слів у стовбець
        printTex(arrProducts);

    }

    //------------------------------------------------------------------------------------------------------------------
    private static String сorrectMistakes(String str, String regex, String replacement) {

        return str.replaceAll(regex, replacement);
    }
    //------------------------------------------------------------------------------------------------------------------

    private static String[] stringToArray(String str, String separator) {
        //методом split() перетворюю рядок на підрядки використовуючи кому з пробілом як розділювач
        return str.split(separator);
    }

    //------------------------------------------------------------------------------------------------------------------
    private static void printTex(String[] arrStr) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        for (String product : arrStr) {
            count++;
            stringBuilder.append(count).append(") ").append(product).append("\n");
        }

        System.out.println(stringBuilder.toString());

    }
    //------------------------------------------------------------------------------------------------------------------
}
