package br.com.system.teemo.external.database;

import br.com.system.teemo.entity.User;
import br.com.system.teemo.external.GetUserByNameInDataBase;
import br.com.system.teemo.external.database.entity.UsersModel;
import br.com.system.teemo.external.database.entity.adapter.UserModelAdapter;
import br.com.system.teemo.external.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetUserByNameInDataBaseImpl implements GetUserByNameInDataBase {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User execute(String name) {
        UsersModel user = userRepository.findUserByName(name);
        return UserModelAdapter.modelToEntity(user);
    }
}
