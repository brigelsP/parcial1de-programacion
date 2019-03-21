/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;
        
/**
 *
 * @author Jose Carlos
 */
public class Validar {
    private Validar(){};
    
    public static boolean email(String target){
        int size = target.length();
        char t[] = new char[size];
        
        int at = 0, count_at = 0;
        int pos_at = 0;
        for(int i = 0; i < size; i++){
            t[i] = target.charAt(i);
            if(t[i] == '@'){
                at = i;
                count_at++;
            }
                        
            if(i > at){
                
                pos_at ++;
                
            }
        }
        
        if(count_at != 1 || at == size - 1) return false;
        if(pos_at == 0) return false;
        
        for(int i = 0; i < size; i++){
            if(i == at) continue;
            if( !(Character.isLetterOrDigit(t[i]) || t[i] == '_' || t[i] == '.' || t[i] == '-') ){
                return false;
            }
        }
                
        return true;
    }
    
    public static boolean password(String target){
        
        int size = target.length();
        
        int count_number = 0;
        int count_alpha = 0;
        int count_especial = 0;
        
        for(int i = 0; i < size; i++){
            if( Character.isLetter( target.charAt(i) ) ){
                count_alpha++;
            }else if( Character.isDigit( target.charAt(i) ) ){
                count_number++;
            }else{
                count_especial++;
            }
        }
        return count_alpha != 0 && count_number != 0 && count_especial != 0;
    }
    
    public static void main(String args[]){
    
        System.out.println(email("luismarioram99"));
        System.out.println(email("luis@jsi.com"));
        System.out.println(email("caray@.com"));
                
    
    
    }
}
