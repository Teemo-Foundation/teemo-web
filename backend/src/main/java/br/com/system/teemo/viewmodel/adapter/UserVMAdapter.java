package br.com.system.teemo.viewmodel.adapter;

import br.com.system.teemo.entity.User;
import br.com.system.teemo.viewmodel.UserVM;

public class UserVMAdapter {

    public static UserVM entityToViewModel(final User entity){
        final UserVM viewModel = new UserVM();
        viewModel.setId(entity.getId());
        viewModel.setName(entity.getName());
        viewModel.setEmail(entity.getEmail());
        viewModel.setPassword(entity.getPassword());
        viewModel.setInstitution(entity.getInstitution());

        return viewModel;
    }

    public static User viewModelToEntity(final UserVM viewModel){
        final User entity = new User();
        entity.setId(viewModel.getId());
        entity.setEmail(viewModel.getEmail());
        entity.setPassword(viewModel.getPassword());
        entity.setName(viewModel.getName());
        entity.setInstitution(viewModel.getInstitution());

        return entity;
    }
}
