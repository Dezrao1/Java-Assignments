// Segregated interfaces - each with a specific responsibility
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface MeetingAttendable {
    void attendMeeting();
}

interface Codable {
    void writeCode();
}

interface Designable {
    void design();
}

// OfficeWorker only implements relevant interfaces
class OfficeWorker implements Workable, Eatable, MeetingAttendable {
    @Override
    public void work() {
        System.out.println("Doing office work");
    }

    @Override
    public void eat() {
        System.out.println("Eating at the cafeteria");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Attending meetings");
    }
}

// Developer implements only what it needs
class Developer implements Workable, Eatable, Codable {
    @Override
    public void work() {
        System.out.println("Developing software");
    }

    @Override
    public void eat() {
        System.out.println("Eating while coding");
    }

    @Override
    public void writeCode() {
        System.out.println("Writing clean code");
    }
}

// Designer implements only what it needs
class Designer implements Workable, Eatable, Designable {
    @Override
    public void work() {
        System.out.println("Creating designs");
    }

    @Override
    public void eat() {
        System.out.println("Eating while designing");
    }

    @Override
    public void design() {
        System.out.println("Designing beautiful interfaces");
    }
}
