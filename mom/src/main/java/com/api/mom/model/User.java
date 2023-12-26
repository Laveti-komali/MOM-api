package com.api.mom.model;

import com.api.mom.model.Meetings;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Users", schema = "mom")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uid;
    private String username;
    private String group_name;
    private String designation;

    @OneToMany(targetEntity = Meetings.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "meet_user_fk" , referencedColumnName = "uid")
    private List<Meetings> meetings;

}