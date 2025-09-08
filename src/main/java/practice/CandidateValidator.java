package practice;

import java.util.function.Predicate;
import model.Candidate;

public class CandidateValidator implements Predicate<Candidate> {
    private static final int AGE_THRESHOLD = 35;
    private static final String REQUIRED_NATIONALITY = "Ukrainian";
    private static final int TIME_THRESHOLD = 10;

    @Override
    public boolean test(Candidate candidate) {
        return candidate.getAge() >= AGE_THRESHOLD
                && candidate.isAllowedToVote()
                && candidate.getNationality().equals(REQUIRED_NATIONALITY)
                && candidate.getTimeInUkraine() >= TIME_THRESHOLD;
    }

    private boolean checkTimeLivingInCountry(Candidate candidate) {
        String[] dates = candidate.getPeriodsInUkr().split(SEPARATOR);
        return Integer.parseInt(dates[END_INDEX])
                - Integer.parseInt(dates[BEGIN_INDEX]) >= PERIOD_IN_UKR;
    }
    //write your code here
}
