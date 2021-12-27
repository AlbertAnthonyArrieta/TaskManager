import java.util.ArrayList;
import java.util.Iterator;

public class Team {
    public ArrayList<Person> team = new ArrayList<Person>();

    public Team(){
        //NULL CONSTRUCTOR
    }

    public void addMember(Person m) {
        team.add(m);
    }

    public void removeMember(String name) {
        for (Iterator<Person> it = team.iterator(); it.hasNext(); ) {
            Person m = it.next();
            if (m.getName().equals(name))
                it.remove();
        }
    }

    public Person getMember(String name) {
        Person thisMember = new Person();
        for (Person m : team) {
            if (m.getName() == name)
                thisMember = m;
        }
        return thisMember;
    }

    public void displayMembers() {
        for (Person m : team) {
            System.out.println("===");
            System.out.println("NAME: " + m.getName());
        }
    }
}
