package sistem.absensi.sekolah.Daftar;
import java.util.Scanner;
import java.util.UUID;

abstract class Display{
    abstract void notification();
    void showToken(UUID token){
        System.out.println("token generated : "+token);
    }
}   

class User extends Display{
    Scanner scan = new Scanner(System.in);
    protected String username;
    protected String password;
    protected UUID token;
    void tokenCreation(){
        token=UUID.randomUUID();
    }
    void register(String username, String password){
        this.username= username;
        this.password= password;
        tokenCreation();
        System.out.println("Username : "+this.username);
        System.out.println("Password : "+this.password);
    }
    @Override
    void notification(){
        System.out.println("Register successfully by user");
        showToken(token);
    }
}

class Admin extends User{
    private final String role ="admin";
    @Override
    void notification(){
        System.out.println("Register successfully by "+role);
        showToken(this.token);
    }
}

class App {
    public static void main(String[] args) throws Exception {
        //connection.main(args);
        Scanner input =new Scanner(System.in);
        System.out.print("Masukkan username : ");
        String username = input.nextLine();
        System.out.print("Masukkan password : ");
        String password = input.nextLine();
        User user = new User();
        user.register(username, password);
        user.notification();
    }
}
