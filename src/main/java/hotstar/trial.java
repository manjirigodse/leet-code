package hotstar;

import java.util.HashSet;
import java.util.Set;

public class trial {

    private static class Tuple {
       int a, b;

        public Tuple(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object obj) {
            Tuple t = (Tuple) obj;
            return t.a == this.a || t.a == b;
        }

        @Override
        public String toString() {
            return "{" + a +
                    ", " + b +
                    '}';
        }
    }

    public static void main(String[] args) {
        int a = 8;
        int[] array = {-1,4,8,6,5,4,2,0,3,9,37,7};
        Set<Tuple> set = new HashSet<>();

        for (int i = 0; i<= array.length -1 ; i++){
            for (int j = i+1; j<= array.length -1 ; j++){
                if (array[i] + array[j] == a) {
                    set.add(new Tuple(array[i], array[j]));
                }
            }
        }

        System.out.println(set);
    }


}
