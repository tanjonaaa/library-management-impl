package org.example.Entity;

import java.time.LocalDateTime;
import java.util.List;

public class Return extends Activity{
    public Return(String id, String subscriberId, List<Book> books, LocalDateTime createdAt) {
        super(id, subscriberId, books, createdAt);
    }
}