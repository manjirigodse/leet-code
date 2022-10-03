package hotstar;



public class Test {
    public static void main(String[] args) {
        String a = "Hi Welcome to hotstar";

        char[] chars = a.toCharArray();
        int i = 0;
        int j = a.length() -1;

        while(i<j) {
            if(chars[i] == ' ' ) {
                i++;
            }
            if(chars[j] == ' ') {
                j--;
            }

            char c = chars[j];
            chars[j] = chars[i];
            chars[i] = c;

            i++; j--;
        }

        System.out.println(new java.lang.String(chars));
    }
}


/// for(int i = a.length()-1 ; i >= 0; i--) {
//
//
//            if (a.charAt(a.length() - i) == ' ') {
//                reverse = reverse + a.charAt(i);
//                index ++;
//            } else {
//                if (index != 0){
//                    reverse = reverse + a.charAt(i+ index);
//                } else {
//                    reverse = reverse + a.charAt(i);
//                }
//            }
//            if (a.charAt(i) == ' ' && index > 0) {
//                index --;
//            }
//        }