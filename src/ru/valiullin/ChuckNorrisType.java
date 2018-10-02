package ru.valiullin;


public class ChuckNorrisType {
    private String type;
    private ChuckNorrisValue value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type.equalsIgnoreCase("success")){
            this.type = "забавную";
        } else {
            this.type = type;
        }
    }

    public ChuckNorrisValue getValue() {
        return value;
    }

    public void setValue(ChuckNorrisValue value) {
        this.value = value;
    }

    public ChuckNorrisType() {
    }

    public ChuckNorrisType(String type, ChuckNorrisValue value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "ChuckNorrisType{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
