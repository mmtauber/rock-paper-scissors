package com.tauber.enums;

/**
 * Created by radar on 6/22/15.
 *
 * All classes implementing {@link com.tauber.strategy.GameStrategy} draw from this enum
 * to represent all possible 'moves' that can be made in the game.
 *
 */
public enum Action {

    ROCK,
    PAPER,
    SCISSORS;

    private Action beats;

    Action () {

    }

    /**
     * Relative to the calling instance, this method determines whether the calling instance
     * wins, loses, or experiences a tie, with respect to the first parameter.
     *
     * @param theirAction   the {@link Action} we want to compare
     * @return the {@link Outcome} returned is logically relative to the calling instance.
     */
    public Outcome isWinner(Action theirAction) {

        if (this.equals(theirAction)) {
            return Outcome.TIE;
        }

        switch (this) {
            case ROCK:
                setBeats(SCISSORS);
                break;
            case PAPER:
                setBeats(ROCK);
                break;
            case SCISSORS:
                setBeats(PAPER);
                break;
            default:
                throw new IllegalStateException("ERROR: There was a problem in determining a winner!");
        }

        // If this action beats 'theirAction'
        if (this.getBeats().equals(theirAction)) {
            return Outcome.WIN;
        }

        return Outcome.LOSE;

    }

    public Action getBeats() {
        return beats;
    }

    public void setBeats(Action beats) {
        this.beats = beats;
    }
}
