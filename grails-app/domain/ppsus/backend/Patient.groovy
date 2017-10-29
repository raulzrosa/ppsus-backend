package ppsus.backend

class Patient {

    Integer id
    String name
    String cpf
    Date birthday

    static hasOne = [
            subjective: Subjective,
            edmonton: Edmonton,
            fried: Fried
    ]
    static constraints = {
        name maxSize: 100
        cpf size: 11..11, unique: true, blank: false
    }
}
