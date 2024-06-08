package dio.properties_value.App;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
    public class SistemaMensagem implements CommandLineRunner {
    @Value("${nome}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefone}")
    private List<Long> telefone =
            new ArrayList<>(Arrays.asList(new Long[]{31985935178L}));

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome
                + "\nE-mail:" + email
                + "\nCom telefones para contato: " + telefone);
        System.out.println("Seu cadastro foi aprovado");
    }
}
