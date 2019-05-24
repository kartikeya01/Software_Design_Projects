// Assignment 03
// CSC 221 Sec R - Software Design Lab
// Professor: Kanchan Gondiker
// Name: Kartikeya Sharma

import java.util.Comparator;

public class sortByDirector implements Comparator {

    @Override
    public int compare(Object item1, Object item2) {
        if(item1 instanceof Video && item2 instanceof Video) {
            Video video1 = (Video) item1;
            Video video2 = (Video) item2;
            return video1.compareTo(video2);
        }
        return 0;
    }
}