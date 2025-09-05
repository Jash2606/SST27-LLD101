package com.example.imports;

import java.nio.file.Path;
import java.util.List;

public class CsvProfileImporter implements ProfileImporter{
    NaiveCsvReader reader;
    ProfileService profileService;

    public CsvProfileImporter(NaiveCsvReader reader, ProfileService profileService) {
        this.reader = reader;
        this.profileService = profileService;
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> rows = reader.read(csvFile);
        for( int i = 0 ; i<rows.size() ; i++ ){
            String id = rows.get(i)[0];
            String email = rows.get(i)[1];
            String displayName = rows.get(i)[2];
            profileService.createProfile(id, email, displayName);
        }
        return rows.size();
    }
}
