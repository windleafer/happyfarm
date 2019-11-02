package people.owner.command;

import people.employee.Farmer;
import room.Field;

public class FarmerWorkCommand implements Command {

    private Farmer person;
    private Field field;
    FarmerWorkCommand(Farmer p,Field field){
        this.person=p;
        this.field=field;
    }
    @Override
    public void execute(){
        person.work(field);
    }

}
