package br.com.system.teemo.external.database.repository;

import br.com.system.teemo.external.database.entity.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<UsersModel, Long> {

    UsersModel findUserByName(String name);
}
