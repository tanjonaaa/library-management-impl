package org.example.Entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Book {
    private String id;
    @NonNull
    private String name;
    @NonNull
    private Integer pageNumber;
    @NonNull
    private String topic;
    private String authorId;
    private String borrowerId;
    public Book(@NonNull String name, @NonNull Integer pageNumber, @NonNull String topic, String authorId, String borrowerId){
        this.name = name;
        this.pageNumber = pageNumber;
        this.topic = topic;
        this.authorId = authorId;
        this.borrowerId = borrowerId;
    }
}