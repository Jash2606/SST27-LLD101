package com.example.profiles;

import java.util.Objects;

import javax.lang.model.element.ModuleElement.UsesDirective;

/**
 * Assembles profiles with scattered, inconsistent validation.
 */
public class ProfileService {

    // returns a fully built profile but mutates it afterwards (bug-friendly)
    public UserProfile createMinimal(String id, String email) {
        // if (id == null || id.isBlank()) throw new IllegalArgumentException("bad id");
        // if (email == null || !email.contains("@")) throw new IllegalArgumentException("bad email");
        Validation.requireNonBlank(id, "id");
        Validation.requireEmail(email);

        // UserProfile p = new UserProfile(id, email);
        // later code keeps mutating...
        return new UserProfile.Builder(id, email).build();
    }

    public UserProfile updateDisplayName(UserProfile p, String displayName) {
        Objects.requireNonNull(p, "profile");
        if (displayName != null && displayName.length() > 100) {
            // silently trim (inconsistent policy)
            // displayName = displayName.substring(0, 100);
            displayName = Validation.maxLength(displayName, 100, "displayName");
        }
        // p.setDisplayName(displayName); // mutability leak
        UserProfile updatedProfile = UserProfile.Builder.from(p).displayName(displayName).build();
        return updatedProfile;
    }
}
