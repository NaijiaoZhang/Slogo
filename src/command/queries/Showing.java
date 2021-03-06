package command.queries;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import command.AbstractCommand;
import command.CursorCommand;
import command.utility.Variable;
import cursor.Cursor;
import cursor.Coordinate;

//TODO - use more lambdas
public class Showing extends CursorCommand {
    public static final int MY_NUMBER_OF_COMMAND_PARAMETERS = 0;
    
    public Showing (Map<String, Variable> variableMap, List<AbstractCommand> inputs, Cursor cursor) {
        super(variableMap, inputs, cursor);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double execute() {
        return getCursor().getIsVisible() ? 1 : 0;
    }
    
}
