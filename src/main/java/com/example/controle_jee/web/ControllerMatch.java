package com.example.controle_jee.web;

import com.example.controle_jee.Dtos.MatchDto;
import com.example.controle_jee.service.MatchService;
import com.sun.jdi.PrimitiveValue;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ControllerMatch {
    private MatchService matchService;
    @GetMapping("/matchs")
    public List<MatchDto> matchDtos(){
        return matchService.matchs();
    }
    @PostMapping("/matchs")
    public MatchDto addMatch(@RequestBody MatchDto match){
        return matchService.addMatch(match);
    }
    @DeleteMapping("/matchs/{id}")
    public void deleteMatch(@PathVariable Long id){
        matchService.deleteMatch(id);
    }
}
