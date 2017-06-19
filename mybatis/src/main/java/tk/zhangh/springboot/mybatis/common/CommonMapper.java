package tk.zhangh.springboot.mybatis.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by ZhangHao on 2017/6/19.
 */
public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
