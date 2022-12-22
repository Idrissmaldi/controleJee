package com.example.controle_jee.service;

import com.example.controle_jee.Dtos.MatchDto;
import com.example.controle_jee.Dtos.TicketDto;
import com.example.controle_jee.entities.Match;
import com.example.controle_jee.entities.Ticket;
import com.example.controle_jee.mappers.DtoMapper;
import com.example.controle_jee.repositories.MatchRepository;
import com.example.controle_jee.repositories.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class MatchServiceImpl implements MatchService{

    private MatchRepository matchRepository;

    private TicketRepository ticketRepository;

    private DtoMapper dtoMapper;



    @Override
    public List<TicketDto> tickets() {
        List<Ticket> ticketList=ticketRepository.findAll();
        List<TicketDto> ticketDtos=ticketList.stream().map(ticket -> dtoMapper.fromTicket(ticket)).collect(Collectors.toList());

        return ticketDtos;
    }

    @Override
    public MatchDto addMatch(MatchDto matchDto) {
       Match match=Match.builder()
               .reference(matchDto.getReference())
               .date(matchDto.getDate())
               .lieu(matchDto.getLieu())
               .equi1(matchDto.getEqui1())
               .equi2(matchDto.getEqui2())
               .build();
       Match savedMatch=matchRepository.save(match);
       MatchDto matchDto1=dtoMapper.fromMatch(savedMatch);
       return matchDto1;
    }

    @Override
    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);

    }

    @Override
    public TicketDto addTicket(TicketDto ticketDto) {
        Ticket ticket=Ticket.builder()
                .reference(ticketDto.getReference())
                .prix(ticketDto.getPrix())
                .enabled(ticketDto.getEnabled())
                .build();
        Ticket savedTicket=ticketRepository.save(ticket);
        TicketDto tickett =dtoMapper.fromTicket(savedTicket);
        return tickett;
    }

    @Override
    public TicketDto updateTicket(TicketDto ticketDto) {
        Ticket ticket=dtoMapper.fromTicketDto(ticketDto);
        Ticket savedTicket=ticketRepository.save(ticket);
      return dtoMapper.fromTicket(savedTicket) ;
    }

    @Override
    public List<MatchDto> matchs() {
        List<Match> matches=matchRepository.findAll();
        List<MatchDto> matchDtos=matches.stream().map(match -> dtoMapper.fromMatch(match)).collect(Collectors.toList());
        return matchDtos;
    }

}
