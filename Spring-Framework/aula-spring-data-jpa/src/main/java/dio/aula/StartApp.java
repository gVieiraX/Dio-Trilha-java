package dio.aula;

import dio.aula.Model.User;
import dio.aula.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.findByNameContaining("Gabriel");
        for(User u: users){
            System.out.println(u);
        }
    }
    private void insertUser(){

        User user = new User();
        user.setName("Gabriel");
        user.setUsername("Vieira");
        user.setPassword("dio124");

        user.setName("Gabriel ");
        user.setUsername("gvr");
        user.setPassword("dio125");

        user.setName("Pe Rosa");
        user.setUsername("gvsr");
        user.setPassword("dio126");

        repository.save(user);


        for (User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
