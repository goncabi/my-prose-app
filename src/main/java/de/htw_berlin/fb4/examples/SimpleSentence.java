/*
 * My Prose App - A Java project demonstrating text composition
 * Copyright (c) 2025 Jana Maire
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package de.htw_berlin.fb4.examples;

import de.htw_berlin.fb4.ossd.prose.Sentence;
import de.htw_berlin.fb4.ossd.prose.Prose;

/**
 * A simple implementation of the Sentence interface.
 * This class represents a single sentence and provides functionality
 * to convert Prose objects into Sentence objects. It maintains its text content
 * and can be used as a building block in larger text compositions through
 * the ProseBuilder system.
 * 
 * @author Jana Maire
 * @version 1.0.0
 * @see de.htw_berlin.fb4.ossd.prose.Sentence
 * @see de.htw_berlin.fb4.ossd.prose.Prose
 */
public class SimpleSentence implements Sentence {
    private String text = "Hallo, das ist ein einfacher Satz.";

    /**
     * Converts a Prose object into a Sentence object.
     * This static factory method creates a new SimpleSentence instance
     * containing the text from the provided Prose object.
     * 
     * @param prose The Prose object to convert
     * @return A new Sentence object containing the text from the Prose object
     * @throws NullPointerException if the provided Prose object is null
     * @see de.htw_berlin.fb4.ossd.prose.Prose#get()
     */

public SimpleSentence() {
// Uses the default value already set in the field
} /**
     * Constructs a SimpleSentence with the given text.
     *
     * @param text The sentence text to be used
     */
 public SimpleSentence(String text) {
        this.text = text;
    }

    /**
     * Converts a Prose object into a Sentence object.
     * ...
     */

    public static Sentence toSentence(Prose prose) {
        SimpleSentence sentence = new SimpleSentence();
        sentence.text = prose.get();
        return sentence;
    }

    /**
     * Returns the text content of this sentence.
     * This method implements the {@link Sentence#get()} method from the Sentence interface.
     * The text content represents a single sentence that can be used in text composition.
     * 
     * @return The sentence text as a String
     */
    @Override
    public String get() {
        return text;
    }
}
