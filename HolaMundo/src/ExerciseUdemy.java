import java.util.Scanner;
public class ExerciseUdemy {
    /* Exercise Number # 1 ----
    public static void main(String[] args) {
        String saludos = "Hola Mundo, Adios.";
        System.out.println(saludos);
        System.out.println(saludos);
        System.out.println(saludos);

        String despedirse = "despedirse";
        System.out.println();
        System.out.println(despedirse);

    }*/

    /* Exercise Number # 2 ----
    public static void main(String[] args) {
        String usuario="Andres";
        String saludar="Hola";
        System.out.println(saludar + " " + usuario);

        // Hola, mi nombre es Andres
        System.out.println("saludar = " + saludar);
        System.out.println("Mi Nombre es" + " " + usuario);
    }*/

    /* Exercise Number # 3 ----
    public static void main(String[] args) {
        String nombre="Brillit";
        String apellido="Pabon";

        System.out.println(nombre + " " + apellido);
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + apellido);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retorno de carro: \r" + apellido);
        System.out.println("Comilla Simple: \'" + nombre + "\'");
        System.out.println("Comilla doble \"" + apellido + "\"");
        System.out.println();
        System.out.println("nombre");
    }

    /* Exercise # 4 ----
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingresa tu usuario");
        String usuario = sc.nextLine();
        System.out.println("Ingresa el saludo");
        String saludar = sc.nextLine();
       System.out.println(saludar + " " + usuario);
    }

    /* Exercise # 5 ----
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Escribe tu solucion aqui
        String titulo = sc.nextLine();
        System.out.println("El titulo del libro es: " + titulo);
        String autor = sc.nextLine();
        System.out.println("El autor del libro es: " + autor);
        System.out.println(titulo + "Fue escrito por " + autor);
    }

    /* Exercise # 6 ----
    public static void main(String[] args) {
        //byte, short, int, long
        System.out.println("bite tipo byte: " + Byte.SIZE);
        System.out.println("bytes tipo byte: " + Byte.BYTES);
        System.out.println("valor minimo tipo byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo tipo byte: " + Byte.MAX_VALUE);

        System.out.println("bite tipo short: " + Short.SIZE);
        System.out.println("bytes tipo short: " + Short.BYTES);
        System.out.println("valor minimo tipo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo tipo short: " + Short.MAX_VALUE);

        System.out.println("bite tipo int: " + Integer.SIZE);
        System.out.println("bytes tipo int: " + Integer.BYTES);
        System.out.println("valor minimo tipo int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int: " + Integer.MAX_VALUE);

        System.out.println("bite tipo long: " + Long.SIZE);
        System.out.println("bytes tipo long: " + Long.BYTES);
        System.out.println("valor minimo tipo long: " + Long.MIN_VALUE);
        System.out.println("valor maximo tipo long: " + Long.MAX_VALUE);

        byte byteVar = 127;
        System.out.println("byteVar es = " + byteVar);
        short shortVar = 100;
        System.out.println("shortVar es = " + shortVar);
        int intVar = 500;
        System.out.println("intVar es = " + shortVar);
        long longVar = 1000L;
        System.out.println("longVar es = " + longVar);
    }*/

    /* Exercise # 7 ----
    public static void main(String[] args) {

        byte b1 = 10;
        System.out.println("b1 = " + b1);

        byte b2 = 0xa;
        System.out.println("b2 = " + b2);

        byte b3 = 012;
        System.out.println("b2 = " + b3);

    }

    /* Exercise # 8 ----
    public static void main(String[] args) {
        // float, double
        System.out.println("bite tipo float: " + Float.SIZE);
        System.out.println("bytes tipo float: " + Float.BYTES);
        System.out.println("valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("valor maximo tipo float: " + Float.MAX_VALUE);
        System.out.println("\n");
        System.out.println("bite tipo double: " + Double.SIZE);
        System.out.println("bytes tipo double: " + Double.BYTES);
        System.out.println("valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("valor maximo tipo double: " + Double.MAX_VALUE);

        float floatVar= 1.05F;
        double doublevar = 1.0D;

        float floatVar2= 10.0F;
        double doublevar2 = 10.15D;


    }

    /* Exercise # 9 ----
    public static void main(String[] args) {
        // chart
        System.out.println("bite tipo chart: " + Character.SIZE);
        System.out.println("bytes maximo tipo chart: " + Character.BYTES);
        System.out.println("valor minimo tipo chart: " + Character.MIN_VALUE);
        System.out.println("valor maximo tipo chart: " + Character.MAX_VALUE);

        //char ch='@';
        //char ch='\u0032';
        char ch=30;
        System.out.println("ch" + ch);
    }

    /* Exercise # 10 ----
    public static void main(String[] args) {
        //boolean
        //System.out.println("bits tipo boolean: " + Boolean.SIZE);
        //System.out.println("bytes tipo boolean: " + Boolean.BYTES);
        System.out.println("valor minimo tipo boolean: " + Boolean.TRUE);
        System.out.println("valor maximo tipo boolean: " + Boolean.FALSE);

        boolean booleanVar = true;

        if(booleanVar) //booleanVar true
            System.out.println("La variable contiene un valor Verdadero");
        else
            System.out.println("La variable contiene un valor false");

        int edad=23;
        boolean adulto = edad >=18;
        if(adulto)
            System.out.println("Eres mayor de edad, puedes pasar");
        else
            System.out.println("Eres menor de edad, no puedes pasar");
    }

    /* Exercise # 11 ----
    public static void main(String[] args) {
        /*int edad= Integer.parseInt("20");
        System.out.println("edad = " + edad);

        double valorPi= Double.parseDouble("3.14");
        System.out.println("valorPi = " + valorPi);

        float carro= Float.parseFloat("3212315464564154564F");
        System.out.println("carro = " + carro);

     /*   char ch= "hola".charAt(2);
        System.out.println("ch = " + ch);

        Scanner sc=new Scanner(System.in);
        int eda=Integer.parseInt(sc.nextLine());
        System.out.println("edad = " + eda);

        char edaa= sc.nextLine().charAt(0);
        System.out.println("edad = " + edaa);


        String valorPiTexto = String.valueOf(valorPi);
        System.out.println("edadTexto = " + valorPiTexto);

        String valorPiTexto2 = "" + valorPiTexto2;
        System.out.println("valorPiTexto2 = " + valorPiTexto2);

        byte b = 10;
        short sh = b;

        short s2= 15;
        byte b2= (byte) (s2 + 1);

    }

    /* Exercise # 12 ----
    public static void main(String[] args) {

        Scanner scc=new Scanner(System.in);
        String nombre = scc.nextLine();
        int id=Integer.parseInt(scc.nextLine());
        double precio = Double.parseDouble(scc.nextLine());
        char simbolo = scc.nextLine().charAt(0);
        boolean envioGratuito= Boolean.parseBoolean(scc.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }

    /* Exercise # 13 ----
    public static void main(String[] args) {
        // operadores aritmeticos
        Scanner sca= new Scanner(System.in);
        int a, b, c ;
        float d,e,f;
        System.out.println("suma");
        System.out.println("Ingrese el valor de A para la suma: ");
        a=sca.nextInt();
        System.out.println("Ingrese el valor de B para la suma: ");
        b=sca.nextInt();
        c=a+b;
        System.out.println("El Resultado de la Suma es de: ");
        System.out.println("c = " + c);
        System.out.println("\n");
        System.out.println("Resta");
        System.out.println("Ingrese el valor de A para la resta: ");
        a=sca.nextInt();
        System.out.println("Ingrese el valor de B para la resta: ");
        b=sca.nextInt();
        c=a-b;
        System.out.println("El Resultado de la Resta es de: ");
        System.out.println("c = " + c);
        System.out.println("\n");
        System.out.println("Multiplicacion");
        System.out.println("Ingrese el valor de A para la multiplicacion: ");
        a=sca.nextInt();
        System.out.println("Ingrese el valor de B para la multiplicacion: ");
        b=sca.nextInt();
        c=a*b;
        System.out.println("El Resultado de la Multiplicacion es de: ");
        System.out.println("c = " + c);
        System.out.println("Ingrese el valor de D para la Division: ");
        System.out.println("\n");
        System.out.println("Division");
        d=sca.nextInt();
        System.out.println("Ingrese el valor de E para la division: ");
        e=sca.nextInt();
        f=d/e;
        System.out.println("El Resultado de la Division es de: ");
        System.out.println("f = " + f);
        if(f == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
        System.out.println("\n");
        System.out.println("Division Modulo");
        System.out.println("Ingrese el valor de D para el modulo : ");
        d=sca.nextFloat();
        System.out.println("Ingrese el valor de E para el modulo: ");
        e=sca.nextFloat();
        f=d%e;
        System.out.println("El Resultado de la Division es de: ");
        System.out.println("f = " + f);
        if(f == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
    }
    /* Exercise # 14 ----
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alto, ancho, area, perimetro;
        System.out.println("Area y Perimetro del rectangulo \n");
        System.out.println("Ingrese la altura del rectangulo");
        alto=scanner.nextInt();
        System.out.println("Ingrese el ancho del rectangulo");
        ancho=scanner.nextInt();
        System.out.println("El area del rectangulo es: ");
        area= alto*ancho;
        System.out.println("area = " + area);
        System.out.println("El perimetro del rectangulo es:");
        perimetro=(alto + ancho)*2;
        System.out.println("perimetro = " + perimetro);
        System.out.println();
    }

    /* Otra forma de hacer el ejercicio # 14
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        int alto = Integer.parseInt(scanner.nextLine());
        int ancho = Integer.parseInt(scanner.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }

    /* Exercise # 15 ----
    public static void main(String[] args) {
        //operadores de asignacion
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        int a= Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el valor de b");
        int b= Integer.parseInt(scanner.nextLine());
        a+=1;// a es = a + 1
        System.out.println("a = " + a);

        a+=3;// a es = a + 3
        System.out.println("a = " + a);

        b-=1;// b es = b - 1
        System.out.println("b = " + b);

        b-=3;// b es = b - 3
        System.out.println("b = " + b);

        a*=1;// a es = a * 1
        System.out.println("a = " + a);

        a*=3;// a es = a * 3
        System.out.println("a = " + a);

        b/=1;// b es = b / 1
        System.out.println("b = " + b);

        b/=3;// b es = b / 3
        System.out.println("b = " + b);

        a%=1;// a es = a % 1
        System.out.println("a = " + a);

        b%=3;// b es = b %3
        System.out.println("b = " + b);
    }

    /* Exercise # 16 ----
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

    }*/

    /* Exercise # 17 ----
    public static void main(String[] args) {
        // operadores relacionales y de igualdad
        int a = 3, b =2;
        boolean c = (a == b);
        System.out.println("c = " + c);

        String d = "Hola", e = "Hola";
        boolean f= d.equals(e);
        System.out.println("f = " + f);

        boolean g = (a > b);
        System.out.println("g = " + g);

        if(a % 2 != 0)
            System.out.println("Numero par");
        else
            System.out.println("Numero inpar");

        int edad = 24;
        int adulto = 18;

        if(edad >= adulto)
            System.out.println("Eres adulto");
        else
            System.out.println("Eres menor de edad");

    }*/
    /* Exercise # 18 ----
    public static void main(String[] args) {
        // operadores condicionales
        int a =10;
        int valorMin=0, valorMax=10;
        if(a>=valorMin && a<=valorMax)
            System.out.println("Dentro del Rango");
        else
            System.out.println("Fuera del rango");

        boolean vacaciones=false;
        boolean diaDescanso=false;
            if(vacaciones || diaDescanso)
                System.out.println("Puede ir al juego");
            else
                System.out.println("No puede asistir");
    }

    /* Exercise # 19 ----
    public static void main(String[] args) {
        // Operador ternario
        int numero = 10;
        String resultado = (numero % 2 == 0)  ? "Es Numero par": "Es numero Impar";
        System.out.println("resultado = " + resultado);

        /*String par=(numero % 2 == 0) ? true : false;
        if(par)
            System.out.println("Numero par");
        else
            System.out.println("numero impar");
            }

    /* Exercise Solution ------
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1= Integer.parseInt(scanner.nextLine());
        int numero2= Integer.parseInt(scanner.nextLine());
        if(numero1 >numero2)
            System.out.println("numero1 = " + numero1);
        else
            System.out.println("numero2 = " + numero2);


        /* Solucion alterna -------
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1= Integer.parseInt(scanner.nextLine());
        int numero2= Integer.parseInt(scanner.nextLine());

        System.out.println(numero1 > numero2 ? numero1 : numero2);
        ? operador ternario ? lo que esta entre el signo de interrogacion y los dos puntos : se conoce como la parte verdadera
        lo que esta despues de los dos puntos seria la parte del valor falso

    }

    /* Exercise # 20 ----
    public static void main(String[] args) {
        // Precedencia de operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--;//x va a tenner un valor de 6 Y tendra un valor de 10 antes de empezar

        System.out.println("x = " + x);// x = 6
        System.out.println("y = " + y);// y = 9
        System.out.println("z = " + z);// z = 16

        System.out.println("Ejemplo precedencia de operadores");
        var resultado = 4+5*6/3;//4+(5*6)/3 => 4+(30/3) => 4+10 => 14
        System.out.println("resultado = " + resultado);

        resultado= (4+5)*(6/3);// 9*2=18
        System.out.println("resultado = " + resultado);
    }

    /* Exercise Udemy
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int res = -3 + 6 / ++a * 4 - b-- + b;
        //Se evalua: 6 / ++a (donde 'a' se preincrementa y vale 3)
        System.out.println(6 / 3); //Imprime 2
        //Se evalua: 2 * 4
        System.out.println(2 * 4 ); //imprime 8
        //Se evalua -3 + 8
        System.out.println(-3 + 8); //imprime 5
        //Se evalua 5 - b-- (donde b primero se asigna 3, y luego se decrementa)
        System.out.println(5 - 3); //imprime 2
        //Se evalua 2 + b (teniamos pendiente un decremento de b, vale 2)
        System.out.println(2 + 2);//imprime 4,
        //System.out.println("res = " + res); //es el mismo valor que el valor final


        //Agrupando con parentesis tenemos:
        //Recordar que las expresiones se evaluan de izquierda a derecha
        //y se comienza a agrupar aplicando la precedencia de operadores
        //int res2 = ((-3 + ((6 / ++a) * 4)) - b--) + b;
        //System.out.println("res2 = " + res2);

    }
    /* Exercise de Udemy
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int res = -60 + 30 / ++a * 5 - b-- + b;
        //Se evalua: 6 / ++a (donde 'a' se preincrementa y vale 3)
        System.out.println(30 / 5); //Imprime 2
        //Se evalua: 6 * 5
        System.out.println(6 * 5); //imprime 8
        //Se evalua -60 + 30
        System.out.println(-60 + 30); //imprime 5
        //Se evalua 30 - b-- (donde b primero se asigna 3, y luego se decrementa)
        System.out.println(-30 - 7 ); //imprime 2
        //Se evalua - + b (teniamos pendiente un decremento de b, vale 2)
        System.out.println(-37 + 6);//imprime 4,
        //System.out.println("res = " + res); //es el mismo valor que el valor final


        //Agrupando con parentesis tenemos:
        //Recordar que las expresiones se evaluan de izquierda a derecha
        //y se comienza a agrupar aplicando la precedencia de operadores
        //int res2 = ((-60 + ((30 / ++a) * 5)) - b--) + b;
        //System.out.println("res2 = " + res2);

    }
    /* Exercise # 21 ----
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        var calificacion = Integer.parseInt(scanner.nextLine());

        if(calificacion >=9 && calificacion <=10)
            System.out.println("A");
        else if (calificacion >=8 && calificacion <9)
            System.out.println("B");
        else if (calificacion >=7 && calificacion <8)
            System.out.println("C");
        else if (calificacion >=6 && calificacion <7)
            System.out.println("D");
        else if (calificacion >=0 && calificacion <6)
            System.out.println("F");
        else
            System.out.println("texto = " + texto);
    }*/
        /* Exercise Udemy ----
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calificacion = Integer.parseInt(scanner.nextLine());
        //Si esta entre 9 y 10 imprimir: A
        if (calificacion >= 9 && calificacion <= 10)
            System.out.println("A");
            //Si esta entre  8 y menor a 9 imprimir: B
        else if(calificacion >= 8 && calificacion < 9)
            System.out.println("B");
            //Si esta entre 7 y menor a 8 imprimir: C
        else if(calificacion >= 7 && calificacion < 8)
            System.out.println("C");
            //Si esta entre 6 y menor a 7 imprimir: D
        else if(calificacion >= 6 && calificacion < 7)
            System.out.println("D");
            //Si esta entre 0 y menor a 6 imprimir: F
        else if(calificacion >= 0 && calificacion < 6)
            System.out.println("F");
            //Si no esta en el rago, imprimir: Valor desconocido
        else
            System.out.println("Valor desconocido");
    }

    /* Exercise # 22
    public static void main(String[] args) {
        //Sentencias de control Switch
        Scanner scanner=new Scanner(System.in);
        var nuemero=Integer.parseInt(scanner.nextLine());
        var texto="numero desconocido";

        switch (nuemero){

            case 1:
                System.out.println("numero es ;" + nuemero);
                texto="numero Uno" ;
                break;
            case 2:
                System.out.println("nuemero es = " + nuemero);
                texto="numero Dos";
                break;
            case 3:
                System.out.println("nuemero = " + nuemero);
                texto="numero Tres";
                break;
                default:
        }
        System.out.println("texto = " + texto);
    }

        /* Exercise # 23 ----
        public static void main(String[] args) {
            //Sentencias de control if else
            Scanner scanner=new Scanner(System.in);
            int mes=Integer.parseInt(scanner.nextLine());
            String estacion;

            if(mes == 1 || mes== 2 || mes==12)
                estacion = ("Invierno");
            else if(mes ==3 || mes ==4 || mes ==5)
                estacion="Primavera";
            else if(mes ==6 || mes ==7 || mes ==8)
                estacion="Verano";
            else if(mes ==9 || mes ==10 || mes ==11)
                estacion="Otoño";
            else
                estacion="Mes Incorrecto";
            System.out.println("estacion = " + estacion);

        }

    /* Exercise # 24 ----
    public static void main(String[] args) {
        // Sentencia Switch
        Scanner scanner = new Scanner(System.in);
        int mes = Integer.parseInt(scanner.nextLine());
        String estacion;

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes incorrecto";
        }
        System.out.println("estacion = " + estacion);
    } */

    /* Exercise Udemy Ciclos en JAVA*/
    public static void main(String[] args) {

    }
}



