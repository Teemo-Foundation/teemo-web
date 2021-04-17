package br.com.system.teemo.external.database.repository;

import br.com.system.teemo.external.database.entity.SubjectModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectNameRepository extends JpaRepository<SubjectModel, Long> {
    SubjectModel findSubjectByName(String name);
}
