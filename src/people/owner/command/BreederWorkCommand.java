package people.owner.command;

import people.employee.Breeder;
import room.Accommodation;

public class BreederWorkCommand implements Command{
    private Breeder person;
    private Accommodation accommodation;
    BreederWorkCommand(Breeder p,Accommodation accommodation){
        this.person=p;
        this.accommodation=accommodation;
    }
    @Override
    public void execute(){
        person.work(accommodation);
    }
}
