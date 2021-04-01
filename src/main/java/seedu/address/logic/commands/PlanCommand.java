package seedu.address.logic.commands;

import static seedu.address.logic.parser.CliSyntax.PREFIX_INSURANCE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_CLEAR;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

/**
 * Represents a command involving an insurance plan.
 */
public abstract class PlanCommand extends Command {

    public static final String COMMAND_WORD = "plan";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Adds/remove an insurance plan of the client identified by the "
            + "index number used in the displayed client list.\n\n"
            + "Add plan:\n"
            + "Parameters: INDEX (must be a positive integer) "
            + PREFIX_INSURANCE + "PLAN_NAME $PREMIUM (must be a positive integer)\n"
            + "Example: " + COMMAND_WORD + " 3 " + PREFIX_INSURANCE + "Protecc $4000\n\n"
            + "Remove plan:\n"
            + "Parameters: INDEX (must be a positive integer) "
            + PREFIX_CLEAR + "PLAN_INDEX (must be a positive integer)\n"
            + "Example: " + COMMAND_WORD + " 2 " + PREFIX_CLEAR + "3";

    private final Index targetIndex;

    /**
     * Constructor for PlanCommand
     */
    public PlanCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
    }

    public Index getTargetIndex() {
        return targetIndex;
    }

    public abstract CommandResult execute(Model model) throws CommandException;
}
