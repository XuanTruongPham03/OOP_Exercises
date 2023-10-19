package Week8.Exception1;

public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public BinaryExpression() {
    }

    public Expression left() {
        return left;
    }

    public Expression right() {
        return right;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public abstract String toString();

    @Override
    public abstract double evaluate();
}
