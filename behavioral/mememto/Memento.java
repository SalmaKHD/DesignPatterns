package behavioral.mememto;

 class Memento {
    int lastState;
    public Memento(int lastState) {
        this.lastState = lastState;
    }
    public void addState(int state){
        lastState = state;
    }
    public int getState() {
        return lastState;
    }
}
