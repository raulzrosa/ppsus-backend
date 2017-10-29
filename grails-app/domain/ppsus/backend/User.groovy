package ppsus.backend

class User {

    Integer id
    String name
    String login
    String password
    Integer permission

    char tipo

    static hasMany = [
            subjective: Subjective,
            edmonton: Edmonton,
            fried: Fried
    ]
    static belongsTo = [
            healthCenter: HealthCenter
    ]
    static constraints = {

    }
}
