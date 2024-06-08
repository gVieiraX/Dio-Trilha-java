package dio.singleton_or_prototype;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SingletonOrPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonOrPrototypeApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(SistemaMenssagem sistema) throws  Exception{
		return  args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMenssagemBoasVindas();
			sistema.enviarConfirmacaoCadastro();
		};
	}

}
