import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by mabidoia on 05/05/16.
 */
public class Capitulo2_1 {
    public static void main(String ... args) {
        Usuario user1 = new Usuario("Mateus", 150);
        Usuario user2 = new Usuario("Lucas", 120);
        Usuario user3 = new Usuario("João", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        Consumer<Usuario> mostrador = new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        };

        usuarios.forEach(mostrador);
    }
}
