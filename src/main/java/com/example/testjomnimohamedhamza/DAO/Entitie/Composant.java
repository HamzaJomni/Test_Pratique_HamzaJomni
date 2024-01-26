package com.example.testjomnimohamedhamza.DAO.Entitie;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idComposant;
    String nomComposant;
    Float prix;

    @ManyToOne
    Menu menu;
}
