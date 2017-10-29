package ppsus.backend

class HealthCenter {
    Integer id
    String name
    String address
    String neighborhood
    Integer number
    Integer cep
    Integer phone

    static hasMany = [
            users: User
    ]
    static constraints = {
    }

}
