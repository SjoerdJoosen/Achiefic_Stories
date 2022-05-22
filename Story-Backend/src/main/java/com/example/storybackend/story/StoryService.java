package com.example.storybackend.story;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class StoryService {

    public List<Story> getAllStories() {
        return List.of(
                new Story(
                    1L,
                    "LotsOfWork",
                        "Me",
                        "Horror",
                        "SoMuchToDoAndSee",
                        250,
                        18,
                        "OhGollyGeethereissomuchtoseeanddo"
                ));
    }
}