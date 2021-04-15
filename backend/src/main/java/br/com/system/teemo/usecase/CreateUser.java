package br.com.system.teemo.usecase;

import br.com.system.teemo.entity.User;
import br.com.system.teemo.external.SaveUserInDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUser {

    @Autowired
    private SaveUserInDataBase saveUserInDataBase;

    @Autowired
    private EmailDoesNotExists emailDoesNotExists;

    public User execute(final User user){
        if(emailDoesNotExists.execute(user)){
            return saveUserInDataBase.execute(user);
        }
        return null;
    }
}
