public class TokenPatterns {
    public static final String NUMBER = "((?:\\d*?\\.\\d+(?:e[\\-+]\\d+)?)|(?:\\d+))";
    public static final String BOOLEAN = "\\b(False|True)\\b";
    public static final String STRING = "((?:[bfr]?)\"(?:\\\\\"|[^\"])*?\")";
    public static final String KEYWORD = "\\b(import|as|class|def|pass|if|elif|else|try|except|throw|for|while|in|is|await|None|raise|return|and|or|lambda|break|continue|from|assert|with|not|async|yield|global|del|print)\\b";
    public static final String COMMENT = "#.*(\\r|\\n|\\r\\n|$)";
    public static final String OPERATORS = "<(?!=)|\\.|>(?!=)|<=|>=|!=|\\+=|-=|/=|\\*=|(?<![<>!=+-/%&^|])=|==|!(?!=)|\\+(?!\\+)|-(?!-)|\\*|/|%|\\+\\+|--|&&|(?!&)&|~|<<|>>(?!>)|>>>";
    public static final String IDENTIFIER = "\\b[_A-Za-z][0-9A-Za-z_]*\\b";
    public static final String DELIMITER = "[(){};,\\[\\]]";
}
