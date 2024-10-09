package org.example;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import org.example.entity.Cocktail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

@Repository
public class FirebaseRepository {

    private final Firestore firestore;

    private static final String COLLECTION_NAME = "cocktails";

    public FirebaseRepository(FirebaseConfig firestore) throws IOException {
        this.firestore = firestore.firestore();
    }

    public List<Cocktail> getCocktails() throws ExecutionException, InterruptedException {
        CollectionReference cocktailsCollection = firestore.collection(COLLECTION_NAME);
        QuerySnapshot querySnapshot = cocktailsCollection.get().get();
        return querySnapshot.getDocuments().stream()
                .map(doc -> doc.toObject(Cocktail.class))
                .collect(Collectors.toList());
    }
}
