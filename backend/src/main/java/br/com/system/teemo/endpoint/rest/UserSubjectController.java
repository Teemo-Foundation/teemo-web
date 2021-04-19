package br.com.system.teemo.endpoint.rest;

import br.com.system.teemo.entity.User;
import br.com.system.teemo.entity.UserSubject;
import br.com.system.teemo.usecase.GetUserByName;
import br.com.system.teemo.usecase.GetUserSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user-subject", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserSubjectController {

    @Autowired
    private GetUserSubject getUserSubject;

    @Autowired
    private GetUserByName getUserByName;

    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getUserSubject(@PathVariable final String name){
        try {
            final User user = getUserByName.execute(name);
            final List<UserSubject> userSubject = getUserSubject.execute(1L);
            return ResponseEntity.ok().body(userSubject);
        }catch (Exception err){
            return ResponseEntity.badRequest().body(err.getMessage());
        }
    }
}
