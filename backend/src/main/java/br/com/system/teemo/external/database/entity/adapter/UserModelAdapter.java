package br.com.system.teemo.external.database.entity.adapter;

import br.com.system.teemo.entity.User;
import br.com.system.teemo.external.database.entity.UsersModel;

public class UserModelAdapter {

    public static User modelToEntity (final UsersModel model){
        final User entity = new User();
        entity.setId(model.getId());
        entity.setEmail(model.getEmail());
        entity.setName(model.getName());
        entity.setPassword(model.getPassword());

        return entity;
    }

    public static UsersModel entityToModel (final User entity){
        final UsersModel model = new UsersModel();
        model.setId(entity.getId());
        model.setEmail(entity.getEmail());
        model.setName(entity.getName());
        model.setPassword(entity.getPassword());

        return model;
    }
}
