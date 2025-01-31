package nonneumann;

import nonneumann.lexer.Lexer;
import nonneumann.node.EOF;
import nonneumann.node.Token;
import java.io.FileReader;
import java.io.PushbackReader;

public class Main {
    public static void main(String[] args) {
        try {
            String arquivo = "C:\\Users\\david\\IdeaProjects\\nonNeumannV2\\nonneumann\\testes\\comentario.non";

            Lexer lexer =
                    new Lexer(
                            new PushbackReader(
                                    new FileReader(arquivo), 1024));

            Token token;
            while (!((token = lexer.next()) instanceof EOF)) {
                System.out.println(token.getClass());
                System.out.println(" ( " + token + ")");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
