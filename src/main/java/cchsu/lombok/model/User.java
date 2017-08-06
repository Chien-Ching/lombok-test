package cchsu.lombok.model;

import lombok.*;

/**
 * Created by cchsu on 2017/8/5.
 */
@Getter @Setter
@ToString @NoArgsConstructor
public class User {
    @NonNull
    private String id;

    @NonNull
    private String name;

}
