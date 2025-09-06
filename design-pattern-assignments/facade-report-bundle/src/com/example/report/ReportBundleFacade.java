package com.example.report;

import java.nio.file.Path;

public class ReportBundleFacade {
    private JsonWriter jw;
    private Zipper z;
    private AuditLog log;

    public ReportBundleFacade(JsonWriter jw, Zipper z, AuditLog log) {
        this.jw = jw;
        this.z = z;
        this.log = log;
    }

    public Path export(java.util.Map<String,Object> data, java.nio.file.Path outDir, String baseName){
        if(data == null || outDir == null || baseName == null || baseName.isBlank()){
            throw new IllegalArgumentException("Invalid input(s) to export");
        }
        Path jsonPath = jw.write(data, outDir, baseName);
        Path zip = z.zip(jsonPath , Path.of(outDir.toString(), baseName + ".zip"));
        log.log("exported " + zip);
        return zip;
    }
}
