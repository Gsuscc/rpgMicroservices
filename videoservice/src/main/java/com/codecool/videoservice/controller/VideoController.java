package com.codecool.videoservice.controller;


import com.codecool.videoservice.dao.interfaces.VideoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class VideoController {

    private VideoDao videoDao;

    @Autowired
    public VideoController(VideoDao videoDao) {
        this.videoDao = videoDao;
    }

    @GetMapping("api/videos")
    private ResponseEntity getAllVideos(){
        return ResponseEntity.ok(videoDao.getAll());
    }
}
