package com.example.scaffolding.controllers;


import com.example.scaffolding.dtos.DummyDto;
import com.example.scaffolding.models.Dummy;
import com.example.scaffolding.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dummy")
public class DummyController {

    @Autowired
    private DummyService dummyService;

    @GetMapping("")
    public ResponseEntity<DummyDto> getDummyList(){
        List<Dummy> dummyList = dummyService.getDummyList();
        return null;
    }
    @GetMapping("/{id}")
    public ResponseEntity<DummyDto> getDummy(@PathVariable Long id){
        Dummy dummy = dummyService.getDummy(id);
        return null;
    }

    @PostMapping("")
    public ResponseEntity<DummyDto> postDummy(DummyDto dummyDto){
        Dummy dummy = dummyService.postDummy(dummyDto);
        return null;
    }
    @PutMapping("")
    public ResponseEntity<DummyDto> updateDummy(DummyDto dummyDto){
        Dummy dummy = dummyService.updateDummy(dummyDto);
        return null;
    }
    @DeleteMapping("")
    public ResponseEntity<DummyDto> deleteDummy(DummyDto dummyDto){
        dummyService.deleteDummy(dummyDto);
        return null;
    }
}
