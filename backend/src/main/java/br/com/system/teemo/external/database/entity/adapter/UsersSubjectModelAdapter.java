package br.com.system.teemo.external.database.entity.adapter;

import br.com.system.teemo.entity.UserSubject;
import br.com.system.teemo.external.database.entity.UsersSubjectModel;

public class UsersSubjectModelAdapter {
    public static UserSubject modelToEntity (final UsersSubjectModel model){
        final UserSubject entity = new UserSubject();
        entity.setId(model.getId());
        entity.setDificulty(model.getDificulty());
        entity.setSubjectIdFk(model.getSubjectIdFk());
        entity.setUserIdFk(model.getUserIdFk());

        return entity;
    }

    public static UsersSubjectModel modelToEntity (final UserSubject entity){
        final UsersSubjectModel model = new UsersSubjectModel();
        model.setId(entity.getId());
        model.setDificulty(entity.getDificulty());
        model.setSubjectIdFk(entity.getSubjectIdFk());
        model.setUserIdFk(entity.getUserIdFk());

        return model;
    }
}
