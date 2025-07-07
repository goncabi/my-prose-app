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

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Unit tests for the SimpleSentence class.
 */
public class SimpleSentenceTest {
    private SimpleSentence sentence;

    @Before
    public void setUp() {
        sentence = null;
    }

    @After
    public void tearDown() {
        sentence = null;
    }

    /**
     * Test the constructor with a text parameter
     */
    @Test
    public void testConstructorWithText() {
        String input = "Dies ist ein Test.";
        sentence = new SimpleSentence(input);
        assertNotNull("Sentence should not be null", sentence);
        assertEquals("Sentence text should match input", input, sentence.get());
    }

    /**
     * Test the constructor with null
     */
    @Test
    public void testConstructorWithNull() {
        sentence = new SimpleSentence(null);
        assertNotNull("Sentence should not be null", sentence);
        assertNull("Sentence text should be null when input is null", sentence.get());
    }

    /**
     * Test the default constructor
     */
    @Test
    public void testDefaultConstructor() {
        sentence = new SimpleSentence();
        assertNotNull("Sentence should not be null", sentence);
        assertEquals("Default text should be set", "Hallo, das ist ein einfacher Satz.", sentence.get());
    }
}
