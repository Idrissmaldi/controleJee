package com.example.controle_jee.Dtos;


import com.example.controle_jee.entities.Match;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class TicketDto {
    private Long id;
    private String reference;
    private Double prix;
    private Boolean enabled;
}
