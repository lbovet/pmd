/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.perl.cpd;

import org.junit.jupiter.api.Test;

import net.sourceforge.pmd.cpd.test.CpdTextComparisonTest;

/**
 *
 */
class PerlCpdLexerTest extends CpdTextComparisonTest {

    PerlCpdLexerTest() {
        super("perl", ".pl");
    }

    @Test
    void testSample() {
        doTest("sample");
    }
}
