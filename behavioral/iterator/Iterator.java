package behavioral.iterator;

public interface Iterator {
    public void first();
    public String next();
    public boolean isDone();
    public String currentItem();
}