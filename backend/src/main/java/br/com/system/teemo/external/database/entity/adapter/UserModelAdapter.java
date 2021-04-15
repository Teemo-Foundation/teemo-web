package br.com.system.teemo.external.database.entity.adapter;

import br.com.system.teemo.entity.User;
import br.com.system.teemo.external.database.entity.UserModel;

public class UserModelAdapter {

    public static User modelToEntity (final UserModel model){
        final User entity = new User();
        entity.setId(model.getId());
        entity.setEmail(model.getEmail());
        entity.setName(model.getName());
        entity.setPassword(model.getPassword());
        entity.setInstitution(model.getInstitution());

        return entity;
    }

    public static UserModel entityToModel (final User entity){
        final UserModel model = new UserModel();
        model.setId(entity.getId());
        model.setEmail(entity.getEmail());
        model.setName(entity.getName());
        model.setPassword(entity.getPassword());
        model.setInstitution(entity.getInstitution());

        return model;
    }
}
