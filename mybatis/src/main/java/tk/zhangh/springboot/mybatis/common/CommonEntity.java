package tk.zhangh.springboot.mybatis.common;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * Created by ZhangHao on 2017/6/19.
 */
@Data
@Accessors(chain = true)
public class CommonEntity {
    @Transient
    protected Integer page = 1;

    @Transient
    protected Integer rows = 10;
}
