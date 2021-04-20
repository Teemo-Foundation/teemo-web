package br.com.system.teemo.viewmodel.adapter;

import br.com.system.teemo.entity.Subject;
import br.com.system.teemo.viewmodel.SubjectVM;

public class SubjectVMAdapter {
    public static SubjectVM entityToViewModel(final Subject entity){
        final SubjectVM viewModel = new SubjectVM();
        viewModel.setId(entity.getId());
        viewModel.setSubjectName(entity.getSubjectName());
        viewModel.setUserVM(UserVMAdapter.entityToViewModel(entity.getUser()));

        return viewModel;
    }

    public static Subject viewModelToEntity(final SubjectVM viewModel){
        final Subject entity = new Subject();
        entity.setId(viewModel.getId());
        entity.setSubjectName(viewModel.getSubjectName());
        entity.setUser(UserVMAdapter.viewModelToEntity(viewModel.getUserVM()));


        return entity;
    }
}
