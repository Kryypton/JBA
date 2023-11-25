package com.kryptonn.jba.controller.data.wow;

import com.kryptonn.jba.model.data.wow.AchievementCategoryIndex;
import com.kryptonn.jba.service.data.wow.AchievementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/achievements")
public class AchievementController {
    private final AchievementService achievementService;

    public AchievementController(AchievementService achievementService) {
        this.achievementService = achievementService;
    }

    @GetMapping("/categories")
    public AchievementCategoryIndex getAchievementCategoryIndex() {
        return achievementService.getAchievementCategoryIndex();
    }
}
