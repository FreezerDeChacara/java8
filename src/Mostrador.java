import java.util.function.Consumer;

/**
 * Created by mabidoia on 05/05/16.
 */
public class Mostrador implements Consumer<Usuario> {
    public void accept(Usuario u){
        System.out.println(u.getNome());
    }
}
