package ppsus.backend

class Edmonton {
    Integer id
    Patient patient

    static belongsTo = [
            User
    ]
    static constraints = {
    }
}
