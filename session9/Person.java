package ro.siit.session9;

public class Person {
    private String name;

    String salutation;
    private String IBAN;

    public Person(String name){
        this.name = name;
    }

    public Person(){
        this.name = "John Doe";
    }

    public void setName(String name) {
        if(name.length() < 3) {
            name += "*";
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFullName(String countryCode){
        if("ro".equalsIgnoreCase(countryCode)){
            return "dl" + " "  + name;
        } else {
            return "mr." + " " + name;
        }
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getIBAN() {
        return IBAN;
    }

    String printIban(){
        StringBuilder sb = new StringBuilder("*****");
        sb.append(getIBAN().substring(5));
        return sb.toString(); // "*****".concat(getIBAN().substring(5));
    }
}
