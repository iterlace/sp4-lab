public class TokenPatterns {
    public static final String NUMBER = "((?:\\d*)|(?:\\d*?\\.?\\d+(?:e[\\-+]\\d+)?))";
    public static final String BOOLEAN = "(False|True)";
    public static final String STRING = "((?:[bfr])\"(?:\\\\\"|[^\"])*?\")";
    public static final String KEYWORD = "(import|as|class|def|pass|if|elif|else|try|except|throw|for|while|in|is|await|None|raise|return|and|or|lambda|break|continue|from|assert|with|not|async|yield|global|del|print)";
    public static final String COMMENT = "#.*(\\r|\\n|\\r\\n|$)";
    public static final String OPERATORS = "<(?!=)|\\.|>(?!=)|<=|>=|!=|(?<![<>!=+-/%&^|])=|==|!(?!=)|\\+(?!\\+)|-(?!-)|\\*|/|%|\\+\\+|--|&&|(?!&)&|~|<<|>>(?!>)|>>>";
    public static final String IDENTIFIER = "[_A-Za-z][0-9A-Za-z_]*";
    public static final String DELIMITER = "[(){};,\\[\\]]";
}
