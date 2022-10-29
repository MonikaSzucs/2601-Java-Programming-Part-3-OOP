/**
 * Functional interface
 */
@FunctionalInterface
interface Quizzable {

    /**
     *
     * @param x the first integer passed
     * @param y the second integer passed
     * @param z the third integer passed
     * @return the string of the three values
     */
    String makeQuestion(int x, int y, int z);
}
