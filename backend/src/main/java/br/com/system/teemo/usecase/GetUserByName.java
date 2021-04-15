package br.com.system.teemo.usecase;

import br.com.system.teemo.entity.User;
import br.com.system.teemo.external.GetUserByNameInDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUserByName {

    @Autowired
    private GetUserByNameInDataBase getUserByNameInDataBase;

    public User execute(final String name){
        return getUserByNameInDataBase.execute(name);
    }
}
