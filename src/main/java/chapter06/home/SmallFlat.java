package chapter06.home;

public class SmallFlat extends Flat {
    public int getFloors() {
        return super.getFloors();
    }

    @Override
    protected void setFloors(int floors) {
        super.setFloors(floors);
    }
}
