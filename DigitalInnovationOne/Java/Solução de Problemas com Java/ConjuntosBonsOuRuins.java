import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConjuntosBonsOuRuins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            int n = Integer.valueOf(br.readLine());
            if (n == 0) {
                break;
            }

            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(br.readLine());
            }

            list = list.stream().sorted().collect(Collectors.toList());
            String result = "Conjunto Bom";

            for (int i = 0; i < n - 1; i++) {
                if (list.get(i + 1).startsWith(list.get(i))) {
                    result = "Conjunto Ruim";
                }
            }

            System.out.println(result);

        }
    }
}