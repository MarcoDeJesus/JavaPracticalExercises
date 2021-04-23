package annotations;

import java.lang.annotation.Target;

public interface Pet {
    public abstract int breed();

    public default Pet callPet(){
        return this;
    }

    //@Deprecated(forRemoval = true)
    void speak();
}
