package dev.colbster937.papi.expansions.smallcaps;

import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

/**
 *
 * @author TurboMaxe
 * @since 3/17/2026
 */

public class Caps {

    /**
     * Return a new string with normal characters replaced with small caps.
     *
     * @param s the string that is to be replaced
     * @return the string with small caps font
     */

    public String of(@NotNull String s) {
      StringBuilder o = new StringBuilder(s.length());
      Stream.of(s.toCharArray()).forEach(character -> {
           CharacterMap.characters.stream().filter(tuple -> {
               tuple.second().equals(character);
               o.append(tuple.first());
               return true;
           });
        });
       return o.toString();
    }

    /**
     * Return a character with small caps.
     *
     * @param character the character with normal font
     * @return the string with small caps font
     */

    public String of(@NotNull Character character) {
    String a = "";
       CharacterMap.characters.stream().filter(tuple -> {
           tuple.second().equals(character);
           a.replace("", tuple.first());
           return true;
       });
       return a;
    }

    /**
     * Unescapes small caps
     *
     * @param string The string with small caps
     * @return the unescaped string
     */

    public String escape(@NotNull String string) {
        String a = "";
        StringBuilder o = new StringBuilder(string.length());
        Stream.of(string.toCharArray()).forEach(character -> {
            CharacterMap.characters.stream().filter(tuple -> {
                tuple.first().equals(character);
                o.append(tuple.second());
                return true;
            });
        });
        return o.toString();
    }
}
