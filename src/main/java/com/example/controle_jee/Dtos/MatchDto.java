package com.example.controle_jee.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class MatchDto {
    private Long id;
    private String reference;
    private Date date;
    private String lieu;
    private String equi1;
    private String equi2;
}
