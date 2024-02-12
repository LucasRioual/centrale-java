package org.centrale.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String s) {
        this.name = s;
    }
}
