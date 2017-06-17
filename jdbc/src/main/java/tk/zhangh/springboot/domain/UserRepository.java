package tk.zhangh.springboot.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by ZhangHao on 2017/6/17.
 */
public interface UserRepository extends JpaRepository<User, String> {
    User findByUserName(String name);

    User findByUserNameAndPassWord(String name, String pwd);

    // HQL表达式
    @Query("from User u where u.userName=:name")
    User findUser(@Param("name") String name);

    Page<User> findAll(Pageable pageable);
}
