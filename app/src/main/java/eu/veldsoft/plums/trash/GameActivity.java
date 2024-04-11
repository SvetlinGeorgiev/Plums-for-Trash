package eu.veldsoft.plums.trash;

import android.app.Activity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;


/**
 * Game screen is the most used window in the game.
 */
public class GameActivity extends Activity {
    /**
     * Map of the card key and card image.
     */
    static final Map<String, Integer> CARDS_IMAGES = new HashMap<String, Integer>();

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        /*
         * Map card keys to card image resource identifiers.
         */
        if (CARDS_IMAGES.size() == 0) {
            CARDS_IMAGES.put("bins_v4_01", R.drawable.bins_v4_01);
            CARDS_IMAGES.put("bins_v4_02", R.drawable.bins_v4_02);
            CARDS_IMAGES.put("bins_v4_10", R.drawable.bins_v4_10);
            CARDS_IMAGES.put("bins_v4_19", R.drawable.bins_v4_19);
            CARDS_IMAGES.put("bins_v4_20", R.drawable.bins_v4_20);
            CARDS_IMAGES.put("garbage_cards_v6_01", R.drawable.garbage_cards_v6_01);
            CARDS_IMAGES.put("garbage_cards_v6_02", R.drawable.garbage_cards_v6_02);
            CARDS_IMAGES.put("garbage_cards_v6_03", R.drawable.garbage_cards_v6_03);
            CARDS_IMAGES.put("garbage_cards_v6_04", R.drawable.garbage_cards_v6_04);
            CARDS_IMAGES.put("garbage_cards_v6_05", R.drawable.garbage_cards_v6_05);
            CARDS_IMAGES.put("garbage_cards_v6_06", R.drawable.garbage_cards_v6_06);
            CARDS_IMAGES.put("garbage_cards_v6_07", R.drawable.garbage_cards_v6_07);
            CARDS_IMAGES.put("garbage_cards_v6_08", R.drawable.garbage_cards_v6_08);
            CARDS_IMAGES.put("garbage_cards_v6_09", R.drawable.garbage_cards_v6_09);
            CARDS_IMAGES.put("garbage_cards_v6_10", R.drawable.garbage_cards_v6_10);
            CARDS_IMAGES.put("garbage_cards_v6_11", R.drawable.garbage_cards_v6_11);
            CARDS_IMAGES.put("garbage_cards_v6_12", R.drawable.garbage_cards_v6_12);
            CARDS_IMAGES.put("garbage_cards_v6_13", R.drawable.garbage_cards_v6_13);
            CARDS_IMAGES.put("garbage_cards_v6_14", R.drawable.garbage_cards_v6_14);
            CARDS_IMAGES.put("garbage_cards_v6_15", R.drawable.garbage_cards_v6_15);
            CARDS_IMAGES.put("garbage_cards_v6_16", R.drawable.garbage_cards_v6_16);
            CARDS_IMAGES.put("garbage_cards_v6_17", R.drawable.garbage_cards_v6_17);
            CARDS_IMAGES.put("garbage_cards_v6_18", R.drawable.garbage_cards_v6_18);
            CARDS_IMAGES.put("garbage_cards_v6_19", R.drawable.garbage_cards_v6_19);
            CARDS_IMAGES.put("garbage_cards_v6_20", R.drawable.garbage_cards_v6_20);
            CARDS_IMAGES.put("garbage_cards_v6_21", R.drawable.garbage_cards_v6_21);
            CARDS_IMAGES.put("garbage_cards_v6_22", R.drawable.garbage_cards_v6_22);
            CARDS_IMAGES.put("garbage_cards_v6_23", R.drawable.garbage_cards_v6_23);
            CARDS_IMAGES.put("garbage_cards_v6_24", R.drawable.garbage_cards_v6_24);
            CARDS_IMAGES.put("garbage_cards_v6_25", R.drawable.garbage_cards_v6_25);
            CARDS_IMAGES.put("garbage_cards_v6_26", R.drawable.garbage_cards_v6_26);
            CARDS_IMAGES.put("garbage_cards_v6_27", R.drawable.garbage_cards_v6_27);
            CARDS_IMAGES.put("garbage_cards_v6_28", R.drawable.garbage_cards_v6_28);
            CARDS_IMAGES.put("garbage_cards_v6_29", R.drawable.garbage_cards_v6_29);
            CARDS_IMAGES.put("garbage_cards_v6_30", R.drawable.garbage_cards_v6_30);
            CARDS_IMAGES.put("garbage_cards_v6_31", R.drawable.garbage_cards_v6_31);
            CARDS_IMAGES.put("garbage_cards_v6_32", R.drawable.garbage_cards_v6_32);
            CARDS_IMAGES.put("garbage_cards_v6_33", R.drawable.garbage_cards_v6_33);
            CARDS_IMAGES.put("garbage_cards_v6_34", R.drawable.garbage_cards_v6_34);
            CARDS_IMAGES.put("garbage_cards_v6_35", R.drawable.garbage_cards_v6_35);
            CARDS_IMAGES.put("garbage_cards_v6_36", R.drawable.garbage_cards_v6_36);
            CARDS_IMAGES.put("garbage_cards_v6_37", R.drawable.garbage_cards_v6_37);
            CARDS_IMAGES.put("garbage_cards_v6_38", R.drawable.garbage_cards_v6_38);
            CARDS_IMAGES.put("garbage_cards_v6_39", R.drawable.garbage_cards_v6_39);
            CARDS_IMAGES.put("garbage_cards_v6_40", R.drawable.garbage_cards_v6_40);
            CARDS_IMAGES.put("garbage_cards_v6_41", R.drawable.garbage_cards_v6_41);
            CARDS_IMAGES.put("garbage_cards_v6_42", R.drawable.garbage_cards_v6_42);
            CARDS_IMAGES.put("garbage_cards_v6_43", R.drawable.garbage_cards_v6_43);
            CARDS_IMAGES.put("garbage_cards_v6_44", R.drawable.garbage_cards_v6_44);
            CARDS_IMAGES.put("garbage_cards_v6_45", R.drawable.garbage_cards_v6_45);
            CARDS_IMAGES.put("garbage_cards_v6_46", R.drawable.garbage_cards_v6_46);
            CARDS_IMAGES.put("garbage_cards_v6_47", R.drawable.garbage_cards_v6_47);
            CARDS_IMAGES.put("garbage_cards_v6_48", R.drawable.garbage_cards_v6_48);
            CARDS_IMAGES.put("garbage_cards_v6_49", R.drawable.garbage_cards_v6_49);
            CARDS_IMAGES.put("garbage_cards_v6_50", R.drawable.garbage_cards_v6_50);
            CARDS_IMAGES.put("garbage_cards_v6_51", R.drawable.garbage_cards_v6_51);
            CARDS_IMAGES.put("garbage_cards_v6_52", R.drawable.garbage_cards_v6_52);
            CARDS_IMAGES.put("garbage_cards_v6_53", R.drawable.garbage_cards_v6_53);
            CARDS_IMAGES.put("garbage_cards_v6_54", R.drawable.garbage_cards_v6_54);
            CARDS_IMAGES.put("garbage_cards_v6_55", R.drawable.garbage_cards_v6_55);
            CARDS_IMAGES.put("garbage_cards_v6_56", R.drawable.garbage_cards_v6_56);
            CARDS_IMAGES.put("garbage_cards_v6_57", R.drawable.garbage_cards_v6_57);
            CARDS_IMAGES.put("garbage_cards_v6_58", R.drawable.garbage_cards_v6_58);
            CARDS_IMAGES.put("garbage_cards_v6_59", R.drawable.garbage_cards_v6_59);
            CARDS_IMAGES.put("garbage_cards_v6_60", R.drawable.garbage_cards_v6_60);
            CARDS_IMAGES.put("garbage_cards_v6_61", R.drawable.garbage_cards_v6_61);
            CARDS_IMAGES.put("garbage_cards_v6_62", R.drawable.garbage_cards_v6_62);
            CARDS_IMAGES.put("garbage_cards_v6_63", R.drawable.garbage_cards_v6_63);
            CARDS_IMAGES.put("garbage_cards_v6_64", R.drawable.garbage_cards_v6_64);
            CARDS_IMAGES.put("garbage_cards_v6_65", R.drawable.garbage_cards_v6_65);
            CARDS_IMAGES.put("garbage_cards_v6_66", R.drawable.garbage_cards_v6_66);
            CARDS_IMAGES.put("garbage_cards_v6_67", R.drawable.garbage_cards_v6_67);
            CARDS_IMAGES.put("garbage_cards_v6_68", R.drawable.garbage_cards_v6_68);
            CARDS_IMAGES.put("garbage_cards_v6_69", R.drawable.garbage_cards_v6_69);
            CARDS_IMAGES.put("garbage_cards_v6_70", R.drawable.garbage_cards_v6_70);
            CARDS_IMAGES.put("quest_v5_en_01", R.drawable.quest_v5_en_01);
            CARDS_IMAGES.put("quest_v5_en_02", R.drawable.quest_v5_en_02);
            CARDS_IMAGES.put("quest_v5_en_03", R.drawable.quest_v5_en_03);
            CARDS_IMAGES.put("quest_v5_en_04", R.drawable.quest_v5_en_04);
            CARDS_IMAGES.put("quest_v5_en_05", R.drawable.quest_v5_en_05);
            CARDS_IMAGES.put("quest_v5_en_06", R.drawable.quest_v5_en_06);
            CARDS_IMAGES.put("quest_v5_en_07", R.drawable.quest_v5_en_07);
            CARDS_IMAGES.put("quest_v5_en_08", R.drawable.quest_v5_en_08);
            CARDS_IMAGES.put("quest_v5_en_09", R.drawable.quest_v5_en_09);
            CARDS_IMAGES.put("quest_v5_en_10", R.drawable.quest_v5_en_10);
            CARDS_IMAGES.put("quest_v5_en_11", R.drawable.quest_v5_en_11);
            CARDS_IMAGES.put("quest_v5_en_12", R.drawable.quest_v5_en_12);
            CARDS_IMAGES.put("quest_v5_en_13", R.drawable.quest_v5_en_13);
            CARDS_IMAGES.put("quest_v5_en_14", R.drawable.quest_v5_en_14);
            CARDS_IMAGES.put("quest_v5_en_15", R.drawable.quest_v5_en_15);
            CARDS_IMAGES.put("quest_v5_en_16", R.drawable.quest_v5_en_16);
        }
    }
}