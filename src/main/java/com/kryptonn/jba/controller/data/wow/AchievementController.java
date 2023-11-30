package com.kryptonn.jba.controller.data.wow;

import com.kryptonn.jba.client.ApiResponse;
import com.kryptonn.jba.model.data.wow.achievementAPI.AchievementCategoryID;
import com.kryptonn.jba.model.data.wow.achievementAPI.AchievementCategoryIndex;
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
    public Object getAchievementCategoryIndex() {
        ApiResponse<AchievementCategoryIndex> r = achievementService.getAchievementCategoryIndex();
        try {
            return r.getData();
        } catch (Exception e) {
            return r.getError();
        }
    }

    @GetMapping("/categories/{id}")
    public Object getAchievementCategoryID(Integer id) {
        ApiResponse<AchievementCategoryID> r = achievementService.getAchievementCategoryID(id);
        try {
            return r.getData();
        } catch (Exception e) {
            return r.getError();
        }
    }
}
