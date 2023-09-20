import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("John");
        names.add("Peter");
        names.add("Mary");
        names.add("David");

        System.out.println(Result.PrintName(names));
    }
}