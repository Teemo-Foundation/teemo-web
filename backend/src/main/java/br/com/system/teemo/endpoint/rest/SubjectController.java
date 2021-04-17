package br.com.system.teemo.endpoint.rest;

import br.com.system.teemo.entity.Subject;
import br.com.system.teemo.usecase.GetSubjectByName;
import br.com.system.teemo.viewmodel.adapter.SubjectVMAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/subject", produces = MediaType.APPLICATION_JSON_VALUE)
public class SubjectController {

    @Autowired
    GetSubjectByName getSubjectByName;

    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity getSubjectByName(@PathVariable final String name){
        try {
            final Subject subject = getSubjectByName.execute(name);
            return ResponseEntity.ok().body(SubjectVMAdapter.entityToViewModel(subject));
        }catch (Exception err){
            return ResponseEntity.badRequest().body(err.getMessage());
        }
    }

}
