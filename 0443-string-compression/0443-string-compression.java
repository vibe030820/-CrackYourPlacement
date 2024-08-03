class Solution {
    public int compress(char[] chars) {
       
      int i = 0;
        int v = 0;
        int y = 1;
        char p1 = chars[i];

        while (i < chars.length) {
            if (i < chars.length - 1 && chars[i + 1] == p1) {
                y++;
                i++;
            } else {
                chars[v++] = p1;
                if (y > 1) {
                    
                    String countStr = String.valueOf(y);
                    for (char c : countStr.toCharArray()) {
                        chars[v++] = c;
                    }
                }
                y = 1;
                i++;
                if (i < chars.length) {
                    p1 = chars[i];
                }
            }
        }
        return v;
    }
}