/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.statement.DmlUndeleteStatement;

public final class ASTDmlUndeleteStatement extends AbstractDmlStatement<DmlUndeleteStatement> {

    ASTDmlUndeleteStatement(DmlUndeleteStatement dmlUndeleteStatement) {
        super(dmlUndeleteStatement);
    }


    @Override
    protected <P, R> R acceptApexVisitor(ApexVisitor<? super P, ? extends R> visitor, P data) {
        return visitor.visit(this, data);
    }
}
