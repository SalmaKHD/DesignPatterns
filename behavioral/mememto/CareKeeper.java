package behavioral.mememto;

import java.util.ArrayList;

public class CareKeeper {

    private ArrayList<Memento> mememtoList = new ArrayList<>();
    public void saveState(Memento memento) {
        mememtoList.add(memento);
    }

    public Memento getState(int position) {
       return mememtoList.get(position);
    }
}
