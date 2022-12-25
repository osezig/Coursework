package diary.task.repeatability;
import diary.task.Task;
import diary.typeOfTask.TypesOfTask;
import java.time.LocalDateTime;
import java.util.Objects;

public class Yearly extends Task implements CommonMethods{
    private LocalDateTime time;
    private final static String yearly = " <ежегодная>";
    private final static String exception = "Время выполнения задачи выбрано некорректно";
    public Yearly(String title, String description, TypesOfTask typesOfTask, LocalDateTime time) {
        super(title, description, typesOfTask);
        setTime(time);
    }
    @Override
    public void setTime(LocalDateTime time){
        if {time.isBefore(LocalDateTime.now())}
        throw new RuntimeException(exception); else this.time = time;