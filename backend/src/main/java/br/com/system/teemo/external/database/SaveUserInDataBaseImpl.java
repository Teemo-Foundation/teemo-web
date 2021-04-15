package br.com.system.teemo.external.database;

import br.com.system.teemo.entity.User;
import br.com.system.teemo.external.SaveUserInDataBase;
import br.com.system.teemo.external.database.entity.UserModel;
import br.com.system.teemo.external.database.entity.adapter.UserModelAdapter;
import br.com.system.teemo.external.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveUserInDataBaseImpl implements SaveUserInDataBase {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User execute(User user) {
        UserModel model = UserModelAdapter.entityToModel(user);
        return UserModelAdapter.modelToEntity(userRepository.save(model));
    }
}
