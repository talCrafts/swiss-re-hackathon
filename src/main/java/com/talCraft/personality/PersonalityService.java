package com.talCraft.personality;

import com.ibm.watson.developer_cloud.personality_insights.v2.PersonalityInsights;
import com.ibm.watson.developer_cloud.personality_insights.v2.model.Profile;

/**
 * Created by ashishw on 23/1/16.
 */
public class PersonalityService {


    public Profile extract(String text){

        PersonalityInsights service = new PersonalityInsights();
        service.setUsernameAndPassword("<username>", "<password>");
        Profile profile = service.getProfile(text);
        System.out.println(profile);
        return profile;
    }

}
