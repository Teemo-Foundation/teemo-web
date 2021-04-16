package br.com.system.teemo.external.database;

import br.com.system.teemo.entity.User;
import br.com.system.teemo.external.GetUserByEmailInDataBase;
import br.com.system.teemo.external.database.entity.UsersModel;
import br.com.system.teemo.external.database.entity.adapter.UserModelAdapter;
import br.com.system.teemo.external.database.repository.UserEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUserByEmailInDataBaseImpl implements GetUserByEmailInDataBase {

    @Autowired
    private UserEmailRepository userEmailRepository;

    @Override
    public User execute(String email) {
        UsersModel userModel = userEmailRepository.findUserByEmail(email);
        if(userModel == null) return null;
        return UserModelAdapter.modelToEntity(userModel);
    }
}
