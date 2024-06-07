public class Q3 {
    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int j = i;
                while (Character.isDigit(s.charAt(j))) {
                    j++;
                }
                int k = Integer.parseInt(s.substring(i, j));
                int open = 1;
                int close = 0;
                int l = j + 1;
                while (open != close) {
                    if (s.charAt(l) == '[') {
                        open++;
                    } else if (s.charAt(l) == ']') {
                        close++;
                    }
                    l++;
                }
                String sub = decodeString(s.substring(j + 1, l - 1));
                for (int m = 0; m < k; m++) {
                    result.append(sub);
                }
                i = l;
            } else {
                result.append(c);
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Q3 q3 = new Q3();
        String s = "3[a]2[bc]";
        String result = q3.decodeString(s);
        System.out.println(result);
    }
}
