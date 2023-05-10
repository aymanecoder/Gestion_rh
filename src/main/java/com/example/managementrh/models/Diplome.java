package com.example.managementrh.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Diplome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String niveau;
    private String ecole;
    private String typeEcole;
    private String TypeDiplome;
    private String promotion;
    @JsonIgnore
    @OneToMany(mappedBy = "diplome",cascade = CascadeType.ALL)
    private List<Collaborateur> collaborateurs;

}
