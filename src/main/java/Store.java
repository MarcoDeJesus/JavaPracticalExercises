import annotations.CustomAnnotation;

public class Store {
    public String desc;

    @CustomAnnotation(owner="Marco", count=150)
    public Store(String desc){
        this.desc = desc;
    }
}
