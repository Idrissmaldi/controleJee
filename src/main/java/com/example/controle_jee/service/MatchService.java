package com.example.controle_jee.service;


import com.example.controle_jee.Dtos.MatchDto;
import com.example.controle_jee.Dtos.TicketDto;

import java.util.List;

public interface MatchService {
 List<TicketDto> tickets();
 MatchDto addMatch(MatchDto matchDto);
 void deleteMatch (Long id);
 TicketDto addTicket(TicketDto ticketDto);

 TicketDto updateTicket(TicketDto ticketDto);
 List<MatchDto> matchs();
}
