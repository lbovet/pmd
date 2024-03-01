/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.plsql.ast;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import net.sourceforge.pmd.lang.plsql.AbstractPLSQLParserTst;

class ViewTest extends AbstractPLSQLParserTst {

    @Test
    void parseCreateViewIssue981() {
        plsql.parseResource("ViewIssue981.pls");
    }

    @Test
    void parseCreateView() {
        ASTInput input = plsql.parseResource("CreateViewWithSubquery.pls");
        List<ASTView> selectStatements = input.descendants(ASTView.class).toList();
        assertEquals(2, selectStatements.size());
    }

    @Test
    void parseCreateViewWithoutSemicolon() {
        plsql.parseResource("QueryWithoutSemicolon.sql");
    }
}
