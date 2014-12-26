package com.example.android.myapplication;

import android.app.Activity;


import java.util.HashMap;

/**
 * Created by admin-pc on 21.10.2014.
 */
public class ResourceStorage extends Activity {

    public HashMap<String,String> createResourcesMap(){
        HashMap<String,String> imageNamesMap = new HashMap<String, String>();
        imageNamesMap.put(String.valueOf(R.drawable.nevermind),"nevermind");
        imageNamesMap.put(String.valueOf(R.drawable.pink_floyd),"pink floyd");
        imageNamesMap.put(String.valueOf(R.drawable.abbey_road),"abbey road");
        imageNamesMap.put(String.valueOf(R.drawable.american_idiot),"american idiot");
        imageNamesMap.put(String.valueOf(R.drawable.animals),"animals");
        imageNamesMap.put(String.valueOf(R.drawable.back_in_black),"back in black");
        imageNamesMap.put(String.valueOf(R.drawable.kid_a),"kid a");
        imageNamesMap.put(String.valueOf(R.drawable.mothership),"mothership");
        imageNamesMap.put(String.valueOf(R.drawable.radioactivity),"radioactivity");
        imageNamesMap.put(String.valueOf(R.drawable.rage_against_the_machine),"rage against the machine");
        imageNamesMap.put(String.valueOf(R.drawable.sgt_peppers_lonely_hearts_club),"sgt peppers lonely hearts club");
        imageNamesMap.put(String.valueOf(R.drawable.unknown_pleasures),"unknown pleasures");
        imageNamesMap.put(String.valueOf(R.drawable.velvet_underground),"velvet underground");
        imageNamesMap.put(String.valueOf(R.drawable.war),"war");

        return imageNamesMap;
    }

    public HashMap<String,String> createNotificationMap(){
        HashMap<String,String> imageNamesMap = new HashMap<String, String>();
        imageNamesMap.put(String.valueOf(R.drawable.nevermind),"The baby boy on the cover of ‘Nevermind’ was almost a girl\n"+
                "‘Nevermind’ cover photographer Kirk Weddle did two shoots and really liked a photograph he took with a baby girl, but the band's record label insisted: we want the d--k.");
        imageNamesMap.put(String.valueOf(R.drawable.pink_floyd),"The music and lyrics for the entire album were written during a seven week period in which the band were preparing for a tour in which they desperately wanted to premier new material.");
        imageNamesMap.put(String.valueOf(R.drawable.abbey_road),"The album's working title was 'Everest,' an inside joke about the brand of cigarettes smoked by engineer Geoff Emerick. They had intended to shoot the cover photo at Mount Everest, but none of them wanted to make the long journey. Instead, McCartney suggested naming it after the street on which EMI Studios was located. That meant they could photograph themselves in the nearest crosswalk, which took about 30 minutes total.\n");
        imageNamesMap.put(String.valueOf(R.drawable.american_idiot),"Armstrong wrote a few songs for \"Idiot\" while walking around the track at Macalester College in St. Paul. His wife, Adrienne, is from the Twin Cities, and they have a home here.");
        imageNamesMap.put(String.valueOf(R.drawable.animals),"animals");
        imageNamesMap.put(String.valueOf(R.drawable.back_in_black),"In fact, Back in Black has sold in excess of 50 million copies worldwide, making it one of the best selling albums in the history of music, only second to Micheal Jackson's Thriller.");
        imageNamesMap.put(String.valueOf(R.drawable.kid_a),"Thom was in a band called Headless Chickens. His first band with Colin Greenwood was called TNT.");
        imageNamesMap.put(String.valueOf(R.drawable.mothership),"mothership");
        imageNamesMap.put(String.valueOf(R.drawable.radioactivity),"The song plays upon the meaning of its title, with the line \"Discovered by Madame Curie\" juxtaposed with \"Tune in to the melody\". ");
        imageNamesMap.put(String.valueOf(R.drawable.rage_against_the_machine),"At Woodstock '99, Commerford draped the American flag over his bass amp and lit it on fire. He says he celebrating his right to free speech.");
        imageNamesMap.put(String.valueOf(R.drawable.sgt_peppers_lonely_hearts_club),"Lennon wanted Jesus, Gandhi, and Hitler on the cover. He had recently taken a lot of heat for saying The Beatles were \"Bigger than Jesus,\" so they decided not to. (thanks, don - rapid city, SD, for above 2)");
        imageNamesMap.put(String.valueOf(R.drawable.unknown_pleasures),"The 39 minutes of Joy Division's debut album Unknown Pleasures changed music forever: a mixture of Ian Curtis' mesmerising vocals and lyrics, Bernard Sumner's spiky guitar work, Peter Hook's distinctive bass playing and Stephen Morris' hypnotic drum patterns, all brought together by the mad genius that was producer Martin Hannett.");
        imageNamesMap.put(String.valueOf(R.drawable.velvet_underground),"Lou Reed's father was a tax accountant, who raised him with the expectation that he would take over the family business. When little Lou turned out to be more of a handful than they'd bargained for, his parents signed their son over to the Creedmore State Psychiatric Hospital, where Lou Reed suffered eight weeks of electroshock therapy at the age of 17.");
        imageNamesMap.put(String.valueOf(R.drawable.war)," This release, in 1991,was the first occurrence of its kind since the release of 'Help' by the Beatles in 1965.");

        return imageNamesMap;
    }


}
