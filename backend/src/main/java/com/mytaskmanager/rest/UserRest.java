package com.mytaskmanager.rest;




import com.mytaskmanager.pojo.User;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RestController
@RequestMapping("/user")
public interface UserRest {



    @GetMapping("/login")
    public String submit();
    @GetMapping("/{id}")
    public ResponseEntity getUserById(@PathVariable Long id);

    //public String LogIn(User user);

    @PostMapping()
    public ResponseEntity insert(@Valid @RequestBody User user);

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id);




    
}
