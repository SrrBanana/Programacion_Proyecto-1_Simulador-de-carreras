package main;

import controller.CarreraController;
import controller.CocheController;
import model.Carrera;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            CocheController controllerCoche = new CocheController();
            boolean cerrar = false;

            do {

                System.out.println("\nSimulador de Carreras");
                System.out.println("1. Gestor de coches\n2. Carera normal\n3. Capeonato\n4. Salir");

                int opc = scanner.nextInt();

                switch (opc){

                    case 1:

                        System.out.println("1. Crear Coches\n2. Visualizar Datos");

                        int opc1 = scanner.nextInt();

                        switch (opc1){
                            case 1:
                                System.out.println("¿Cuantos coches quieres crear?");
                                int cantidad = scanner.nextInt();
                                scanner.nextLine();
                                if (cantidad > 0){
                                    for (int i = 0; i < cantidad; i++) {
                                        System.out.println("\nCoche Nº " + (controllerCoche.cantidadCoches()+1) );

                                        System.out.println("Marca del Coche:");
                                        String marca = scanner.nextLine();

                                        System.out.println("Modelo del Coche:");
                                        String modelo = scanner.nextLine();

                                        controllerCoche.crearCoche(marca, modelo);
                                    }
                                    System.out.println("Coches Creados: ");
                                    controllerCoche.listarCoches1();
                                }else {
                                    System.out.println("\nValor Erroneo!!!\n");
                                }

                                break;
                            case 2:
                               if (controllerCoche.cantidadCoches() > 0){
                                   controllerCoche.listarCoches2();
                               }else {
                                   System.out.println("\nNingun coche creado\n");
                               }
                                break;
                            default:
                                System.out.println("\nValor Erroneo!!!\n");
                                break;
                        }
                        break;
                    case 2:
                        if (controllerCoche.cantidadCoches() > 0) {
                            System.out.println("Introduce los Km totales del circuito");
                            int totalKm = scanner.nextInt();
                            Carrera carrera = new Carrera(totalKm);

                            for (int i = 0; i < controllerCoche.cantidadCoches(); i++) {
                                carrera.addCoche(controllerCoche.getCoche(i));
                            }

                            CarreraController carreraController = new CarreraController(carrera);
                            carreraController.empezarCarrera();

                            carreraController.verResultadosKm();
                        }else {
                            System.out.println("Debes crear los coches para comenzar la carrera");
                        }
                        break;
                    case 3:
                        if (controllerCoche.cantidadCoches() > 0) {
                            controllerCoche.resetPuntos();

                            System.out.println("Numero de Carreras");
                            int nCarreras = scanner.nextInt();

                            System.out.println("Introduce los Km totales del circuito");
                            int totalKm = scanner.nextInt();
                            boolean noNo = false;

                            for (int i = 0; i < nCarreras; i++) {

                                Carrera carrera = new Carrera(totalKm);

                                for (int j = 0; j < controllerCoche.cantidadCoches(); j++) {
                                    carrera.addCoche(controllerCoche.getCoche(j));
                                }
                                CarreraController carreraController = new CarreraController(carrera);
                                carreraController.empezarCarrera();
                                carreraController.addPuntos();

                                if (!(i == nCarreras-1) && !noNo){
                                    System.out.println("¿Ver Clasificacion Temporal?");
                                    System.out.println("1. Si\n2. No\n3. No volver a mostrar");
                                    int opc2 = scanner.nextInt();
                                    switch (opc2){
                                        case 1:
                                            carreraController.verResultadoPuntos();
                                            break;
                                        case 2:
                                            System.out.println("Siguiente Carrera");
                                            break;
                                        case 3:
                                            noNo = true;
                                            break;
                                    }
                                }   else if((i == nCarreras-1)){
                                    carreraController.verResultadoPuntos();
                                }
                                System.out.println("Carrera Nº" + (i+1) + " Terminada");
                            }
                        }else {
                            System.out.println("\nDebes crear los coches para comenzar la carrera\n");
                        }
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        cerrar = true;
                        break;
                    default:
                        System.out.println("\nValor Erroneo!!!\n");
                        break;
                }
            }while (!cerrar);
        }
}