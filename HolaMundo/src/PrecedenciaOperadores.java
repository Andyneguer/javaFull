public class PrecedenciaOperadores {
    // Exercise # 20 ----
    public static void main(String[] args) {
        // Precedencia de operadores
        int x = 5;
        int y = 10;
        int z = ++x + y--;//x va a tenner un valor de 6 Y tendra un valor de 10 antes de empezar

        System.out.println("x = " + x);// x = 6
        System.out.println("y = " + y);// y = 9
        System.out.println("z = " + z);// z = 16

        System.out.println("Ejemplo precedencia de operadores");
        int resultado = 4+(5*6)/3;//4+(5*6)/3 => 4+(30/3) => 4+10 => 14
        System.out.println("resultado = " + resultado);

        resultado= (4+5)*(6/3);// 9*2=18
        System.out.println("resultado = " + resultado);

        int a=2;
        int b=3;
        int respuesta=-3+(6/++a)*(4-b--)+b;
    }
}
