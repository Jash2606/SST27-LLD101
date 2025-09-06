package com.example.video;

public class SharpenAdapter {
    private LegacySharpen legacySharpen;

    public SharpenAdapter(LegacySharpen legacySharpen) {
        this.legacySharpen = legacySharpen;
    }

    public Frame[] applySharpen(Frame[] frames, int strength) {
        String handle = frameToHandle(frames);
        String sharpenedHandle = legacySharpen.applySharpen(handle, strength);
        return handleToFrame(sharpenedHandle);
    }

    private String frameToHandle(Frame[] frames) {
        return "FRAME_HANDLE";
    }

    private Frame[] handleToFrame(String handle) {
        return new Frame[] { new Frame(1920, 1080) };
    }
    
}
