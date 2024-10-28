/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author Galicia Tequianes Ricardo Emmanuel
 */
public class POOP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nums[];
        int[] nums2 = {1,2,3,4,5};
        int[] nums3 = new int[5];
        int[] nums4;
        nums4 = new int[5];
        
        /*cualquiera de estas formas sirve para declarar un arreglo; pueden 
        tener o no tener espacio después del int*/
        
        System.out.println("#####For-Each#####");
        for(int temp : nums2){
            System.out.println("Cuenta: " + temp);
        }
        
        System.out.println("#### For ####");
        for (int i = 0; i < nums4.length; i++) {
            nums4[i] = i*10;     
        }
        
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);  
        }
  
        System.out.println("#### String ####");
        System.out.println("-----Repaso-----");
        String cadena = new String("Hola mundo"); // Canónica
        System.out.println(cadena);
        String cadena1 = "Hola mundo de forma recomendada"; // Recomendada
        System.out.println(cadena1);
        
        System.out.println("-----Ejercicio-----");
        
        String nombre = "Ricardo Emmanuel";
        String apellido = "Galicia Tequianes";
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(nombre + " " + apellido);
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);
        
        System.out.println("##### Wrapper #####");
        int a = 4;
        Integer b = new Integer(4);
        System.out.println(b);
        Integer c = 4;
        System.out.println(c);
        Integer d = a; // --> boxing
        String cadena3 = d.toString();
        String cadena4 = 4 + "";
        System.out.println(cadena3);
        System.out.println(cadena4);
       
        System.out.println("##### Colecciones ######");
        
        System.out.println("---Arraylist---");
        
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(d);
        miArrayList.add(33);
        miArrayList.add(77);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(1, 10);
        System.out.println(miArrayList.size());
        System.out.println("***");
        for (Integer temp : miArrayList) {
            System.out.println(temp);
        }
        miArrayList.add(77);
        System.out.println("***");
        for (Integer temp : miArrayList) {
            System.out.println(temp);
        }
        System.out.println("Nuevo tamaño: " + miArrayList.size());
        
        System.out.println("##### Hashtable #####");
        
        Hashtable<Integer,String> miTabla = new Hashtable<Integer,String>();
        miTabla.put(1, "uno");
        miTabla.put(55566778, "Antonio");
        miTabla.put(44778899, "Diana");
        System.out.println("Elementos en tabla: " + miTabla.size());
        
        System.out.println("##### Enumerador #####");
        Integer llave = null;
        String valor = null;
        
        Enumeration<Integer> enumeradorLlaves = miTabla.keys();
        while(enumeradorLlaves.hasMoreElements()){
            llave = enumeradorLlaves.nextElement();
            valor = miTabla.get(llave);
            System.out.println(llave + " " + valor);
            
//diccionario de 5 palabras usando hashtable. LLave es la palabra
/*agenda con 5 registros guardando el nombre de una persona, 
cumpleaños (utilizando calendar) e imprimir todos los 
elementos; cómo usar calendar*/            
        }

    System.out.println("************* Date **************");
    Date hoy = new Date();
    System.out.println(hoy);

    System.out.println("************* Calendario **************");
    Calendar calendarioHoy = Calendar.getInstance();
    System.out.println(calendarioHoy);

    System.out.println("************* Formato de date **************");
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    System.out.println(formatoFecha.format(hoy));

    System.out.println("************* Formato de calendar **************");

    String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH) + " de ";
    fechaActual += (calendarioHoy.get(Calendar.MONTH))+1 + " de ";
    fechaActual += calendarioHoy.get(Calendar.YEAR);
    System.out.println(fechaActual);
                
    System.out.println("************* Math **************");
    System.out.println(Math.PI);
    System.out.println(Math.abs(-5));
    System.out.println(Math.pow(3, 2));
    System.out.println(Math.sqrt(9));
    System.out.println(Math.max(80, 7));
    
        System.out.println("#### Diccionario ####");
        
        Hashtable<String,String> diccionario = new Hashtable<String,String>();
        diccionario.put("Abaco: ", "Instrumento que sirve para contar. Es un tablero con 10 cuerdas. En cada cuerda hay 10 bolas.");
        diccionario.put("Edema: ", "Inflamación de una parte del cuerpo que se produce por la acumulación de líquido.");
        diccionario.put("Galaxia: ", "Conjunto de estrellas, planetas, polvo interestelar, gases y partículas que giran alrededor de un centro y ocupan una parte del universo.");
        diccionario.put("Madrid: ", "Es una ciudad. Es la capital de España");
        diccionario.put("Salud: ", "Estado en el que el organismo de una persona o un animal funciona bien, sin lesiones ni enfermedades.");
        
        /*Enumeration<String> enumeraLlaves = diccionario.keys();
        while(enumeraLlaves.hasMoreElements()){
            String llaveDiccionario = enumeraLlaves.nextElement();
            String valorDiccionario = diccionario.get(llaveDiccionario);
            System.out.println(llaveDiccionario + " " + valorDiccionario); */
            
        List<String> llavesOrdenadas = new ArrayList<>(diccionario.keySet());

        Collections.sort(llavesOrdenadas);
        for (String llaves : llavesOrdenadas) {
            String valores = diccionario.get(llaves);
            System.out.println(llaves + valores);   
        }
        
        System.out.println("#### Agenda ####");
        
        Hashtable<String, Calendar> agenda = new Hashtable<>();
        
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2004, Calendar.NOVEMBER, 15);
        agenda.put("Aaron TEQUIANES", fecha1);

        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(1972, Calendar.JULY, 21);
        agenda.put("MANUEL GALICIA", fecha2);

        Calendar fecha3 = Calendar.getInstance();
        fecha3.set(1974, Calendar.APRIL, 20);
        agenda.put("LILIA TEQUIANES", fecha3);

        Calendar fecha4 = Calendar.getInstance();
        fecha4.set(2011, Calendar.MAY, 23);
        agenda.put("ADRIAN GALICIA", fecha4);

        Calendar fecha5 = Calendar.getInstance();
        fecha5.set(2005, Calendar.NOVEMBER, 28);
        agenda.put("Ricardo Emmanuel Galicia Tequianes", fecha5);
        
        Enumeration<String> nombres = agenda.keys();
        while (nombres.hasMoreElements()) {
            String nombreCumple = nombres.nextElement();
            Calendar cumple = agenda.get(nombreCumple);
            System.out.println("Nombre: " + nombreCumple + ", Cumpleaños: " 
                    + cumple.get(Calendar.DAY_OF_MONTH) + "/" 
                    + (cumple.get(Calendar.MONTH) + 1) + "/" 
                    + cumple.get(Calendar.YEAR));
        }
    }
  }
