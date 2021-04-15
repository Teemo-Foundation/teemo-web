package br.com.system.teemo.usecase;

import br.com.system.teemo.entity.User;
import br.com.system.teemo.external.database.GetUserByEmailInDataBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailDoesNotExists {

    @Autowired
    GetUserByEmailInDataBaseImpl getUserByEmailInDataBase;

    public boolean execute(User user) {
        return getUserByEmailInDataBase.execute(user.getEmail()) == null;
    }
}
