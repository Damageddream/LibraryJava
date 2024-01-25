package exercises.errorexcep;

public class Competition {
    private String name;
    private Participant[] participants;
    private int ageLimit;
    private int size;

    public Competition(String name, int maxParticipants, int ageLimit) {
        this.name = name;
        this.ageLimit = ageLimit;
        this.participants = new Participant[maxParticipants];
        this.size = 0;
    }

    void addParticipant(Participant participant) {
        if(participant.getAge() < this.ageLimit){
            throw new AgeViolationException("Zbyt niski wiek, wymagany wiek to "+ this.ageLimit);
        }
        if(this.participants.length <= size){
            throw new MaxCompetitorsException("W konkursie, jest już maksymalna liczba użytkownikó");
        }
        for (Participant participant1 : participants) {
            if(participant1 != null){
                if(participant1.getDocumentId().equals(participant.getDocumentId())){
                    throw new DuplicateException("Uczestnik jest już zapisany dok konkursu");
                }
            }

        }
        participants[size] = participant;
        size++;
    }

    boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zawody ")
                .append(name)
                .append("\n")
                .append("Liczba uczestników: ").append(size);
        for (int i = 0; i < size; i++) {
            builder.append("\n");
            builder.append(" > ");
            builder.append(participants[i].toString());
        }
        return builder.toString();
    }
}
