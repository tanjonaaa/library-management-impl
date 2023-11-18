package org.example.Entity;

import lombok.*;
import org.example.Entity.Enum.Sex;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Author {
    private String id;
    @NonNull
    private String name;
    @NonNull
    private String sex;
}
