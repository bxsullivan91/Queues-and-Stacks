import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskHelper
{
    Queue<String> tasks = new LinkedList<>();

    public static void main(String[] args)
    {
        TaskHelper taskHelper = new TaskHelper();
        taskHelper.run();
    }

    private void run()
    {
        Scanner in = new Scanner(System.in);

        printMenu();

        boolean fleeProgram = false;

        do
        {

            System.out.print("What would you like to do? Enter here: ");
            String commandLine;
            commandLine = in.nextLine();

            String[] words = commandLine.split(" ");

            String command = words[0];
            command = command.toUpperCase();
            try
            {
                switch (command)
                {
                    case "ADD":
                        addTask(words);
                        break;
                    case "PEEK":
                        peekAtNextTask();
                        break;
                    case "REMOVE":
                        removeNextTask();
                        break;
                    case "HOWMANY":
                        countTasks();
                        break;
                    case "FLEE":
                        clearTasks();
                        fleeProgram = true;
                        break;

                }
            } catch (Exception e)
            {
                System.out.println("Invalid user input");
            }
        } while (!fleeProgram);

    }

    private void printMenu()
    {
        System.out.println("Commands are: ");
        System.out.println("'Add' + 'task name' -> self-explanatory, really.");
        System.out.println("'Peek' -> looks for next task without removing it");
        System.out.println("'Remove' -> declares completion of next task on list");
        System.out.println("'HowMany' -> prints how many tasks are left to go!");
        System.out.println("'Flee' -> wipe out your list and run.... run as far as you can.");
        System.out.println();
    }

    private void addTask(String[] addedTask)
    {
        String taskName;

        for (int i = 1; i < addedTask.length; i++)
        {
            taskName = addedTask[i];
            tasks.add(taskName);
            System.out.println(taskName + " has been added to your ToDo list!");
        }


    }

    private void peekAtNextTask()
    {
        String secondToLast = "";
        String last = "";
        for(String taskName : tasks)
        {
            secondToLast = last;
            System.out.println(secondToLast);
            last = taskName;
            System.out.println(last);

        }
        /*String nextTask = tasks.peek();

        System.out.println("The next thing to do is: " + nextTask);*/
    }

    private void removeNextTask()
    {
        String removeTask = tasks.remove();

        System.out.println(removeTask + " COMPLETED");

        peekAtNextTask();
    }

    private void countTasks()
    {
        int taskSize = tasks.size();

        if (taskSize == 0)
        {
            System.out.println("Your are done with today's task!");
        }
        else if (taskSize == 1)
        {
            System.out.println("You have " + taskSize + " task to do today!");
        }
        else
        {
            System.out.println("You have " + taskSize + " tasks to do today!");
        }

    }

    private void clearTasks()
    {
        tasks.clear();

        System.out.println("RUN FOR YOUR LIFE");
    }
}
