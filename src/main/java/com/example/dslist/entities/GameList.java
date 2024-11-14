package com.example.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "tb_game_list")
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
