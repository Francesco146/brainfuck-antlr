import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {

        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        InputStream is = cl.getResourceAsStream(args[0]);
        assert is != null;
        CharStream cs = CharStreams.fromStream(is);

        BrainfuckLexer lexer = new BrainfuckLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BrainfuckParser parser = new BrainfuckParser(tokens);

        ParseTree tree = parser.main();

        BrainfuckInterpreter interpreter = new BrainfuckInterpreter();
        interpreter.visit(tree);
    }
}