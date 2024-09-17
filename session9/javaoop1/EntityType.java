package ro.siit.session9.javaoop1;

public class EntityType /*extends Object*/{
    private int no;
    private String prop = "no value set!";
    public static void main(String[] args) {
        EntityType entityType1 = new EntityType(2);
//        entityType.no = 1;
//        entityType.prop = "Some value";
        System.out.println(entityType1.toString());

        EntityType entityType2 = new EntityType(2);
        System.out.println(entityType2);

        EntityType entityType3 = new EntityType(3, "Value was set");
        System.out.println(entityType3);

        entityType3 = entityType1;
    }


//    public EntityType(){
//        this.no = -1;
//        this.prop = "no value selected";
//    }

//    public EntityType(){
//        this(-1, "no value selected");
//    }

//    public EntityType(int no){
//        this.no = no;
//        this.prop = "Some value";
//    }

    public EntityType(int no){
        this(no, "Some value");
    }

    public EntityType(int no, String prop) {
        this.no = no;
        this.prop = prop;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EntityType{");
        sb.append("no=").append(no);
        sb.append(", prop='").append(prop).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
