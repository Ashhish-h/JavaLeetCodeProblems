package StringsQues;

public class GoalParserInterpretation_1678 {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < command.length();i++){
            if(command.charAt(i) == 'G'){
                str.append('G');
            } else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                str.append('o');
            } else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a' && command.charAt(i+1+1) == 'l' && command.charAt(i+1+1+1) == ')'){
                str.append("al");
            }
        }
        return str.toString();
    }
}
