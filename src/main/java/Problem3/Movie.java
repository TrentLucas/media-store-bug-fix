package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.rating = rating;
        this.title = title;
        this.id = UUID.randomUUID();
    }

    public Movie(Movie anotherMovie) {
        this.rating = anotherMovie.rating;
        this.title = anotherMovie.title;
        this.id = anotherMovie.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public UUID getId() {
        return this.id;
    }
    public String getTitle() {
        return this.title;
    }
    public String getRating() {
        return this.rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Movie)) {
            return false;
        }


        Movie theOtherMovie = (Movie) obj;

        // bug is here
        // Quiz: add unit tests to catch this bug.
        // The bug is caught when
        //  1. newly add tests fail while all old tests still pass
        //  2. remove the bug and use the fix below, all tests pass


        // fix is here
        return this.id == ((Movie) obj).id;
    }
}
