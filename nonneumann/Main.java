package nonneumann;

import nonneumann.lexer.Lexer;
import nonneumann.node.Token;

import java.io.FileReader;
import java.io.PushbackReader;

public class Main {
    public static void main(String[] args) {
        try {
            String arquivo = "/home/skywalker/Documents/education/ufs/nonNeumannLang1/nonneumann/testes/comentario.non";

            Lexer lexer =
                    new Lexer(
                            new PushbackReader(
                                    new FileReader(arquivo), 1024));

            Token token;
            while ((token = lexer.next()) != null) {
                System.out.println(token.getClass());
                System.out.println(" ( " + token + ")");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
