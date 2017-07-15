package tk.zhangh.springboot.transaction.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 所有controller开启新线程访问service
 * Created by ZhangHao on 2017/7/15.
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getOne")
    @ResponseBody
    public String getOne() {
        new Thread(() -> studentService.getOne()).start();
        return "getOne";
    }

    @RequestMapping("/getOneTrans")
    @ResponseBody
    public String getOneWithTrans() {
        new Thread(() -> studentService.testNormalGetOneWithTrans()).start();
        return "getOneTrans";
    }

    @RequestMapping("/findOne")
    @ResponseBody
    public String findOne() {
        new Thread(() -> studentService.findOne()).start();
        return "findOne";
    }
}
