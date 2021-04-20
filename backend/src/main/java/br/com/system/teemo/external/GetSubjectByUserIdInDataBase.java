package br.com.system.teemo.external;

import br.com.system.teemo.entity.UserSubject;
import br.com.system.teemo.external.database.entity.SubjectModel;
import br.com.system.teemo.external.database.entity.UsersSubjectModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GetSubjectByUserIdInDataBase {
    List<UserSubject> execute(Long id);
}
