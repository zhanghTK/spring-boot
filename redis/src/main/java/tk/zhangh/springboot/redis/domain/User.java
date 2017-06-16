package tk.zhangh.springboot.redis.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@NoArgsConstructor
// 需要继承Serializable接口
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userName;

    private String passWord;

    private String email;

    private String nickName;

    private String regTime;
}