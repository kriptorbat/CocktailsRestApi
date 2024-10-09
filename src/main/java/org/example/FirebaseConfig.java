package org.example;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

//@Configuration
@Component
public class FirebaseConfig {
    public Firestore firestore() throws IOException {
        InputStream serviceAccount = getClass().getClassLoader().getResourceAsStream("serviceAccountKey.json");

        GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
        FirestoreOptions options = FirestoreOptions.newBuilder()
                .setCredentials(credentials)
                .build();
        return options.getService();
    }
}