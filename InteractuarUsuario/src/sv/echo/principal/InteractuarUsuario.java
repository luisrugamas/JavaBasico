/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.echo.principal;

import java.util.Scanner;
import sv.echo.entidades.Usuario;
import sv.echo.utilidades.FuncionesPrincipales;

/**
 *
 * @author rgluis
 */
public class InteractuarUsuario {

    private final static String NOMBRE_DOCENTES = "Luis Rugamas | Cecibel Acosta";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciar la clase que nos permite obtener la información de teclado
        Scanner scanner = new Scanner(System.in);
        Usuario user = new Usuario();
        
        //Enviamos a consola la información al usuario para que digite su nombre
        do{
            System.out.println("Buen día estudiante BitLab, vamos a solicitarle sus datos");
            System.out.println("Digite su Nombre:");
            user.setNombre(scanner.nextLine());
        }while(!NOMBRE_DOCENTES.contains(user.getNombre()));
            
            System.out.println("Digite su Edad:");
            user.setEdad(scanner.nextInt());
            
            System.out.println("Digite su Ocupación:");
            user.setOcupacion(scanner.next());
            
            System.out.println("Bienvenido " + user.getOcupacion() + " " + user.getNombre());
            System.out.println("Basados en su edad uste es un " + user.getCaracteristicaBasadaEnEdad());
            System.out.println("Que operación desea realizar Digite:");
            System.out.println("P. Ingresas a juego de preguntas");
            System.out.println("S. Salir de sistema Prueba Git");
            char opcion = scanner.next().charAt(0);
            
            switch(opcion){
                case 'P': 
                    short n1 = FuncionesPrincipales.getNumeroAleatorio();
                    short n2 = FuncionesPrincipales.getNumeroAleatorio();
                    System.out.println("Cuanto es "+ n1 +"+"+ n2 + ":");
                    int suma = scanner.nextInt();

                    if((n1+n2)==suma){
                        System.out.println("Usted Respondio exitosamente");
                    }else{
                        System.out.println("Cuanto es "+ n1 +"-"+ n2 + ":");
                        int resta = scanner.nextInt();

                        if((n1-n2)==resta){
                            System.out.println("Usted Respondio exitosamente");
                        }else{

                            System.out.println("Cuanto es "+ n1 +"*"+ n2 + ":");
                            int multiplicacion = scanner.nextInt();

                            if((n1*n2)==multiplicacion){
                                System.out.println("Usted Respondio exitosamente");
                            }else{
                                System.out.println("No ha completado ninguna de las operaciones");
                            }
                        }
                    }
                    System.out.println("Reconfirmamos su autorización para estar aqui");
                    break;
                case 'S':
                    System.out.println("Se ha desconectado de la plataforma");
                    System.exit(0);
                default:
                    System.out.println("No se ha seleccionado una opción valida, saldra del sistema");
                    System.exit(0);
            }
            
        
        
        
    }
    
}
