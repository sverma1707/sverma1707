package com.sverma1707.trello.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {

    @Id
    Integer id;

    @Column
    String title;

    @Column
    @OneToMany
    List<Task> tasks;
}
