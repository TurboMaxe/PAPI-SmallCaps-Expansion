package dev.colbster937.papi.expansions.smallcaps;

import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 *
 * @author TurboMaxe
 * @since 3/17/2026
 */

@NoArgsConstructor
public class Caps {

    /**
     * Return a new string with normal characters replaced with small caps.
     *
     * @param s the string that is to be replaced
     * @return the string with small caps font
     */

    public String valueOf(@NotNull String s) {
       StringBuilder o = new StringBuilder(s.length());
       for (Character c : s.toCharArray()) {
         o.append(valueOf(c));
       }
       return o.toString();
    }

    /**
     * Return a character with small caps.
     *
     * @param character the character with normal font
     * @return the string with small caps font
     */

    public String valueOf(@NotNull Character character) {
       if (CharacterMap.indexOf(character) == -1) { return character.toString(); }
       else {
           return CharacterMap.get(true, CharacterMap.indexOf(character));
       }
    }

    /**
     * Return a string
     *
     * @param s The list of strings to be converted to smallcaps font
     * @return the string with small caps font
     */

    public String valueOf(@NotNull List<String> s) {
        return valueOf(String.join(" ", s));
    }


    /**
     * Unescapes small caps
     *
     * @param string The string with small caps
     * @return the unescaped string
     */

    public String escape(@NotNull String string) {
        StringBuilder o = new StringBuilder(string.length());
        for (Character c : string.toCharArray()) {
          o.append(escape(c));
        }
        return o.toString();
    }

    /**
     * Unescapes small caps
     *
     * @param character the small caps font character
     * @return unescaped char
     */

    public String escape(@NotNull Character character) {
        if (CharacterMap.indexOf(character) == -1) {
            return character.toString();
        }
        return CharacterMap.get(false, CharacterMap.indexOf(character));
    }
}



