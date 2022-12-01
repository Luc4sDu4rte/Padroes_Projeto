import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;
    
    private static void init() {
        server = new Server();
        server.register("admin@exemplo.com", "admin_pass");
        server.register("usuario@exemplo.com", "usario_pass");

        
        Middleware middleware = Middleware.link(
            new ThrottlingMiddleware(2),
            new UserExistsMiddleware(server),
            new RoleCheckMiddleware()
        );
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        
        init();
        boolean success;
        do {
            System.out.print("Insira o email: ");
            String email = reader.readLine();
            System.out.print("Insira a senha: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}