package pl.bykowski.javacoursesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Starter {

    private VideoCourseRepository videoCourseRepository;

    @Autowired
    public Starter(VideoCourseRepository videoCourseRepository) {
        this.videoCourseRepository = videoCourseRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        VideoCourse videoCourse1 =
                new VideoCourse("Programowanie wielowątkowe w języku Java",
                        "https://www.youtube.com/watch?v=2wEJLjppwFY",
                        "https://i.ytimg.com/vi/2wEJLjppwFY/hqdefault.jpg");

        VideoCourse videoCourse2 =
                new VideoCourse("Testowanie automatyczne z wykorzystaniem mocków",
                        "https://www.youtube.com/watch?v=n2SWC-yMg6o",
                        "https://i.ytimg.com/vi/J4Tad0UCPFc/hqdefault.jpg");

        VideoCourse videoCourse3 =
                new VideoCourse("Docker od podstaw",
                        "https://www.youtube.com/watch?v=cqIu1h8FkMw",
                        "https://i.ytimg.com/vi/cqIu1h8FkMw/hqdefault.jpg");

        videoCourseRepository.save(videoCourse1);
        videoCourseRepository.save(videoCourse2);
        videoCourseRepository.save(videoCourse3);
    }
}
