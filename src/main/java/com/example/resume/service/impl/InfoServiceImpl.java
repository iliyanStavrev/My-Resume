package com.example.resume.service.impl;

import com.example.resume.model.dto.InfoDto;
import com.example.resume.model.entity.Info;
import com.example.resume.repository.InfoRepository;
import com.example.resume.service.InfoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {

    private final InfoRepository infoRepository;
    private final ModelMapper modelMapper;

    public InfoServiceImpl(InfoRepository infoRepository, ModelMapper modelMapper) {
        this.infoRepository = infoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public InfoDto infoByName(String name) {

        return modelMapper.map(infoRepository
                .findByName(name), InfoDto.class);
    }

    @Override
    public void init() {

        if (infoRepository.count() > 0){
            return;
        }
        Info info = new Info();
        info.setName("Iliyan Stavrev");
        info.setPosition("Junior Java Developer");
        info.setAddress("Plovdiv, Bulgaria");
        info.setEmail("iliyanstavrev11@gmail.com");
        info.setGithub("https://github.com/iliyanStavrev");
        info.setLinkedIn("https://www.linkedin.com/in/iliyan-stavrev-48089b245");
        info.setFacebook("https://www.facebook.com/iliyan.stavrev.3");
        info.setPhoneNumber("0898 622 950");
        info.setDescription("Highly motivated Software Engineer with good knowledge in" + System.lineSeparator() +
                " Web programming technologies! Eager to learn more!");

        infoRepository.save(info);
    }
}
