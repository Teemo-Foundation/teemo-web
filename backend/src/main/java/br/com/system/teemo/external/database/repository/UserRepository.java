package br.com.system.teemo.external.database.repository;

import br.com.system.teemo.external.database.entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<UserModel, Long> {

    UserModel findUserByName(String name);
}
