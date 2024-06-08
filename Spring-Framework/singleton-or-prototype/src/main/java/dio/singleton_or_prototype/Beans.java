package dio.singleton_or_prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans{
    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("Criando um objeto remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Digtal Innovation One");
        return  remetente;
    }

}
