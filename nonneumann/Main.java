package nonneumann;

import nonneumann.lexer.Lexer;
import nonneumann.node.Start;
import nonneumann.parser.*;

import java.io.FileReader;
import java.io.PushbackReader;

public class Main {
    public static void main(String[] args) {
        try {
            String arquivo = "C:\\Users\\david\\IdeaProjects\\nonNeumannV2\\nonneumann\\testes_sintatico\\declaracao_funcao.non";

            Lexer lex = new Lexer(
                    new PushbackReader(
                            new FileReader(arquivo), 1024));
            Parser p = new Parser(lex);

            Start tree = p.parse();
            //Imprime árvore na saída padrão
            //tree.apply(new ASTPrinter());
            //Imprime árvore em interface gráfica
            tree.apply(new ASTDisplay());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
