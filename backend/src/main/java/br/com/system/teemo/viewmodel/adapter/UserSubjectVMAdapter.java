package br.com.system.teemo.viewmodel.adapter;

import br.com.system.teemo.entity.UserSubject;
import br.com.system.teemo.viewmodel.UserSubjectVM;

import java.util.ArrayList;
import java.util.List;

public class UserSubjectVMAdapter {

    public static List<UserSubjectVM> entityToViewModel (final List<UserSubject> entity){
        final List<UserSubjectVM> userSubjectVM = new ArrayList();

        for ( UserSubject item : entity){
            final UserSubjectVM viewModel = new UserSubjectVM();
            viewModel.setId(item.getId());
            viewModel.setDificulty(item.getDificulty());
            viewModel.setSubjectVM(SubjectVMAdapter.entityToViewModel(item.getSubject()));
            viewModel.setUserVM(UserVMAdapter.entityToViewModel(item.getUser()));

            userSubjectVM.add(viewModel);
        }

        return userSubjectVM;

    }
//
//    public static UserSubject viewModelToEntity (final List<UserSubjectVM> viewModel) {
//
//    }

}
