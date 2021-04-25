package br.com.system.teemo.viewmodel.adapter;

import br.com.system.teemo.entity.FreeTime;
import br.com.system.teemo.viewmodel.FreeTimeVM;

public class FreeTimeVMAdapter {

    public static FreeTimeVM entityToViewModel(final FreeTime entity){
        final FreeTimeVM viewModel = new FreeTimeVM();
        viewModel.setId(entity.getId());
        viewModel.setDayOfWeek(entity.getDayOfWeek());
        viewModel.setFreeTimeHour(entity.getFreeTimeHour());
        viewModel.setUser(entity.getUser());

        return viewModel;
    }

    public static FreeTime viewModelToEntity(final FreeTimeVM viewModel){
        final FreeTime entity = new FreeTime();
        entity.setId(viewModel.getId());
        entity.setDayOfWeek(viewModel.getDayOfWeek());
        entity.setFreeTimeHour(viewModel.getFreeTimeHour());
        entity.setUser(viewModel.getUser());

        return entity;
    }

}
