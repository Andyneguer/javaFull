public class PalabrasBreakContinue {
    //Exercise #27---- Udemy palabras BREAK Y/O CONTINUE
    public static void main(String[] args) {

        for (int i = 0; i<3 ; i++) {
            if (i % 2 != 0)
                continue;
                System.out.println("i = " + i);
                //break;
        }
    }
}
