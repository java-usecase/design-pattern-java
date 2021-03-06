package com.designpattern.cases.behavior.interpreter4AST.syntaxtree;

import com.designpattern.cases.behavior.interpreter4AST.Context;

import java.math.BigDecimal;

public class SubtractNode extends OperatorNode implements Node {

    public SubtractNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    protected String getOperator() {
        return "-";
    }

    @Override
    public BigDecimal calculate(Context context) {
        return left.calculate(context).subtract(right.calculate(context));
    }
}
