import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interpreter {
//    todo
//    has no else
//    doesn't look at the package and imports, only looks at func main
//    if stuff after main - will give errors
//    var x = 10 - only supported assignment
//    no ( ) in expressions
//    supports only integer variables
//    fmt.Scanln(&n) - doesn't check if n exists or not

    private final Map<String, Integer> state = new HashMap<>(); // Variable storage
    // todo execute parse statement parse expression
    public void program(String code) {
        String[] stms = getStatement(code);

        if (stms[0] == null) return;

//        System.out.println(stms[0]);
//        System.out.println("//////////");
        execute(stms[0]);
        program(stms[1]);
    }


    //    returns nextStatement, rest_code
    public String[] getStatement(String code) {
        if (code == null || code.trim().equals("")) return new String[] {null, null};

        // handles one line statements
        code = code.trim();
        String[] lines = code.split("\n");
        String first_line = lines.length > 0 ? lines[0].trim() : code;

        if (    first_line.startsWith("//") ||
                first_line.contains("fmt.Println") || first_line.contains("fmt.Scanln") ||
                first_line.contains("var") ||
                (!first_line.contains("if") && !first_line.contains("for") && first_line.contains("="))) {
            String stm = code.split("\n")[0];
            if (code.length() == stm.length()) return new String[]{stm, null};

            return  new String[]{stm, code.substring(stm.length() + 1)};
        }

        // for statements which have statements inside, like if
        int begin = 0;
        int end = 0;
        char[] codeInChar = code.toCharArray();

        // end of statement is reached when number of { and } match
        for (char c : codeInChar) {
            if (begin != 0 && begin == end)
                break;

            if (c == '{')
                begin++;
            else if (c == '}') {
                end++;
            }
        }

        if (begin == 0 || begin != end) return new String[] {null, null};

        int index_of_last_end = 0;

//        find index of last }
        for (char c : codeInChar) {
            if (end == 0) break;
            if (c == '}') end--;
            index_of_last_end++;
        }

        String stm = code.substring(0, index_of_last_end);

//        if last statement is reached rest is set to null
        if (code.length() == stm.length()) return new String[]{stm, null};

        return new String[]{stm, code.substring(stm.length() + 1)};
    }



    public Map<String, Integer>  runCode(String fileName){
        // Read the contents of the file
        String code = null;
        try {
            code = Files.readString(Path.of(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Clean the code by replacing multiple spaces and newlines with a single space
//        String cleanedCode = code.replaceAll("\\s+", " ");
//        find function main and run it

        int i = code.indexOf("func main()");
        if (i == -1) {
            throw new RuntimeException("function main is undeclared in the main package");
            //The code runs the main part, if it's not declaired throws an error
        }
        else {
            code = code.substring(i + 11);
            int start = code.indexOf("{");
            int end = code.lastIndexOf("}");
            code = code.substring(start + 1, end).trim();
        }
        program(code);
        return this.state;
    }


    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        Map<String, Integer>  c = interpreter.runCode("Fibonacci.go");

    }
}