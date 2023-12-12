import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        array.add("Олег");
        array.add("Вася");
        array.add("Влад");

        System.out.println(array.get(1));

        for (String arr: array){
            System.out.println(arr);
        }
    }
}