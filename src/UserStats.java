import java.util.Optional;

public class UserStats {
    Optional<Long> visitCount;
    public UserStats(Long visitCount) {
        this.visitCount = Optional.of(visitCount);
    }

    public Optional<Long> getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Optional<Long> visitCount) {
        this.visitCount = visitCount;
    }
}
