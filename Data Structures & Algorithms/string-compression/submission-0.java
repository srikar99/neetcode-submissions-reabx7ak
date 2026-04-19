class Solution {
    public int compress(char[] chars) {
        char current = chars[0];

        int currentCount = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == current) {
                currentCount++;
            } else {
                if(currentCount == 1) {
                    sb.append(current);
                } else if(currentCount > 9) {

                    sb.append(current);
                    StringBuilder sb1 = new StringBuilder();
                    while(currentCount > 0) {
                        int mod = currentCount % 10;
                        sb1.append(mod);
                        currentCount /= 10;
                    }

                    sb.append(sb1.reverse());
                } else {
                    sb.append(current);
                    sb.append(currentCount);
                }

                currentCount = 0;
                current = chars[i];
            }
        }
        
        if(currentCount >= 0) {
            char c = chars[chars.length - 1];
            if(currentCount == 1 || currentCount == 0) {
                sb.append(c);
            } else if(currentCount > 9) {
                sb.append(c);
                StringBuilder sb1 = new StringBuilder();
                while(currentCount > 0) {
                    int mod = currentCount % 10;
                    sb1.append(mod);
                    currentCount /= 10;
                }

                sb.append(sb1.reverse());
            } else {
                sb.append(c);
                sb.append(currentCount);
            }
        }

        int i = 0;

        for(char c : sb.toString().toCharArray()) {
            System.out.println(c);
            chars[i] = c;
            i++;
        }

        return sb.toString().length();
    }
}