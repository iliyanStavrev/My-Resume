package com.example.resume.service;

import com.example.resume.model.dto.InfoDto;
import com.example.resume.model.entity.Info;

public interface InfoService {

    InfoDto infoByName(String name);

    void init();
}
