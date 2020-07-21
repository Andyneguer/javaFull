import javax.swing.*;

public class Bonus {
    public static void main(String[] args) {

        String menuVerdura,menuTomate,menuRepollo,menuPapa,menuCebolla,verdura="",tipo="",resp="";
        int codigoVerdura,codigoTipo,valorSemilla=0,numeroSemilla,costoSemilla;
        boolean error;

        do {
            error=false;
            menuVerdura="TIPO VERDURAS\n\n";
            menuVerdura+="1. TOMATE\n";
            menuVerdura+="2. REPOLLO\n";
            menuVerdura+="3. PAPA\n";
            menuVerdura+="4. CEBOLLA\n\n";

            menuTomate="TIPO TOMATE\n\n";
            menuTomate+="1. TOMATE CHONTO\n";
            menuTomate+="2. TOMATE ENSALADA\n\n";

            menuRepollo="TIPO REPOLLO\n\n";
            menuRepollo+="1. REPOLLO SECO\n";
            menuRepollo+="2. REPOLLO HUMEDO\n\n";

            menuPapa="TIPO PAPA\n\n";
            menuPapa+="1. PAPA CRIOLLA\n";
            menuPapa+="2. PAPA PASTUSA\n";
            menuPapa+="3. PAPA SALENTUNA\n\n";

            menuCebolla="TIPO CEBOLLA\n\n";
            menuCebolla+="1. CEBOLLA LARGA\n";
            menuCebolla+="2. CEBOLLA DE HUEVO\n\n";

            codigoVerdura=Integer.parseInt(JOptionPane
                    .showInputDialog(menuVerdura+"Ingrese el codigo de la verdura"));

            switch (codigoVerdura){

                case 1:
                    System.out.println("|----------------------------------|");
                    System.out.println("|---------------TOMATE-------------|");
                    System.out.println("|----------------------------------|");

                    verdura="TOMATE";
                    codigoTipo=Integer.parseInt(JOptionPane
                            .showInputDialog(menuTomate+"Seleccione el tipo de Tomate"));
                    switch (codigoTipo){
                        case 1:
                            tipo="TOMATE CHONTO";
                            valorSemilla=15;
                            break;

                        case 2:
                            tipo="TOMATE ENSALADA";
                            valorSemilla=20;
                            break;
                        default:error=true;
                            System.out.println("EL VALOR NO EXISTE");
                    }

                    break;

                case 2:
                    System.out.println("|----------------------------------|");
                    System.out.println("|--------------REPOLLO-------------|");
                    System.out.println("|----------------------------------|");

                    verdura="REPOLLO";
                    codigoTipo=Integer.parseInt(JOptionPane
                            .showInputDialog(menuRepollo+"Seleccione el tipo de Repollo"));
                    switch (codigoTipo){
                        case 1:
                            tipo="REPOLLO SECO";
                            valorSemilla=5;
                            break;

                        case 2:
                            tipo="REPOLLO HUMEDO";
                            valorSemilla=10;
                            break;
                        default:error=true;
                            System.out.println("EL VALOR NO EXISTE");
                    }
                    break;

                case 3:
                    System.out.println("|----------------------------------|");
                    System.out.println("|---------------PAPA---------------|");
                    System.out.println("|----------------------------------|");

                    verdura="PAPA";
                    codigoTipo=Integer.parseInt(JOptionPane
                            .showInputDialog(menuPapa+"Seleccione el tipo de Papa"));

                    switch (codigoTipo){
                        case 1:
                            tipo="PAPA CRIOLLA";
                            valorSemilla=8;
                            break;

                        case 2:
                            tipo="PAPA PASTUSA";
                            valorSemilla=9;
                            break;

                        case 3:
                            tipo="PAPA SALENTUNA";
                            valorSemilla=11;
                            break;
                        default:error=true;
                            System.out.println("EL VALOR NO EXISTE");
                    }
                    break;

                case 4:
                    System.out.println("|----------------------------------|");
                    System.out.println("|--------------CEBOLLA-------------|");
                    System.out.println("|----------------------------------|");

                    verdura="CEBOLLA";
                    codigoTipo=Integer.parseInt(JOptionPane
                            .showInputDialog(menuCebolla+"Seleccione el tipo de Cebolla "));

                    switch (codigoTipo){
                        case 1:
                            tipo="CEBOLLA LARGA";
                            valorSemilla=15;
                            break;

                        case 2:
                            tipo="CEBOLLA DE HUEVO";
                            valorSemilla=13;
                            break;
                        default:error=true;
                            System.out.println("EL VALOR NO EXISTE");
                    }
                    break;

                default:error=true;
                    System.out.println("EL TIPO DE VERDURA NO EXISTE!!");
                    break;
            }

            if (error==false) {
                numeroSemilla = Integer.parseInt(JOptionPane
                        .showInputDialog("INGRESE LA CANTIDAD DE SEMILLA"));

                costoSemilla = numeroSemilla * valorSemilla;
                System.out.println("Verdura: " + verdura + " de tipo " + tipo + " ");
                System.out.println("Valor Semilla: "+valorSemilla);
                System.out.println("Cantidad Semilla: " + numeroSemilla);
                System.out.println("Costo Semilla: " + costoSemilla);
            }else {
                System.out.println("Error en el ingreso de datos!");
            }

                System.out.println("***********************************************************");
                System.out.println();

            resp=JOptionPane.showInputDialog("Ingrese si, si desea continuar");
        }while (resp.equalsIgnoreCase("si"));
    }
}
