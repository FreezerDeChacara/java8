import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by mabidoia on 05/05/16.
 */
public class Capitulo2 {
    public static void main(String ... args) {
        Usuario user1 = new Usuario("Mateus", 150);
        Usuario user2 = new Usuario("Lucas", 120);
        Usuario user3 = new Usuario("Marcos", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        for (Usuario u : usuarios){
            System.out.println(u.getNome());
        }

    }
}
