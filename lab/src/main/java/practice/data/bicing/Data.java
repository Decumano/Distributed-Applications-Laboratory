package practice.data.bicing;

public class Data {
    private Stations data;

    public Data(){
    }

    public Data(Stations s)
    {
        data = s;
    }

    public Stations getData() {
        return data;
    }

    public void setData(Stations data) {
        this.data = data;
    }
}
