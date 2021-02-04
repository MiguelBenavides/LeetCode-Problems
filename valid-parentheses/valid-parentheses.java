class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
            case '(':
                brackets.push('(');
                break;
            case '[':
                brackets.push('[');
                break;
            case '{':
                brackets.push('{');
                break;
            case ')':
                if (!brackets.empty() && brackets.peek() == '(') {
                    brackets.pop();
                } else {
                    return false;
                }
                break;
            case ']':
                if (!brackets.empty() && brackets.peek() == '[') {
                    brackets.pop();
                } else {
                    return false;
                }
                break;
            case '}':
                if (!brackets.empty() && brackets.peek() == '{') {
                    brackets.pop();
                } else {
                    return false;
                }
                break;
            default:
                return false;
            }
        }
        if (brackets.empty()) {
            return true;
        } else {
            return false;
        }
    }
}