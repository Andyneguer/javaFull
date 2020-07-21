public class TiposPrimitivos {
     // Exercise # 6 ----
    public static void main(String[] args) {
        //byte, short, int, long
        System.out.println("bits tipo byte: " + Byte.SIZE);
        System.out.println("bytes tipo byte: " + Byte.BYTES);
        System.out.println("valor minimo tipo byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo tipo byte: " + Byte.MAX_VALUE);
        System.out.println("*******************************************");

        System.out.println("bits tipo short: " + Short.SIZE);
        System.out.println("bytes tipo short: " + Short.BYTES);
        System.out.println("valor minimo tipo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo tipo short: " + Short.MAX_VALUE);
        System.out.println("*******************************************");

        System.out.println("bits tipo int: " + Integer.SIZE);
        System.out.println("bytes tipo int: " + Integer.BYTES);
        System.out.println("valor minimo tipo int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int: " + Integer.MAX_VALUE);
        System.out.println("*******************************************");
        //Clase asociada se conoce como Integer

        System.out.println("bits tipo long: " + Long.SIZE);
        System.out.println("bytes tipo long: " + Long.BYTES);
        System.out.println("valor minimo tipo long: " + Long.MIN_VALUE);
        System.out.println("valor maximo tipo long: " + Long.MAX_VALUE);
        System.out.println("*******************************************");

        byte byteVar = 127;
        System.out.println("byteVar es = " + byteVar);
        System.out.println("*******************************************");
        short shortVar = 100;
        System.out.println("shortVar es = " + shortVar);
        System.out.println("*******************************************");
        int intVar = 500;
        System.out.println("intVar es = " + shortVar);
        System.out.println("*******************************************");
        long longVar = 1000L;
        System.out.println("longVar es = " + longVar);
        System.out.println("*******************************************");


        /***************************************************************/
        byte b1 = 10;//Sistema Decimal
        System.out.println("b1 = " + b1);

        byte b2 = 0xa;//Sistema Hexadecimal
        System.out.println("b2 = " + b2);

        byte b3 = 012;//Sistema Octal
        System.out.println("b2 = " + b3);
        /****************************************************************/
    }
}
