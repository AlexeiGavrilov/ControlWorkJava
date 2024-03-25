package methods;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PrepareStringFromFile {

    public static void PrepareString(String path)  {
        try {
            String result = Files.readString(Paths.get(path));
            String[] picnic = result.toLowerCase().replaceAll("\\s+"," ").split(" ");
            CalculationWords.CalculationWord(picnic);
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }

    }

}
