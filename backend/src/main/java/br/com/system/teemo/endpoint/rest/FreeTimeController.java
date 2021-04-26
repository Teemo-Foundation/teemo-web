package br.com.system.teemo.endpoint.rest;

import br.com.system.teemo.entity.FreeTime;
import br.com.system.teemo.usecase.creation.CreateFreeTime;
import br.com.system.teemo.viewmodel.FreeTimeVM;
import br.com.system.teemo.viewmodel.adapter.FreeTimeVMAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/free-time", produces = MediaType.APPLICATION_JSON_VALUE)
public class FreeTimeController {

    @Autowired
    private CreateFreeTime createFreeTime;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<FreeTimeVM> createFreeTime(@RequestBody final FreeTimeVM freeTimeVM){
        try {
            final FreeTime freeTime = createFreeTime.execute(FreeTimeVMAdapter.viewModelToEntity(freeTimeVM));
            final FreeTimeVM result = FreeTimeVMAdapter.entityToViewModel(freeTime);
            return ResponseEntity.status(HttpStatus.CREATED).body(result);
        }catch(Exception err){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(freeTimeVM);
        }
    }

}
