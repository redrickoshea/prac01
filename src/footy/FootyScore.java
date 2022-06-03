package footy;

public class FootyScore {
    private int goals = 0;
    private int behinds = 0;

    public int getPoints() {
        return((goals * 6) + behinds);
    }

    public void kickGoal(){
        goals++;
    }

    public void kickBehind(){
        behinds++;
    }

    public String sayScore(){
        return(Integer.toString(goals) + ", " +
                Integer.toString(behinds) + ", " +
                Integer.toString(getPoints()));
    }

    public Boolean inFrontOf(FootyScore otherTeam){
        if(getPoints() > otherTeam.getPoints()){
            return true;
        }
        else{
            return false;
        }
    }
}
