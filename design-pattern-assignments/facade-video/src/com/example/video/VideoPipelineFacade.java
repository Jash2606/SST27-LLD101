package com.example.video;

public class VideoPipelineFacade {
    private Decoder decoder;
    private FilterEngine filterEngine;
    private Encoder encoder;
    private SharpenAdapter sharpenAdapter;

    public VideoPipelineFacade(Decoder decoder, FilterEngine filterEngine, Encoder encoder, SharpenAdapter sharpenAdapter) {
        this.decoder = decoder;
        this.filterEngine = filterEngine;
        this.encoder = encoder;
        this.sharpenAdapter = sharpenAdapter;
    }

    public java.nio.file.Path process(java.nio.file.Path src, java.nio.file.Path out, boolean gray, Double scale , Integer sharpenStrength) {
        Frame[] frames = decoder.decode(src);
        if(gray) {
            frames = filterEngine.grayscale(frames);
        }
        if(scale != null) {
            frames = filterEngine.scale(frames, scale);
        }
        if(sharpenStrength != null) {
            frames = sharpenAdapter.applySharpen(frames, sharpenStrength);
        }
        return encoder.encode(frames, out);
    }
}
