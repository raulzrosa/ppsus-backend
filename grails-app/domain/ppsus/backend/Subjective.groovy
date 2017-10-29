package ppsus.backend

class Subjective {


    Integer id
    Date date
    Date init
    Date end
    Integer lostWeight //Q1
    Double lostWeightKg //Q1
    Integer physicalActivity //Q2
    Integer strength //Q3
    Integer walking //Q4
    Integer fatigue //Q5
    Integer dismay //Q6
    Patient patient

    static belongsTo = [
            User
    ]

    static constraints = {
        lostWeightKg scale: 2

    }
}
