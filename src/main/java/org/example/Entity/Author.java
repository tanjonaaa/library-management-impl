package org.example.Entity;

import lombok.*;
import org.example.Entity.Enum.Sex;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Author {
    private String id;
    private String name;
    private Sex sex;
}
