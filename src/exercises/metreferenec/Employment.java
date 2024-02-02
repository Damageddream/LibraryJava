package exercises.metreferenec;

enum Employment {
    FULL_TIME, PART_TIME, CONTRACT;
    boolean checkEmployeeEmployment(Employee e){
        return this == e.getEmployment();
    }

}