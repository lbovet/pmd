/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.statement.VariableDeclarationStatements;

public final class ASTVariableDeclarationStatements extends AbstractApexNode<VariableDeclarationStatements> {

    ASTVariableDeclarationStatements(VariableDeclarationStatements variableDeclarationStatements) {
        super(variableDeclarationStatements);
    }


    @Override
    protected <P, R> R acceptApexVisitor(ApexVisitor<? super P, ? extends R> visitor, P data) {
        return visitor.visit(this, data);
    }

    public ASTModifierNode getModifiers() {
        return firstChild(ASTModifierNode.class);
    }
}
