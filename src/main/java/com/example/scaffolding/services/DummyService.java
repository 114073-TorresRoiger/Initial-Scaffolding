package com.example.scaffolding.services;

import com.example.scaffolding.dtos.DummyDto;
import com.example.scaffolding.models.Dummy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DummyService {
    List<Dummy> getDummyList();
    Dummy getDummy(Long id);
    Dummy postDummy(DummyDto dummyDto);
    Dummy updateDummy(DummyDto dummyDto);
    void deleteDummy(DummyDto dummyDto);
}
