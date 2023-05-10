package com.example.managementrh.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Competence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String competance;
    private String niveau;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "collaborateur_id")
    private Collaborateur collaborateur;


}
