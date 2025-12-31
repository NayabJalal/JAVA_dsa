package string;

public class Goaaallllll {
    public static void main(String[] args) {

    }
    public String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
    }
    public String interpret2(String command) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                sb.append('o');
                i++;
            }
            else if (command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
                sb.append("al");
                i= i+ 3;
            }
            else {
                sb.append('G');
            }
        }
        return sb.toString();
    }
}
