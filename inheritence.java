class animal{
    protected String name;
    protected int age;
    protected double weight;
    protected String breed;
    
    // perameterise constructor 
    public animal(String name,int age,double weight,String breed){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.breed=breed;
    }
}
class dog extends animal{
    private String colour;
    private String type;
    // perameritise constructor
    public dog(String name,int age,double weight,String breed,String colour,String type){
        super(name,age,weight,breed);
        this.colour=colour;
        this.type=type;
    }
    @Override
    public String toString() {
        return "dog [name=" + name + ", age=" + age + ", weight=" + weight + ", breed=" + breed + ", colour=" + colour
                + ", type=" + type + "]";
    }
}
class cat extends animal{
    private String colour;
    private String type;
    //
    public cat(String name, int age, double weight, String breed, String colour, String type) {
        super(name, age, weight, breed);
        this.colour = colour;
        this.type = type;
    }
    @Override
    public String toString() {
        return "cat [name=" + name + ", age=" + age + ", weight=" + weight + ", breed=" + breed + ", colour=" + colour
                + ", type=" + type + "]";
    }
}
class inheritence{
    public static void main(String[] args) {
        dog d = new dog("Buddy", 3, 25.0, "Golden Retriever", "Golden", "Family Dog");
        cat c = new cat("Whiskers", 2, 10.0, "Siamese", "White", "Indoor Cat");
        System.out.println(d);
        System.out.println(c);
    }
}