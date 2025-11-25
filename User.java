package EcommerceApp;

public class User {
    protected String username;
    protected String password;

    public User (String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public boolean checkPass(String inputPasswrord){
        return password.equals(inputPasswrord);
    }

}
