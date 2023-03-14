public class Toys {
    private int id;
    private String name;
    private int count;
    private int frequency;


    public Toys(int id, String name, int count, int frequency) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.frequency = frequency;
    }


    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "id=" + id +", name='" + name + '\'' + ", count=" + count + ", frequency=" + frequency;
    }
}
