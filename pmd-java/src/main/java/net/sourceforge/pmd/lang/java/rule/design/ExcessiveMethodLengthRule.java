/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.rule.design;

import net.sourceforge.pmd.lang.java.ast.ASTExecutableDeclaration;
import net.sourceforge.pmd.lang.java.rule.internal.AbstractJavaCounterCheckRule;


/**
 * This rule detects when a method exceeds a certain threshold. i.e. if a method
 * has more than x lines of code.
 *
 * @deprecated Use {@link NcssCountRule} instead.
 */
@Deprecated
public class ExcessiveMethodLengthRule extends AbstractJavaCounterCheckRule.AbstractLineLengthCheckRule<ASTExecutableDeclaration> {
    public ExcessiveMethodLengthRule() {
        super(ASTExecutableDeclaration.class);
    }

    @Override
    protected int defaultReportLevel() {
        return 100;
    }
}
