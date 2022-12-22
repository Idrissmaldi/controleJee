package com.example.controle_jee.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Match {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String reference;
    private Date date;
    private String lieu;
    private String equi1;
    private String equi2;
    @OneToMany(mappedBy = "match")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Ticket> ticketList;



}
