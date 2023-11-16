package org.example.Entity;

import java.time.LocalDateTime;

public class Borrowing extends Activity{
    public Borrowing(String id, String subscriberId, String bookId, LocalDateTime createdAt) {
        super(id, subscriberId, bookId, createdAt);
    }
}
