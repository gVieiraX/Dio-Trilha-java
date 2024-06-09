package dio.my_first_web_api.Controller;

import dio.my_first_web_api.Model.User;
import dio.my_first_web_api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping("/users")
    public List<User> getUsers(){
            return repository.findAll();
    }

    @GetMapping("/users/{username}")
    public User getOne (@PathVariable("username") String username){
        return  repository.findByUsername(username);
    }
    @DeleteMapping("/users/{id}")
    public  void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
@PostMapping("/users")
    public void postUser(@RequestBody User user){
        repository.save(user);
    }

    @PutMapping()
    public void putUser(@RequestBody User user){
        repository.save(user);
    }
}
