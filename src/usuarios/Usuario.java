package usuarios;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuario {
    
    private String user;
    private String password;
    
    public Usuario(String user, String password){
    
        this.user = user;
        this.password = password;
    
    }
    
    public String getUser(){ return this.user;}
    
    private String getPassword(){
    
        return this.password;
        
    }
    
    public boolean checkPassword(String pass){
        
        return this.password.equals(pass);
              
    }
    
    public boolean changePassword(String pass, String newpass){
    
        if(!checkPassword(pass))
            return false;
        
        this.password = newpass;
        
        return true;
    
    }
 
    public void changeUser(String pass, String newUser){
        
        if(!checkPassword(pass))
            return;
        
        this.user = newUser;
    
    }
    
    public static Usuario[] fill(){
        
        File input = new File("src/usuarios/input.txt");
        
        BufferedReader inputReader;
        try {
            inputReader = new BufferedReader(new FileReader(input));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        String line = "-1";
        int cant;
        
        try {
            line = inputReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cant = Integer.parseInt(line);
        
        Usuario dbase[] = new Usuario[cant + 10];
        
        String defaultpass = "pass";
        String user = "default";
            
        for(int i = 0; i < cant; i++){
            
            try {
                user = inputReader.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            dbase[i] = new Usuario(user, defaultpass);
            
        
        }
        
        try {
            line = inputReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String password = defaultpass;
        
        for(int i = 0; i < cant; i++){
        
            try {
                password = inputReader.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            dbase[i].changePassword(defaultpass, password);
            
            if(defaultpass.equals(password)){
                
                System.out.println("Error para contraseña de usuario: " + dbase[i].getUser());
            
            }
        }
        
        try {
            inputReader.close();
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dbase;
        
    }
    
    public static void pour(Usuario[] dbase){
        
        File output = new File("src/usuarios/input.txt");
        
        BufferedWriter outputWriter = null;
        
        try {
             outputWriter = new BufferedWriter(new FileWriter(output));
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int cont = 0;
        
        for(int i = 0; i < dbase.length; i++){
            
            if(dbase[i] != null){
                
                cont++;
            
            }
        
        }
        
        String cant = String.valueOf(cont);
        
        try {
            outputWriter.write(cant+"\n");
            outputWriter.flush();
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        int n = dbase.length;
        Usuario user;
        
        for(int i = 0; i < dbase.length; i++){
        
            user = dbase[i];
            
            if(user != null){
                
                try {
                    outputWriter.write(user.getUser() + "\n");
                    outputWriter.flush();
                } catch (IOException ex) {
                    Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
        
        }
        
        try {
            outputWriter.write("\n");
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i = 0; i < dbase.length; i++){
        
            user = dbase[i];
            
            if(user != null){
                
                try {
                    outputWriter.write(user.getPassword() + "\n");
                    outputWriter.flush();
                } catch (IOException ex) {
                    Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
        
        }
        
        try {
            outputWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
     public static void main(String [] args) {
         
       Usuario[] dbase = fill();
       
       pour(dbase);
       
        
        
    }
    
 
    
}

