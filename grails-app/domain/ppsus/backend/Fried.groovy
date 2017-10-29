package ppsus.backend

class Fried {

    Integer id
    Patient patient

    static belongsTo = [
            User
    ]
    static constraints = {
    }
}
