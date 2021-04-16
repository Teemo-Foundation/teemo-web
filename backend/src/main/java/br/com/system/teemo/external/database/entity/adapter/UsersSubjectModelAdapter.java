package br.com.system.teemo.external.database.entity.adapter;

import br.com.system.teemo.entity.UserSubject;
import br.com.system.teemo.external.database.entity.UsersSubjectModel;

public class UsersSubjectModelAdapter {
    public static UserSubject modelToEntity (final UsersSubjectModel model){
        final UserSubject entity = new UserSubject();
        entity.setDificulty(model.getDificulty());
        entity.setSubjectIdFk(model.getUserIdFk());
        entity.setUserIdFk(model.getUserIdFk());

        return entity;
    }

    public static UsersSubjectModel modelToEntity (final UserSubject entity){
        final UsersSubjectModel model = new UsersSubjectModel();
        model.setDificulty(entity.getDificulty());
        model.setSubjectIdFk(entity.getUserIdFk());
        model.setUserIdFk(entity.getUserIdFk());

        return model;
    }
}
