package usuarios;
public class Usuario {
    
    private String user;
    private String password;
    
    public Usuario(String user, String password){
    
        this.user = user;
        this.password = password;
    
    }
    
    public String getUser(){ return this.user;}
    
    public boolean checkPassword(String pass){
        
        return this.password.equals(pass);
              
    }
    
    public void changePassword(String pass, String newpass){
    
        if(!checkPassword(pass))
            return;
        
        this.password = newpass;
    
    }
 
    public void changeUser(String pass, String newUser){
        
        if(!checkPassword(pass))
            return;
        
        this.user = newUser;
    
    }
    
    
    public static String defaultUser(){
    
        return "luis@ues.com";
    
    }
    
    public static String defaultPass(){
        
        return "#123Hola";
        
    }
}

