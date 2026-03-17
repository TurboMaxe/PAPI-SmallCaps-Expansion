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
       for (Character ch : s.toCharArray()) {
          o.append(CharacterMap.get(false, CharacterMap.indexOf(ch)));
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
       String a = "";
       CharacterMap.indexOf(character);
       return a;
    }

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
        for (Character character : string.toCharArray()) {
          o.append(CharacterMap.get(false, CharacterMap.indexOf(character)));
        }
        return o.toString();
    }
}
