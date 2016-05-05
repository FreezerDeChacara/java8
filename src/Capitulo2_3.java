import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by mabidoia on 05/05/16.
 */
public class Capitulo2_3 {
    public static void main(String ... args) {
        Usuario user1 = new Usuario("Lucas", 150);
        Usuario user2 = new Usuario("Marcos", 120);
        Usuario user3 = new Usuario("Leandro", 190);
        Usuario user4 = new Usuario("Leonardo", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4);

        usuarios.stream().map(Usuario::getNome).forEach(System.out::println);
        usuarios.forEach(System.out::println);

        usuarios.stream()
                .map(Usuario::getNome)
                .filter(s -> s.startsWith("L"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Map mp =  usuarios.stream()
                .filter(usuario -> usuario.getNome().startsWith("L"))
                .collect(Collectors.groupingBy(Usuario::getPontos));

        System.out.println(mp);
    }
}
