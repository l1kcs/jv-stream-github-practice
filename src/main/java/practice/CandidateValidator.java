package practice;

import java.util.function.Predicate;
import model.Candidate;

public class CandidateValidator implements Predicate<Candidate> {

    @Override
    public boolean test(Candidate candidate) {
        return candidate.getAge() >= 35
                && candidate.isAllowedToVote()
                && candidate.getNationality().equals("Ukrainian")
                && candidate.getTimeInUkraine() >= 10;
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
