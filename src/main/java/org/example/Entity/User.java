package org.example.Entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {
    private String id;
    @NonNull
    private String name;
    @NonNull
    private String ref;
}
