package tk.zhangh.springboot.mybatis.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import tk.zhangh.springboot.mybatis.common.CommonEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Accessors(chain = true)
public class User extends CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pass_word")
    private String passWord;

    @Column(name = "user_name")
    private String userName;
}