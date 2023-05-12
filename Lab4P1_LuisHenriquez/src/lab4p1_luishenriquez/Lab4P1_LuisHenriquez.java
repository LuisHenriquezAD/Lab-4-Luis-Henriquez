
package lab4p1_luishenriquez;

import java.util.Scanner;

public class Lab4P1_LuisHenriquez {
//TENGO TODAS LAS VALIDACIONES PERO SALE UN ERROR
//STEPHANIE DIJO QUE LAS DEJARA EN COMENTARIOS
   
    public static void main(String[] args) {
        
      Scanner leer = new Scanner (System.in);
      
       Scanner leer1 = new Scanner (System.in);
      
     int Respuesta = 1;
           
        while (Respuesta == 1) {
            
          System.out.println("1. Conjuntos");
          
          System.out.println("2.Contraseña mejorada  ");
          
           System.out.println("3.Salir");
        
          System.out.println("Ingrese una opcion");
          
          int opc = leer.nextInt();
          
        switch (opc) {    
            
            case 1:
 
                 String UNION  = "";
                 String INTERSECCION = "";
                 System.out.println("Ejemplo de como escribirlo, POR FAVOR ESCRIBIR LA PRIMERA EN MAYUSCULA");
                 System.out.println("ESCRIBIR EL IGUAL PEGADO A LA MAYUSCULA Y ESPACIO Y LAS DOS {}");
                 System.out.println("A= {A,B}" );
                 System.out.println("12345678  ");
                 System.out.println();
                String A, B;//Para palabras
                        
                System.out.println("Ingrese conjunto");
         
                A = leer.next();
                
                System.out.println("Ingrese conjunto");
         
                B = leer.next();
                
             /*   
             boolean salir = true; 
                
             while (salir == true){
                 
                 
                 if (Character.isUpperCase(A.charAt(0))){
                  salir = false;
                }//fin if de la primera letra
                 else{
                     System.out.println("La primera letra tiene que ser mayuscula");
                     System.out.println();
                      System.out.println("Ingrese primer conjunto");
                        A = leer.next();
                        salir = true;
                 }// fin else
                 
                 if (Character.isUpperCase(B.charAt(0))){
                  salir = false;
                }//fin if de la primera letra
                 else{
                     System.out.println("La primera letra tiene que ser mayuscula");
                     System.out.println();
                      System.out.println("Ingrese Segundo conjunto");
                        B = leer.next();
                        salir = true;
                 }// fin else
                 
                 
                 
                 if (A.charAt(1) == '='){
                  salir = false;
                }//fin if de la segunda letra
                 else{
                     System.out.println("La Segunda letra tiene que ser un igual = = = ");
                     System.out.println();
                      System.out.println("Ingrese primer conjunto");
                        A = leer.next();
                        salir = true;
                 }// fin else
                 
                 if (B.charAt(1) == '='){
                  salir = false;
                }//fin if de la segunda letra
                 else{
                     System.out.println("La Segunda letra tiene que ser un igual = = = ");
                     System.out.println();
                      System.out.println("Ingrese Segundo conjunto");
                        B = leer.next();
                        salir = true;
                 }// fin else
                 
                 if (A.charAt(2) == '{'){
                  salir = false;
                }//fin if de la segunda letra
                 else{
                     System.out.println("La Tercera letra tiene que ser un igual { { { ");
                     System.out.println();
                      System.out.println("Ingrese primer conjunto");
                        A = leer.next();
                        salir = true;
                 }// fin else
                 
                 if (B.charAt(2) == '{'){
                  salir = false;
                }//fin if de la segunda letra
                 else{
                     System.out.println("La Tercera letra tiene que ser un igual { { { ");
                     System.out.println();
                      System.out.println("Ingrese Segundo conjunto");
                        B = leer.next();
                        salir = true;
                 }// fin else
                 
                 if (A.length()-1 == '}'){
                     salir = false;
                 }//fin if de la ultima letra
                 else {
                      System.out.println("La ultima letra tiene que ser una de estas }}} ");
                     System.out.println();
                      System.out.println("Ingrese primer conjunto");
                        A = leer.next();
                        salir = true;
                 }
                 
                 if (B.length()-1 == '}'){
                     salir = false;
                 }//fin if de la ultima letra
                 else {
                      System.out.println("La ultima letra tiene que ser una de estas }}} ");
                     System.out.println();
                      System.out.println("Ingrese Segundo conjunto");
                        B = leer.next();
                        salir = true;
                 }
                 
                 
                 
             }//fin del while de validaciones 
             */  
                 
                 System.out.println(A);  
                 System.out.println(B);
                
               
                
                for (int i = 3;i < A.length(); i = i+2){
                    if (Character.isUpperCase(A.charAt(i))){
                        System.out.println("Tienen que ser minusculas");
                        break;
                    }
                }//fin for 
                
                for (int i = 3;i < B.length(); i = i+2){
                    if (Character.isUpperCase(B.charAt(i))){
                        System.out.println("Tienen que ser minusculas");
                        break;
                    }
                }//fin for 
                
                    
                    
                    
                    
                  if (A.equals(B)){// Con el .equals podemos comparar Los conjuntos
                       System.out.println("Los conjuntos son iguales");
                        System.out.println();
                  }//Fin if de equals
                  else{
                      System.out.println("Los conjuntos no son iguales");
                       System.out.println();
                       
                       
                
            for(int i = 3; i < A.length();i++){
                        char codigo = A.charAt(i);
                            for(int a = 3; a < B.length();a++){
                                 char codigo1 = B.charAt(a);
                                 if (codigo == codigo1){
                                     if (A.charAt(i) != ',' || B.charAt(a) != ',' || A.charAt(i) != '{' || A.charAt(i) != '}' || B.charAt(a) != '{' || B.charAt(a) != '}' ){
                                       INTERSECCION += A.charAt(i);     
                                    }
                                 }
                            }
                    }//fin for
                    
                    UNION = (A+B);
             

                
                   
                       
                  System.out.println();
                  System.out.println("Unión: C = {"+ UNION +"}");
                  System.out.println("Intersección: D = {"+ INTERSECCION +"}");
                  System.out.println();     
                  }//Fin del else
                  
                  
                break;
            
                
            case 2:
                 
                break;
                              
            case 3:
                Respuesta = 2;
                    //Para salir
                break; 
                
            default:
                if (opc != 3){
                    System.out.println("ERROR OPCION INCORRECTA");
                 }
                break;
        }//Fin switch

        
    }//Fin while
    
}
    
}
