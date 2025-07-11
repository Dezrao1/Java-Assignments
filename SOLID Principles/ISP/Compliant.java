// Violates ISP - One large interface forcing implementers to provide empty implementations
interface Worker {
    void work();
    void eat();
    void attendMeeting();
    void writeCode();
    void design();
}

// OfficeWorker implements all methods, but some are not relevant
class OfficeWorker implements Worker {
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

    @Override
    public void writeCode() {
        // Not all office workers code - forced empty implementation
    }

    @Override
    public void design() {
        // Not all office workers design - forced empty implementation
    }
}

// Developer implements all methods, but some are not relevant
class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("Developing software");
    }

    @Override
    public void eat() {
        System.out.println("Eating while coding");
    }

    @Override
    public void attendMeeting() {
        // Developers might not attend many meetings - forced implementation
        System.out.println("Reluctantly attending meeting");
    }

    @Override
    public void writeCode() {
        System.out.println("Writing clean code");
    }

    @Override
    public void design() {
        // Not all developers design - forced empty implementation
    }
}
