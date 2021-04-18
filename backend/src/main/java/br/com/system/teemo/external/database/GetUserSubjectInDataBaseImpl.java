package br.com.system.teemo.external.database;

import br.com.system.teemo.entity.UserSubject;
import br.com.system.teemo.external.database.entity.SubjectModel;
import br.com.system.teemo.external.database.entity.UsersSubjectModel;
import br.com.system.teemo.external.GetSubjectByUserIdInDataBase;
import br.com.system.teemo.external.database.entity.adapter.UsersSubjectModelAdapter;
import br.com.system.teemo.external.database.repository.UserSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//TODO fazer uma lista no adapter, ou algo do tipo, para resolver este erro

@Component
public class GetUserSubjectInDataBaseImpl implements GetSubjectByUserIdInDataBase{

    @Autowired
    private UserSubjectRepository userSubjectRepository;


    @Override
    public List<UserSubject> execute(Long id) {
        List<UsersSubjectModel> usersSubjectModelList = userSubjectRepository.findSubjectByUserIdFk(id);
        return UsersSubjectModelAdapter.modelToEntity(usersSubjectModelList);
    }
}
