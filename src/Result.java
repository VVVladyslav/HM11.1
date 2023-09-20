import java.util.List;

public class Result {

    public static String PrintName(List<String> names) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < names.size(); i++) {

            if (i % 2 == 0) {
                if (result.length() > 0) {
                    result.append(", ");
                }
                result.append((i + 1) + ". " + names.get(i));
            }
        }
        return result.toString();
    }
}

