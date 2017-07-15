package tk.zhangh.springboot.transaction.lazy;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by ZhangHao on 2017/7/15.
 */
@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
}
