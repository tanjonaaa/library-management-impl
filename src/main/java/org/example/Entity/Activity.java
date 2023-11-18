package org.example.Entity;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Activity {
    private String id;
    private String SubscriberId;
    private String bookId;
    private LocalDateTime createdAt;
}
