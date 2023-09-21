public class Ciao {
    private String str;

    public Ciao(){
        str = "Davide Frattesi";
    }

    @Override
    public String toString() {
        return "{" +
                "str='" + str + '\'' +
                '}';
    }
}
