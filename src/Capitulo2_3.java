import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by mabidoia on 05/05/16.
 */
public class Capitulo2_3 {
    public static void main(String ... args) {
        Usuario user1 = new Usuario("Lucas", 150);
        Usuario user2 = new Usuario("Marcos", 120);
        Usuario user3 = new Usuario("João", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        usuarios.forEach(u -> System.out.println(u.getNome()));

    }
}
