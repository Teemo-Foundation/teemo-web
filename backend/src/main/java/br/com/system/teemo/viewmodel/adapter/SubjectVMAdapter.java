package br.com.system.teemo.viewmodel.adapter;

import br.com.system.teemo.entity.Subject;
import br.com.system.teemo.entity.User;
import br.com.system.teemo.viewmodel.SubjectVM;
import br.com.system.teemo.viewmodel.UserVM;

public class SubjectVMAdapter {
    public static SubjectVM entityToViewModel(final Subject entity){
        final SubjectVM viewModel = new SubjectVM();
        viewModel.setId(entity.getId());
        viewModel.setSubjectName(entity.getSubjectName());
        viewModel.setUserIdFk(UserVMAdapter.entityToViewModel(entity.getUserIdFk()));

        return viewModel;
    }

    public static Subject viewModelToEntity(final SubjectVM viewModel){
        final Subject entity = new Subject();
        entity.setId(viewModel.getId());
        entity.setSubjectName(viewModel.getSubjectName());
        entity.setUserIdFk(UserVMAdapter.viewModelToEntity(viewModel.getUserIdFk()));


        return entity;
    }
}
