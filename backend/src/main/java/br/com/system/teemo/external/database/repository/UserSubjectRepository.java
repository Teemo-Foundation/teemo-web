package br.com.system.teemo.external.database.repository;

import br.com.system.teemo.external.database.entity.UsersSubjectModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserSubjectRepository extends JpaRepository<UsersSubjectModel, Long> {
    List<UsersSubjectModel> findSubjectByUserIdFk(Long id);
}
