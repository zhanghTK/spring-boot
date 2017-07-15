package tk.zhangh.springboot.refresh.lifecycle;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * 实现SmartLifecycle，设置容器回调方法
 * 当容器中bean初始化完成后，会回调接口中对应方法
 * Created by ZhangHao on 2017/7/10.
 */
@Component
public class MyLifecycleBean implements SmartLifecycle {

    private boolean running = false;

    /**
     * 容器启动后决定是否回调start方法
     */
    @Override
    public boolean isAutoStartup() {
        return true;
    }

    /**
     * 容器启动后回调
     * 用于容器启动后，启动其他组件或服务
     * 若isAutoStartup方法返回false则不会被调用
     */
    @Override
    public void start() {
        running = true;
        System.out.println("------ my lifecycle bean start");
    }

    /**
     * 容器结束时的回调
     */
    @Override
    public void stop(Runnable callback) {
        callback.run();  // 如果不执行callback.run程序会一直卡着，直到DefaultLifecycleProcessor.timeoutPerShutdownPhase
        System.out.println("------ my lifecycle bean stop callback");
    }

    /**
     *  只有非SmartLifecycle的子类才会执行该方法
     */
    @Override
    public void stop() {
        running = false;
        System.out.println("------ my lifecycle bean stop");
    }

    /**
     * 只有该方法返回false时，start方法才会被执行。<br/>
     * 只有该方法返回true时，stop(Runnable callback)或stop()方法才会被执行。
     */
    @Override
    public boolean isRunning() {
        return running;
    }

    /**
     * 调用顺序
     */
    @Override
    public int getPhase() {
        return 0;
    }
}
