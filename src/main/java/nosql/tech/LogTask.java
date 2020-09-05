package nosql.tech;

import lombok.extern.slf4j.Slf4j;

/**
 * 日志输出任务
 *
 * @author faith.huan 2020-09-05 22:00
 */
@Slf4j
public class LogTask {

    public static void main(String[] args) throws InterruptedException {
        int logTimes = 10;
        for (int i = 0; i < logTimes; i++) {
            log.info("task-" + i);
            Thread.sleep(2_000);
        }
    }

}