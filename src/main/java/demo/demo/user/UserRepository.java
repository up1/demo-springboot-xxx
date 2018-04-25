package demo.demo.user;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("SELECT * FROM user WHERE id = :id")
    User getUserById(@Param("id") int id);

    @Modifying
    @Query("INSERT INTO user (firstname, lastname) VALUES( 'test', 'test' )")
    int save();

}
