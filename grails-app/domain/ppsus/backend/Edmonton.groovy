package ppsus.backend

import java.sql.Time

class Edmonton {
    Integer id
    Date date
    Time init //time ou date?
    Time end //time ou date?
    Integer cognition //Q1
    Integer healthStateA //Q2
    Integer healthStateB //Q2
    Integer indFunc
    Integer socialSup //Q4
    Integer medicineA //Q5
    Integer medicineB //Q5
    Integer nutricion //Q6
    Integer humor //Q7
    Integer continence //Q8
    Integer performance //Q9
    Patient patient

    static belongsTo = [
            User
    ]
    static constraints = {
    }
}
