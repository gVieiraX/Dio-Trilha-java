package dio.aula;

import dio.aula.Model.User;
import dio.aula.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Gabriel");
        user.setUsername("Vieira");
        user.setPassword("dio124");

        repository.save(user);


        for (User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
