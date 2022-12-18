import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public void parse(String text) {
        text = text.replaceAll(TokenPatterns.COMMENT, " ");

        List<Token> tokens = new ArrayList<>();
        boolean[] matched = new boolean[text.length()];

        for (NamedPattern pattern : patterns) {
            Matcher m = pattern.pattern.matcher(text);
            while (m.find()) {
                if (match(matched, m.start(), m.end() - 1)) {
                    tokens.add(new Token(m.start(), m.group(0), pattern.name));
                }
            }
        }

        tokens.sort(Comparator.comparingInt(t -> t.start));
        tokens.forEach(token -> System.out.println(token.value + " - " + token.type));
    }

    private boolean match(boolean[] matched, int l, int r) {
        assert l <= r;
        for (int i = l; i <= r; i++) {
            if (matched[i])
                return false;
            matched[i] = true;
        }
        return true;
    }

    record NamedPattern(Pattern pattern, String name) {
    }

    record Token(Integer start, String value, String type) {
    }


    public static final List<NamedPattern> patterns = new ArrayList<NamedPattern>(Arrays.asList(
        new NamedPattern(Pattern.compile(TokenPatterns.STRING), "string"),
        new NamedPattern(Pattern.compile(TokenPatterns.KEYWORD), "keyword"),
        new NamedPattern(Pattern.compile(TokenPatterns.BOOLEAN), "boolean"),
        new NamedPattern(Pattern.compile(TokenPatterns.IDENTIFIER), "identifier"),
        new NamedPattern(Pattern.compile(TokenPatterns.NUMBER), "number"),
        new NamedPattern(Pattern.compile(TokenPatterns.OPERATORS), "operator"),
        new NamedPattern(Pattern.compile(TokenPatterns.DELIMITER), "delimiter"),
        new NamedPattern(Pattern.compile(TokenPatterns.COMMENT), "comment")
    ));
}
