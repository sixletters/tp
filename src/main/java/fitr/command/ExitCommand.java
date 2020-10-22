package fitr.command;

import fitr.Recommender;
import fitr.list.ExerciseList;
import fitr.list.FoodList;
import fitr.list.GoalList;
import fitr.storage.StorageManager;
import fitr.user.User;

import java.util.logging.Logger;

public class ExitCommand extends Command {
    private static final Logger LOGGER = Logger.getLogger(ExitCommand.class.getName());

    public ExitCommand(String command) {
        assert command != null;
        this.command = command;
    }

    @Override
    public void execute(FoodList foodList, ExerciseList exerciseList, StorageManager storageManager,
                        User user, GoalList goalList, Recommender recommender) {
        LOGGER.fine("Exiting the application.");
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
