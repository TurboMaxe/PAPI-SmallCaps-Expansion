package dev.colbster937.papi.expansions.smallcaps;


import info.preva1l.trashcan.util.Tuple;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CharacterMap {
    public static List<info.preva1l.trashcan.util.Tuple<String, String>> characters = List.of();

    static {
        //                                                    Left        Right
        characters.add(info.preva1l.trashcan.util.Tuple.of("ᴀ", "a")); // 0
        characters.add(info.preva1l.trashcan.util.Tuple.of("ʙ", "b")); // 1
        characters.add(info.preva1l.trashcan.util.Tuple.of("ᴄ", "c")); // 2
        characters.add(info.preva1l.trashcan.util.Tuple.of("ᴅ", "d")); // 3
        characters.add(info.preva1l.trashcan.util.Tuple.of("ᴇ", "e")); // 4
        characters.add(info.preva1l.trashcan.util.Tuple.of("ꜰ", "f")); // 5
        characters.add(info.preva1l.trashcan.util.Tuple.of("ɢ", "g")); // 6
        characters.add(info.preva1l.trashcan.util.Tuple.of("ʜ", "h")); // 7
        characters.add(info.preva1l.trashcan.util.Tuple.of("ɪ", "i")); // 8
        characters.add(info.preva1l.trashcan.util.Tuple.of("ᴊ", "j")); // 9
        characters.add(info.preva1l.trashcan.util.Tuple.of("ᴋ", "k")); // 10
        characters.add(info.preva1l.trashcan.util.Tuple.of("ʟ", "l")); // 11
        characters.add(info.preva1l.trashcan.util.Tuple.of("ᴍ", "m")); // 12
        characters.add(info.preva1l.trashcan.util.Tuple.of("ɴ", "n")); // 13
        characters.add(info.preva1l.trashcan.util.Tuple.of("ᴏ", "o")); // 14
        characters.add(info.preva1l.trashcan.util.Tuple.of("ᴘ", "p")); // 15
        characters.add(info.preva1l.trashcan.util.Tuple.of("ǫ", "q")); // 16
        characters.add(info.preva1l.trashcan.util.Tuple.of("ʀ", "r")); // 17
        characters.add(info.preva1l.trashcan.util.Tuple.of("s", "s")); // 18
        characters.add(info.preva1l.trashcan.util.Tuple.of("ᴛ", "t")); // 19
        characters.add(info.preva1l.trashcan.util.Tuple.of("ᴜ", "u")); // 20
        characters.add(info.preva1l.trashcan.util.Tuple.of("ᴠ", "v")); // 21
        characters.add(info.preva1l.trashcan.util.Tuple.of("ᴡ", "w")); // 22
        characters.add(info.preva1l.trashcan.util.Tuple.of("x", "x")); // 23
        characters.add(info.preva1l.trashcan.util.Tuple.of("ʏ", "y")); // 24
        characters.add(info.preva1l.trashcan.util.Tuple.of("ᴢ", "z")); // 25
    }

     public static String get(boolean first, int index) {
        Preconditions.checkElementIndex(index, 25);
        Tuple<String, String> tuple = characters.get(index);
        return first ? tuple.first() : tuple.second();
    }

    public static Integer indexOf(@NotNull Character character) {
        for (int i = 0; i < characters.size(); i++) {
            Tuple<String, String> t = characters.get(i);
            if (t.first().equals(character.toString()) || t.second().equals(character.toString())) {
                return i;
            }
       }
       return -1;
    }
}
