package br.com.system.teemo.endpoint.rest;

import br.com.system.teemo.entity.User;
import br.com.system.teemo.usecase.creation.CreateUser;
import br.com.system.teemo.usecase.GetUserByName;
import br.com.system.teemo.viewmodel.UserVM;
import br.com.system.teemo.viewmodel.adapter.UserVMAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    private GetUserByName getUserByName;

    @Autowired
    private CreateUser createUser;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getUserByName(@PathVariable final String name){
        try {
            final User user = getUserByName.execute(name);
            return ResponseEntity.ok().body(UserVMAdapter.entityToViewModel(user));
        }catch (Exception err){
            return ResponseEntity.badRequest().body(err.getMessage());
        }
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UserVM> createUser(@RequestBody final UserVM userVM){
        try {
            final User user = createUser.execute(UserVMAdapter.viewModelToEntity(userVM));
            final UserVM result = UserVMAdapter.entityToViewModel(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(result);
        }catch (Exception err){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(userVM);
        }
    }
}
