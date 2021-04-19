package br.com.system.teemo.external.database.entity.adapter;

import br.com.system.teemo.entity.UserSubject;
import br.com.system.teemo.external.database.entity.UsersSubjectModel;

import java.util.ArrayList;
import java.util.List;

public class UsersSubjectModelAdapter {
    public static List<UserSubject> modelToEntity (final List<UsersSubjectModel> modelList){

        List<UserSubject> userSubjectList = new ArrayList<>();

        for(UsersSubjectModel item : modelList) {
            final UserSubject entity = new UserSubject();
            entity.setId(item.getId());
            entity.setDificulty(item.getDificulty());
            entity.setSubjectIdFk(SubjectModelAdapter.modelToEntity(item.getSubjectIdFk()));
            entity.setUserIdFk(UserModelAdapter.modelToEntity(item.getUserIdFk()));
        }
        return userSubjectList;
    }

    public static UsersSubjectModel entityToModel (final UserSubject entity){
        final UsersSubjectModel model = new UsersSubjectModel();
        model.setId(entity.getId());
        model.setDificulty(entity.getDificulty());
        model.setSubjectIdFk(SubjectModelAdapter.entityToModel(entity.getSubjectIdFk()));
        model.setUserIdFk(UserModelAdapter.entityToModel(entity.getUserIdFk()));

        return model;
    }
}

