/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.estrella.iu;

/**
 *
 * @author vagui
 */
public class Operador {
    
    public static String filter(String Curp){
        Curp = Curp.toLowerCase().replace
        ("á", "a").replace
        ("é", "e").replace
        ("í", "i").replace
        ("ó", "o").replace
        ("ú", "u").replace
        (" ", "").replace
        ("!", "").replace
        ("¡", "").replace
        (",", "").replace
        (".", "");
        
        char [] caracteres = Curp.toCharArray();
        
        char Letra1= caracteres[0];
        char Letra2= caracteres[1]; 
        return Curp;
    }
    
    public static String apellido278100(String curp){
        
        
        return curp;
    }
    
}
