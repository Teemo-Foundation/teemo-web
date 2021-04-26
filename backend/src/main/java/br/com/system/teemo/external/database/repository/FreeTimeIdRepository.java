package br.com.system.teemo.external.database.repository;

import br.com.system.teemo.external.database.entity.FreeTimeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreeTimeIdRepository extends JpaRepository<FreeTimeModel, Long> {
    FreeTimeModel findFreeTimeById(Long id);
}
