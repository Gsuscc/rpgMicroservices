package com.codecool.videoservice.dao.implementations;

import com.codecool.videoservice.dao.interfaces.VideoDao;
import com.codecool.videoservice.entity.Video;
import com.codecool.videoservice.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VideoJpa implements VideoDao {


    private VideoRepository videoRepository;

    @Autowired
    public VideoJpa(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @Override
    public void addVideo(Video video) {
        videoRepository.save(video);
    }

    @Override
    public List<Video> getAll() {
        return videoRepository.findAll();
    }
}
