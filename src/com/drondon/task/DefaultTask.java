package com.drondon.task;

public class DefaultTask implements ITask {

    private String text;
    private long startTime;
    private long duration;

    public DefaultTask(String text, long duration) {
        this.text = text;
        this.startTime = System.currentTimeMillis();
        this.duration = duration;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public long getStartTime() {
        return startTime;
    }

    @Override
    public long getDuration() {
        return duration;
    }
}
