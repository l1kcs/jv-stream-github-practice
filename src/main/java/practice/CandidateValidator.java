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
                && candidate.getPeriodInUkraine() >= TIME_THRESHOLD;
    }

    @Override
    public Predicate<Candidate> and(Predicate<? super Candidate> other) {
        return Predicate.super.and(other);
    }

    @Override
    public Predicate<Candidate> negate() {
        return Predicate.super.negate();
    }

    @Override
    public Predicate<Candidate> or(Predicate<? super Candidate> other) {
        return Predicate.super.or(other);
    }

    //write your code here
}
