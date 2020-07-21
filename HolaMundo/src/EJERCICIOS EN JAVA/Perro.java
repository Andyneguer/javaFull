public class Perro {
    String ojos= "los ojos cristalinos";
    String cola= "la cola entre las patas";
    boolean Hambre=true;
    void estado(){
        System.out.println("Trosky esta con"+ ojos + cola);
            if (Hambre ==true){
                System.out.println("Trosky tiene Hambre");
            }
    }
    void alimentar (){
            if (Hambre ==true){
                System.out.println("Dar de comer a Trosky");
                Hambre=false;
            }
    }
    public static void main(String[] args) {
    
        Perro Trosky=new Perro();
        Trosky.ojos="los ojos cristalinos";
        Trosky.cola="la cola entre las patas";
        Trosky.estado();
        
        System.out.println("------------------------------");
        Trosky.alimentar();
        
        System.out.println("------------------------------");
        
        Trosky.ojos="ojos alegres";
        Trosky.cola="arribay batiendo";
        
        Trosky.estado();
        
        System.out.println("------------------------------");
    }
    
}
