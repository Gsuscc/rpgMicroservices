package com.codecool.videoservice.setup;

import com.codecool.videoservice.dao.interfaces.VideoDao;
import com.codecool.videoservice.entity.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitRunner {

    private VideoDao videoDao;

    @Autowired
    public InitRunner(VideoDao videoDao) {
        this.videoDao = videoDao;
    }

    @PostConstruct
    private void fillDb(){
        videoDao.addVideo(
                Video.builder()
                     .title("Quicksort Algorithm")
                     .url("https://www.youtube.com/watch?v=7h1s2SojIRw&t=382s")
                     .build()
        );
        videoDao.addVideo(
                Video.builder()
                     .title("1. Introduction to Algorithms")
                     .url("https://www.youtube.com/watch?v=0IAPZzGSbME&list=PLDN4rrl48XKpZkf03iYFl-O29szjTrs_O")
                     .build()
        );
        videoDao.addVideo(
                Video.builder()
                     .title("1.1 Priori Analysis and Posteriori Testing")
                     .url("https://www.youtube.com/watch?v=-JTq1BFBwmo&list=PLDN4rrl48XKpZkf03iYFl-O29szjTrs_O&index=2")
                     .build()
        );
    }

}
