package tk.zhangh.springboot.mybatis.common;

import com.github.pagehelper.PageHelper;

/**
 * Created by ZhangHao on 2017/6/19.
 */
public class CommonService {

    public void pageableBeforeSelect(CommonEntity entity) {
        if (entity.getPage() != null && entity.getRows() != null) {
            PageHelper.startPage(entity.getPage(), entity.getRows());
        }
    }
}
