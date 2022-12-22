package com.example.controle_jee;

import com.example.controle_jee.entities.Match;
import com.example.controle_jee.entities.Ticket;
import com.example.controle_jee.repositories.MatchRepository;
import com.example.controle_jee.repositories.TicketRepository;
import com.example.controle_jee.service.MatchService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class ControleJeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleJeeApplication.class, args);
    }
/*  @Bean
    CommandLineRunner commandLineRunner(MatchService matchService,MatchRepository matchRepository,TicketRepository ticketRepository){
     return args -> {
         for (int i = 1; i <4 ; i++) {
             Match match=Match.builder()
                     .id(UUID.randomUUID().toString())
                     .reference("ref10236"+i)
                     .date(new Date())
                     .lieu("lieu"+i)
                     .equi1("equipe1")
                     .equi2("equipe2")
                     .build();
             matchRepository.save(match);*/




     /*    matchRepository.findAll().forEach(ticket1 -> {
             for (int i = 1; i < 5; i++) {
                 Ticket ticket=Ticket.builder()
                         .reference("12548bhjgyu216m"+i)
                         .prix(152.00)
                         .enabled(true)
                         .build();
                 ticketRepository.save(ticket);

             }

         });*/







}
