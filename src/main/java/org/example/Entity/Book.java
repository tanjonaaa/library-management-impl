package org.example.Entity;

import lombok.*;
import org.example.Entity.Enum.Topic;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Book {
    private String id;
    private String name;
    private Integer pageNumber;
    private String topic;
    private String authorId;
    private String borrowerId;
}