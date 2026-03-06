package start;

import java.util.Scanner;
import constructor.Banco;

public class Main {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Banco cliente = new Banco("", 0, 0, false);

        boolean activo = true;
        while (activo) {
            System.out.println("+---------------------+\n" +
                               "|         MENU        |\n" +
                               "+---------------------+\n" +
                               "| 0) Crear cuenta     |\n" +
                               "| 1) Depositar dinero |\n" +
                               "| 2) Retirar dinero   |\n" +
                               "| 3) ver saldo        |\n" +
                               "| 4) Salir            |\n" +
                               "+---------------------+");
            System.out.println("Ingrese su opcion: ");
            int Menu = Teclado.nextInt();

            switch (Menu) {
                case 0:
                    System.out.println("* Bienvenido a la creacion de su cuenta bancaria*");
                    System.out.println("Ingrese su nombre: ");
                    Teclado.nextLine();
                    String nombreCliente = Teclado.nextLine();

                    System.out.println("Ingrese su cedula: ");
                    int ccCliente = 0;

                    while (true){
                        if (Teclado.hasNextInt()){
                            ccCliente = Teclado.nextInt();

                            if (ccCliente > 0){
                                break;
                            } else {
                                System.out.println("* Este valor no es valido *");
                                System.out.println("Ingrese su cedula correctamente: ");
                            }

                        } else {
                            System.out.println("* Ingrese solo numeros *");
                            System.out.println("Ingrese su cedula correctamente: ");
                            Teclado.next();
                        }
                    }

                    System.out.println("Ingrese su saldo inicial: ");
                    float saldoCliente = 0;

                    while (true){
                        if (Teclado.hasNextFloat()){
                            saldoCliente = Teclado.nextFloat();

                            if (saldoCliente > 0){
                                break;
                            } else {
                                System.out.println("* Este valor no es valido *");
                                System.out.println("Ingrese su cedula correctamente: ");
                            }

                        } else {
                            System.out.println("* Ingrese solo numeros *");
                            System.out.println("Ingrese su cedula correctamente: ");
                            Teclado.next();
                        }
                    }

                    cliente = new Banco(nombreCliente, ccCliente, saldoCliente, true);
                    System.out.println("* Felicidades " +cliente.getNombre()+ " tu cuenta se a creado con exito *");

                    System.out.println(cliente.getNombre()+"|"+cliente.getCc()+"|"+cliente.getSaldo());
                    break;

                case 1:
                    if (cliente.cuenta) {
                        System.out.println("Ingrese el valor que quiere depositar: ");
                        saldoCliente = 0;

                        while (true){
                            if (Teclado.hasNextInt()){
                                saldoCliente = Teclado.nextFloat();

                                if (saldoCliente > 0){
                                    break;
                                } else {
                                    System.out.println("* Este valor no es valido *");
                                    System.out.println("Ingrese su cedula correctamente: ");
                                }

                            } else {
                                System.out.println("* Ingrese solo numeros *");
                                System.out.println("Ingrese su cedula correctamente: ");
                                Teclado.next();
                            }
                        }

                        cliente.setSaldo(cliente.getSaldo() + saldoCliente);

                        System.out.println(cliente.getNombre()+"|"+cliente.getCc()+"|"+cliente.getSaldo());
                        break;

                    } else {
                        System.out.println("* Cree una cuenta antes de usar esta opcion *");
                    }
                    break;

                case 2:
                    if (cliente.cuenta) {
                        System.out.println("Ingrese el valor que quiere retirar: ");
                        saldoCliente = 0;

                        while (true){
                            if (Teclado.hasNextInt()){
                                saldoCliente = Teclado.nextFloat();

                                if (saldoCliente > 0 || saldoCliente > cliente.getSaldo()){
                                    break;
                                } else {
                                    System.out.println("* Este valor no es valido *");
                                    System.out.println("Ingrese su cedula correctamente: ");
                                }

                            } else {
                                System.out.println("* Ingrese solo numeros *");
                                System.out.println("Ingrese su cedula correctamente: ");
                                Teclado.next();
                            }
                        }

                        cliente.setSaldo(cliente.getSaldo() - saldoCliente);

                        System.out.println(cliente.getNombre()+"|"+cliente.getCc()+"|"+cliente.getSaldo());
                        break;

                    } else {
                        System.out.println("* Cree una cuenta antes de usar esta opcion *");
                    }
                    break;

                case 3:
                    if (cliente.cuenta) {
                        System.out.println("|   Saldo en cuenta   |  " + cliente.getSaldo() + "  |");
                    } else {
                        System.out.println("* Cree una cuenta antes de usar esta opcion *");
                    }
                    break;

                case 4:
                    System.out.println("* Gracias por usar este porgrama *");
                    activo = false;
                    break;

                default :
                    while (true){
                        if (Teclado.hasNextInt()){
                            System.out.println("* Esta opcion no existe *");
                            break;
                        } else {
                            System.out.println("* Ingrese solo numeros *");
                            System.out.println("Ingrese la opcion correcta: ");
                            Teclado.next();
                        }
                    }
            }
        }
    }
}

