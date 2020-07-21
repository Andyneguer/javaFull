public class OperadoresUnarios {
    //Exercise # 16 ----
    public static void main(String[] args) {
        //operadores unarios
        int a = 3;
        int b = -a;
        System.out.println("b = " + b);

        boolean c=true;
        boolean d=!c;
        System.out.println("d = " + d);

        int e = 3;
        int f = e++;// post incremento
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        int g = 3;
        int h = ++g;// Pre incremento
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        int i = 3;
        int j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        int k = 3;
        int l = --k;
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
