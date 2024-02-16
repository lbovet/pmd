/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.plsql.ast;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import net.sourceforge.pmd.lang.plsql.AbstractPLSQLParserTst;

class ForAllTest extends AbstractPLSQLParserTst {

    @Test
    void testForAll() {
        ASTInput input = plsql.parseResource("ForAll.pls");

        List<ASTForAllStatement> statements = input.descendants(ASTForAllStatement.class).toList();
        assertEquals(2, statements.size());

        assertNotNull(statements.get(0).descendants(ASTDeleteStatement.class).first());

        assertNotNull(statements.get(1).descendants(ASTInsertStatement.class).first());
    }
}
