package com.example.managementrh.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "collaborateur")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Collaborateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "le Nom est obligatoire")
    private String Nom;
    @NotBlank(message = "le Prenom est obligatoire")
    private String Prenom;
    @Digits(integer = 5,fraction = 0,message = "le code doit etre un entier de 5 chiffres")
    private String matricule;
    @Pattern(regexp = "[a-zA-Z]{3}", message = "Le texte doit contenir la première lettre du prénom et les deux premières lettres du nom")
    private String abrevationColab;
    private String ancienManagerRh;
    @Pattern(regexp = "[FM]", message = "Le caractère doit être 'F' pour féminin ou 'M' pour masculin")
    private String sexe;
    private String site;
    @Pattern(regexp = "^[A-Z]{3}[0-9]$" ,message = "le caractaire doit etre par exemple : comme MRR1")
    private String BU;
    @Temporal(TemporalType.DATE)
    private Date dateEmbauche;
    private String moisBap;
    @Temporal(TemporalType.DATE)
    private Date dateDepart;
    private boolean ancienColab;
    private boolean weekIntegration;
    private Date dateParticipation;
    @Pattern(regexp = "^[A-Z]{2}[0-9]$",message = "invalid format le caractaire doit etre par exemple : comme CM2")
    private String postApp;
    @Pattern(regexp = "^[A-Z]{3}[0-9]$",message = "invalid format le caractaire doit etre par ex : DEV4")
    private String postActuel;
    private String salaire;
    @ManyToOne
    @JoinColumn(name = "diplome_id",referencedColumnName = "id")
    private Diplome diplome;
    @OneToMany(mappedBy = "collaborateur",cascade = CascadeType.ALL)
    private List<Competence> competences;








}
