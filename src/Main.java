
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("sample.py");
        Scanner reader = new Scanner(file);

        StringBuilder text = new StringBuilder();

        while (reader.hasNextLine()) {
            String next = reader.nextLine();
            text.append(next);
            text.append("\n");
        }

        Parser analyzer = new Parser();
        analyzer.parse(text.toString());
    }}