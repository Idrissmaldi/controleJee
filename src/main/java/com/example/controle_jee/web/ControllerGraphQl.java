package com.example.controle_jee.web;

import com.example.controle_jee.Dtos.MatchDto;
import com.example.controle_jee.Dtos.TicketDto;
import com.example.controle_jee.entities.Ticket;
import com.example.controle_jee.repositories.TicketRepository;
import com.example.controle_jee.service.MatchService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ControllerGraphQl {
    private MatchService matchService;


    public ControllerGraphQl(MatchService matchService) {
        this.matchService = matchService;

    }
    @QueryMapping
    public List<TicketDto> tickets(){
        return matchService.tickets();
    }
    @MutationMapping
    public MatchDto addMatch (@Argument MatchDto match){
        return matchService.addMatch(match);
    }
    @MutationMapping
    public TicketDto addTicket(@Argument TicketDto ticketDto){
        return matchService.addTicket(ticketDto);
    }
    @MutationMapping
    public  TicketDto updateTicket(@Argument TicketDto ticketDto){
        return matchService.updateTicket(ticketDto);
    }
}
