package com.genialsata.repository;

import com.genialsata.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Georgegoldman");
        speaker.setLastName("John");

        speakers.add(speaker);

        return speakers;
    }
}
