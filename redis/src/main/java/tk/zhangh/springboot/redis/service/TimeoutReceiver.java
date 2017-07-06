package tk.zhangh.springboot.redis.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

/**
 * Created by ZhangHao on 2017/7/6.
 */
@Slf4j
public class TimeoutReceiver implements MessageListener {
    @Override
    public void onMessage(Message message, byte[] pattern) {
        log.info("超时事件：{}：{}", message, new String(pattern));
    }
}
