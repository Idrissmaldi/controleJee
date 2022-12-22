package com.example.controle_jee.mappers;

import com.example.controle_jee.Dtos.MatchDto;
import com.example.controle_jee.Dtos.TicketDto;
import com.example.controle_jee.entities.Match;
import com.example.controle_jee.entities.Ticket;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class DtoMapper {
    public MatchDto fromMatch(Match match){
        MatchDto matchDto =new MatchDto();
        BeanUtils.copyProperties(match,matchDto);
        return matchDto;
    }
    public Match fromMatchDto(MatchDto matchDto){
        Match match=new Match();
        BeanUtils.copyProperties(matchDto,match);
        return match;
    }
    public TicketDto fromTicket(Ticket ticket){
        TicketDto ticketDto=new TicketDto();
        BeanUtils.copyProperties(ticket,ticketDto);
        return ticketDto;
    }
    public Ticket fromTicketDto(TicketDto ticketDto){
        Ticket ticket=new Ticket();
        BeanUtils.copyProperties(ticketDto,ticket);
        return ticket;
    }
}
