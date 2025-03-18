package com.webmotech.transliterator;

import java.util.HashMap;
import java.util.Map;

public class SinhalaToLatinTransliterator {

    private static final Map<String, String> SINHALA_TO_LATIN_RULES = new HashMap<>();

    static {
        // Vowels
        SINHALA_TO_LATIN_RULES.put("අ", "a");
        SINHALA_TO_LATIN_RULES.put("ආ", "aa");
        SINHALA_TO_LATIN_RULES.put("ඇ", "ae");
        SINHALA_TO_LATIN_RULES.put("ඈ", "aae");
        SINHALA_TO_LATIN_RULES.put("ඉ", "i");
        SINHALA_TO_LATIN_RULES.put("ඊ", "ii");
        SINHALA_TO_LATIN_RULES.put("උ", "u");
        SINHALA_TO_LATIN_RULES.put("ඌ", "uu");
        SINHALA_TO_LATIN_RULES.put("එ", "e");
        SINHALA_TO_LATIN_RULES.put("ඒ", "ee");
        SINHALA_TO_LATIN_RULES.put("ඔ", "o");
        SINHALA_TO_LATIN_RULES.put("ඕ", "oo");
        SINHALA_TO_LATIN_RULES.put("ඖ", "ou");
        SINHALA_TO_LATIN_RULES.put("඘", "au");

        // Consonants
        SINHALA_TO_LATIN_RULES.put("ක", "ka");
        SINHALA_TO_LATIN_RULES.put("ඛ", "kha");
        SINHALA_TO_LATIN_RULES.put("ග", "ga");
        SINHALA_TO_LATIN_RULES.put("ඝ", "gha");
        SINHALA_TO_LATIN_RULES.put("ඞ", "nga");
        SINHALA_TO_LATIN_RULES.put("ච", "cha");
        SINHALA_TO_LATIN_RULES.put("ඡ", "chha");
        SINHALA_TO_LATIN_RULES.put("ජ", "ja");
        SINHALA_TO_LATIN_RULES.put("ඣ", "zha");
        SINHALA_TO_LATIN_RULES.put("ඤ", "nya");
        SINHALA_TO_LATIN_RULES.put("ට", "ṭa");
        SINHALA_TO_LATIN_RULES.put("ඨ", "ṭha");
        SINHALA_TO_LATIN_RULES.put("ඩ", "da");
        SINHALA_TO_LATIN_RULES.put("ඪ", "dha");
        SINHALA_TO_LATIN_RULES.put("ණ", "na");
        SINHALA_TO_LATIN_RULES.put("ත", "tha");
        SINHALA_TO_LATIN_RULES.put("ථ", "thha");
        SINHALA_TO_LATIN_RULES.put("ද", "da");
        SINHALA_TO_LATIN_RULES.put("ධ", "dha");
        SINHALA_TO_LATIN_RULES.put("න", "na");
        SINHALA_TO_LATIN_RULES.put("ප", "pa");
        SINHALA_TO_LATIN_RULES.put("ඵ", "pha");
        SINHALA_TO_LATIN_RULES.put("බ", "ba");
        SINHALA_TO_LATIN_RULES.put("භ", "bha");
        SINHALA_TO_LATIN_RULES.put("ම", "ma");
        SINHALA_TO_LATIN_RULES.put("ඹ", "mba");
        SINHALA_TO_LATIN_RULES.put("ය", "ya");
        SINHALA_TO_LATIN_RULES.put("ර", "ra");
        SINHALA_TO_LATIN_RULES.put("ල", "la");
        SINHALA_TO_LATIN_RULES.put("ළ", "ḷa");
        SINHALA_TO_LATIN_RULES.put("ව", "va");
        SINHALA_TO_LATIN_RULES.put("ශ", "sha");
        SINHALA_TO_LATIN_RULES.put("ෂ", "ṣa");
        SINHALA_TO_LATIN_RULES.put("ස", "sa");
        SINHALA_TO_LATIN_RULES.put("හ", "ha");
        SINHALA_TO_LATIN_RULES.put("ෆ", "fa");

        // Special characters and sounds
        SINHALA_TO_LATIN_RULES.put("ං", "ng");
        SINHALA_TO_LATIN_RULES.put("්", "");
        SINHALA_TO_LATIN_RULES.put("්‍", "");
        SINHALA_TO_LATIN_RULES.put("්‍ර", "ra");
        SINHALA_TO_LATIN_RULES.put("ෲ", "ru");
        SINHALA_TO_LATIN_RULES.put("ඉ්", "i");
        SINHALA_TO_LATIN_RULES.put("උ්", "u");
        SINHALA_TO_LATIN_RULES.put("ෞ", "au");

        // Combining characters
        SINHALA_TO_LATIN_RULES.put("ා", "a");
        SINHALA_TO_LATIN_RULES.put("ෙ", "e");
        SINHALA_TO_LATIN_RULES.put("ෑ", "ae");
        SINHALA_TO_LATIN_RULES.put("ු", "u");
        SINHALA_TO_LATIN_RULES.put("ූ", "uu");

        // Digits and punctuation marks
        SINHALA_TO_LATIN_RULES.put("0", "0");
        SINHALA_TO_LATIN_RULES.put("1", "1");
        SINHALA_TO_LATIN_RULES.put("2", "2");
        SINHALA_TO_LATIN_RULES.put("3", "3");
        SINHALA_TO_LATIN_RULES.put("4", "4");
        SINHALA_TO_LATIN_RULES.put("5", "5");
        SINHALA_TO_LATIN_RULES.put("6", "6");
        SINHALA_TO_LATIN_RULES.put("7", "7");
        SINHALA_TO_LATIN_RULES.put("8", "8");
        SINHALA_TO_LATIN_RULES.put("9", "9");

        // Punctuation
        SINHALA_TO_LATIN_RULES.put(",", ",");
        SINHALA_TO_LATIN_RULES.put(".", ".");
        SINHALA_TO_LATIN_RULES.put("!", "!");
        SINHALA_TO_LATIN_RULES.put("?", "?");
        SINHALA_TO_LATIN_RULES.put("(", "(");
        SINHALA_TO_LATIN_RULES.put(")", ")");
        SINHALA_TO_LATIN_RULES.put(":", ":");
        SINHALA_TO_LATIN_RULES.put(";", ";");
        SINHALA_TO_LATIN_RULES.put("'", "'");
        SINHALA_TO_LATIN_RULES.put("\"", "\"");
        SINHALA_TO_LATIN_RULES.put("-", "-");
    }

    public static String transliterate(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            String latin = SINHALA_TO_LATIN_RULES.get(String.valueOf(c));
            if (latin != null) {
                result.append(latin);
            } else {
                result.append(c);
            }
        }

        return result.toString().replaceAll("[\u0D80-\u0DFF]", "");

    }
}
