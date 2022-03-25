package state;

// Yoav Amit

public class State implements Comparable<State>
{
    private String stateName;
    private String stateCapital;
    private String stateFlower;
    private String stateBird;
    private int statePopulation;

    public State()
    {
        stateName = "";
        stateCapital = "";
        stateFlower = "";
        stateBird = "";
        statePopulation = 0;
    }

    public State(String sn, String sc, String sf, String sb, int sp)
    {
        stateName = sn;
        stateCapital = sc;
        stateFlower = sf;
        stateBird = sb;
        statePopulation = sp;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateCapital() {
        return stateCapital;
    }

    public void setStateCapital(String stateCapital) {
        this.stateCapital = stateCapital;
    }

    public String getStateFlower() {
        return stateFlower;
    }

    public void setStateFlower(String stateFlower) {
        this.stateFlower = stateFlower;
    }

    public String getStateBird() {
        return stateBird;
    }

    public void setStateBird(String stateBird) {
        this.stateBird = stateBird;
    }

    public int getStatePopulation() {
        return statePopulation;
    }

    public void setStatePopulation(int statePopulation) {
        if (statePopulation < 0)
        {
            IllegalArgumentException e = new IllegalArgumentException("Population can't be less than 0");
            throw e;
        }
        else
            this.statePopulation = statePopulation;
    }

    public String toString() {
        String ans = "state.State Name: " + stateName + ", state.State Capital: " + stateCapital + ", state.State Flower: " +
                stateFlower + ", state.State Bird: " + stateBird + ", state.State Population: " + statePopulation + "\n";
        return ans;
    }

    public boolean equals(Object s) {
        return stateName.equals(((State)s).getStateName());
        //return (compareTo((person.Person) o) == 0);
    }

    public int compareTo(State s) {
        return stateName.compareTo(s.getStateName());
    }
}
