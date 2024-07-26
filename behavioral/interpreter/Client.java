package behavioral.interpreter;

public class Client {
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getFemaleExpression() {
        Expression jully = new TerminalExpression("Jully");
        Expression Saba = new TerminalExpression("Saba");
        return new OrExpression(jully, Saba);
    }
    public static void main(String[] args) {
        // create expression for evaluating
        Expression isMale = getMaleExpression();
        Expression isFemale = getFemaleExpression();
        // create context for defining the rules for evaluating the constrcuted expression
        Context context = new Context("John");
        System.out.println("John is male: " + isMale.interpret(context));
        // interpret this expression based on the given context
        System.out.println("John is female" + isFemale.interpret(context));
        /*
        OUTPUT:
        John is male: true
        John is femalefalse 
        */
    }
}