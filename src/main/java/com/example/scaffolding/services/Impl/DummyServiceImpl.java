package com.example.scaffolding.services.Impl;

import com.example.scaffolding.dtos.DummyDto;
import com.example.scaffolding.models.Dummy;
import com.example.scaffolding.repositories.DummyRepository;
import com.example.scaffolding.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DummyServiceImpl implements DummyService {

    @Autowired
    private DummyRepository dummyRepository;

    @Override
    public List<Dummy> getDummyList() {
        return null;
    }

    @Override
    public Dummy getDummy(Long id) {
        return null;
    }

    @Override
    public Dummy postDummy(DummyDto dummyDto) {
        return null;
    }

    @Override
    public Dummy updateDummy(DummyDto dummyDto) {
        return null;
    }

    @Override
    public void deleteDummy(DummyDto dummyDto) {

    }
}
