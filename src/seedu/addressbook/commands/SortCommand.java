package seedu.addressbook.commands;


/**
 * Sorts the address book
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Sorts the list by person's name";


    public static final String MESSAGE_SUCCESS = "Sorted!";


    @Override
    public CommandResult execute() {
        addressBook.sort();
        return new CommandResult(MESSAGE_SUCCESS);
    }

}
