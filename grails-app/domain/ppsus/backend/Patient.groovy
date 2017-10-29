package ppsus.backend

class Patient {

    static hasOne = [
            subjective: Subjective,
            edmonton: Edmonton,
            fried: Fried
    ]
    static constraints = {
    }
}
