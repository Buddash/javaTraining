package api.PetStore.Pojo.PogoForGetPetByID;

// TODO Заменить геттеры и сеттеры на аннотации
public class Category {

    private int id;
    private String name;

    public Category() {};

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}


