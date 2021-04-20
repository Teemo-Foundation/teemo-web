package br.com.system.teemo.external.database.entity.adapter;

import br.com.system.teemo.entity.UserSubject;
import br.com.system.teemo.external.database.entity.UsersSubjectModel;

import java.util.ArrayList;
import java.util.List;

public class UsersSubjectModelAdapter {
    public static List<UserSubject> modelToEntity (final List<UsersSubjectModel> modelList){

        List<UserSubject> entityList = new ArrayList<>();

        for(UsersSubjectModel item : modelList) {
            final UserSubject entity = new UserSubject();
            entity.setId(item.getId());
            entity.setDificulty(item.getDificulty());
            entity.setSubject(SubjectModelAdapter.modelToEntity(item.getSubjectIdFk()));
            entity.setUser(UserModelAdapter.modelToEntity(item.getUserIdFk()));

            entityList.add(entity);
        }
        return entityList;
    }

    public static List<UsersSubjectModel> entityToModel (final List<UserSubject> entityList){
        List<UsersSubjectModel> modelList = new ArrayList<>();

        for (UserSubject item : entityList) {
            final UsersSubjectModel model = new UsersSubjectModel();
            model.setId(item.getId());
            model.setDificulty(item.getDificulty());
            model.setSubjectIdFk(SubjectModelAdapter.entityToModel(item.getSubject()));
            model.setUserIdFk(UserModelAdapter.entityToModel(item.getUser()));

            modelList.add(model);
        }

        return modelList;
    }
}

