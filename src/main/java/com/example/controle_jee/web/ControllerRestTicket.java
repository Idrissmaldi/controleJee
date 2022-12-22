package com.example.controle_jee.web;

import com.example.controle_jee.Dtos.MatchDto;
import com.example.controle_jee.Dtos.TicketDto;
import com.example.controle_jee.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
public class ControllerRestTicket {
    private MatchService matchService;
    @GetMapping("/tickets")
    public List<TicketDto> ticketDtos(){
        return matchService.tickets();
    }
    @PostMapping("/tickets")
    public TicketDto addTicket(@RequestBody TicketDto ticketDto){
        return matchService.addTicket(ticketDto);
    }
    @PutMapping("/tickets/{ticketId}")
    public TicketDto updateTicket(@PathVariable Long ticketId,@RequestBody TicketDto ticketDto){
        ticketDto.setId(ticketId);
       return matchService.updateTicket(ticketDto);
    }
}
