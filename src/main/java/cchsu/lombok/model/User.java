package cchsu.lombok.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by cchsu on 2017/8/5.
 */
@Entity
@Table(name = "user")
@Getter @Setter
@ToString @NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    @NonNull
    private String id;

    @Column(name = "name")
    @NonNull
    private String name;

}
