package br.com.system.teemo.external.database;

import br.com.system.teemo.entity.UserSubject;
import br.com.system.teemo.external.GetSubjectByUserIdInDataBase;
import br.com.system.teemo.external.database.entity.UsersSubjectModel;
import br.com.system.teemo.external.database.entity.adapter.UsersSubjectModelAdapter;
import br.com.system.teemo.external.database.repository.UserSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetUserSubjectInDataBaseImpl implements GetSubjectByUserIdInDataBase{

    @Autowired
    private UserSubjectRepository userSubjectRepository;


    @Override
    public List<UserSubject> execute(Long id) {
        List<UsersSubjectModel> usersSubjectModelList = userSubjectRepository.findSubjectByUserId(id);
        return UsersSubjectModelAdapter.modelToEntity(usersSubjectModelList);
    }
}
