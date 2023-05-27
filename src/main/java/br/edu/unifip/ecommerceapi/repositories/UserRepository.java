package br.edu.unifip.ecommerceapi.repositories;

import br.edu.unifip.ecommerceapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    @Override
    Optional<User> findById(UUID id);

    void delete(User user);

    List<User> findByActiveTrue();

//    @Query("SELECT u FROM User u WHERE u.name = :name OR u.age = :age")
//    List<User> findByNameOrAge(@Param("name, age") String name, int age);

}
