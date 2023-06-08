package ss4_oop.exercise.stop_watch;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

//[Bài tập] Xây dựng lớp StopWatch
public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void startTime() {
        System.out.println(LocalTime.now());
    }

    public long start() {
        startTime = System.currentTimeMillis();
        return startTime;
    }

    public long stop() {
        endTime = System.currentTimeMillis();
        return endTime;
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
