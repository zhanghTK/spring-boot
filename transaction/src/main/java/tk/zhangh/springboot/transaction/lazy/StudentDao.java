package tk.zhangh.springboot.transaction.lazy;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ZhangHao on 2017/7/15.
 */
public interface StudentDao extends JpaRepository<Student, Integer> {
}
