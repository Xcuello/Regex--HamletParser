import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){

        this.hamletData = loadFile();
    }

    private String loadFile(){

        ClassLoader classLoader = getClass().getClassLoader();

        File file = new File(classLoader.getResource("hamlet.txt").getFile());

        StringBuilder result = new StringBuilder();

        try(Scanner scanner = new Scanner(file)){

            while(scanner.hasNextLine()){

                String line = scanner.nextLine();

                result.append(line).append("\n");
            }

        }catch(IOException e){

            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){

        return hamletData;
    }

    public String changeHamletToLeon(String testString) {

        Pattern pattern = Pattern.compile("\\w+(\\W)?");

        Matcher matcher = pattern.matcher(testString);

        String answer = "";

        while(matcher.find()){

            String word = matcher.group();

            if(word.equals("Hamlet ")) {

                answer += "Leon ";

            } else {

                answer += word;
            }
        }

        return answer;
    }

    public String changeHoratioToTariq(String testString) {

        Pattern pattern = Pattern.compile("\\w+(\\W)?");

        Matcher matcher = pattern.matcher(testString);

        String answer = "";

        while(matcher.find()){

            String word = matcher.group();

            if(word.equals("Horatio ")) {

                answer += "Tariq ";

            } else {

                answer += word;
            }
        }

        return answer;
    }

    public boolean findHoratio(String name) {

        Pattern pattern = Pattern.compile(name);

        Matcher matcher = pattern.matcher(name);

        return matcher.find();
    }


    public boolean findHamlet(String name) {

        Pattern pattern = Pattern.compile(name);

        Matcher matcher = pattern.matcher(name);

        return matcher.find();
    }
}
