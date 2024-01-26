package com.example.testjomnimohamedhamza.DAO.Entitie;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idMenu;
    String libelleMenu;
    @Enumerated(EnumType.STRING)
    TypeMenu typeMenu;
    Float prixTotal;

    @ManyToOne
    Restaurant restaurant;

    @ManyToMany(mappedBy = "menus", cascade = CascadeType.ALL)
    List<Client> clients = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "menu")
    List<Composant> composants = new ArrayList<>();
}
