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
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idRestaurant;
    String nom;
    long nbPlacesMax;

    @OneToMany(cascade = CascadeType.ALL)
    List<Menu>menus = new ArrayList<>();
}
