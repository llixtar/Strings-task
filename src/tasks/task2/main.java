package tasks.task2;


public class main {

    static String products = "onion, orange, plum, tomato, onion, grape, onion";
    static String redundantWord;// зайве слово в списку


    public static void main(String[] args) {
        System.out.println("\nInitial list of products: \n" + products);

        redundantWord = "onion";

        printText(deleteWord(products, redundantWord));

    }

    //------------------------------------------------------------------------------------------------------------------
    private static StringBuffer deleteWord(String text, String word) {
        int indxB = 0;
        int indxE = 0;
        int lengthWord = word.length();
        int length = text.length();
        int cnt = 0;

        StringBuffer sb = new StringBuffer(text);

        while (indxE < (length - lengthWord)) {
            indxB = sb.indexOf(word, indxB);
            indxE = indxB + lengthWord;

            if (indxB == 0) sb.delete(indxB, indxE + 2);
            else sb.delete(indxB - 2, indxE);

            length = sb.length();
            cnt++;
            System.out.println("\nDelete " + cnt + " " + word + ":\n" + sb.toString());

        }

        return sb;
    }

    //------------------------------------------------------------------------------------------------------------------
    private static void printText(StringBuffer text) {
        String separator = ", ";

        int indxB = 0;
        int indxE = 0;
        int lengthWord = separator.length();
        int count = 1;

        while (indxB != -1) {
            indxB = text.indexOf(separator, indxB);

            if(indxB > 0) {
                indxE = indxB + lengthWord;

                count++;
                String rplc = "\n" + Integer.toString(count) + ") ";
                text.replace(indxB, indxE, rplc);
            }

        }
        System.out.println("\n1) " + text.toString());
    }
    //------------------------------------------------------------------------------------------------------------------
}
